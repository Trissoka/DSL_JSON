package org.xtext.example.mydsl.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.myDsl.Fun;
import org.xtext.example.mydsl.myDsl.Model;

import org.xtext.example.mydsl.myDsl.ReadJson;
import org.xtext.example.mydsl.myDsl.Remove;
import org.xtext.example.mydsl.myDsl.WriteCSV;
import org.xtext.example.mydsl.myDsl.WriteJson;
import org.xtext.example.mydsl.myDsl.JSON;
import org.xtext.example.mydsl.myDsl.Add;
import org.xtext.example.mydsl.myDsl.Sort;

import com.google.common.io.Files;

public class JQ_Compiler {
	
	private Model _model;
	
	JQ_Compiler(Model model){
		_model = model;
	}
	public String compileAndRun() throws IOException {
		
		//Code generation
		EList<Fun> sentences = _model.getSentences();

		// List du nom des variables
		List<String> VarName= new ArrayList<String>();
	
		String JQCode="";
		JQCode+=" #!/bin/bash \n";
		
		for(Fun s : sentences) {
			
			if( s instanceof ReadJson) {
				ReadJson r = (ReadJson) s;
				
				String FileName = r.getPath();
				VarName.add("Var"+VarName.size()+1);
			}
			
			if( s instanceof Show) {
				Show so = (Show) s;
				
				String Name = so.getName();
				if(Name!=null) {
					JQCode += " jq '.' "+Name+"\n"; 
				}else {
					JQCode += " jq '.' "+VarName.get(VarName.size()-1)+"\n"; 
				}	
			}
			
			if (s instanceof WriteJson) {
				WriteJson w = (WriteJson) s;
				
				String RegisterFileName= w.getPath();
				JSON data= w.getFile();
				EList<String> atts= data.getAttribute();
				EList<String> vals= data.getValue();
				int lenght=atts.size();
				
				
				JQCode+="jq -n";
				for(int i=0;i<lenght;i++) {
					JQCode+="--arg "+atts.get(i)+" \""+vals.get(i)+" "; 
					
				}
				JQCode+= ">"+RegisterFileName+ "\n";
			}
			
			if(s instanceof WriteCSV) {
				WriteCSV w= (WriteCSV) s;
				
				String RegisterFileName= w.getPath();
				JSON data= w.getFile();
				EList<String> atts= data.getAttribute();
				EList<String> vals= data.getValue();
				int lenght=atts.size();
				
				String JSONSTR= "{ ";
				for(int i=0;i<lenght;i++) {
					JSONSTR+=atts.get(i)+" : "+vals.get(i)+" , ";
					
				}
				JSONSTR+=" } ";
				
				JQCode+= "echo '"+JSONSTR+"' |js -r '. | @csv' >"+RegisterFileName+"\n";
			}
			
			
			
			
			
		}
		
		
		
		String JQ_OUTPUT = "foo.sh";

		// or shorter
		Files.write(JQCode.getBytes(), new File(JQ_OUTPUT));
		
		
		Process p = Runtime.getRuntime().exec("./ "+ JQ_OUTPUT);
		
		// output
		BufferedReader stdInput = new BufferedReader(new
				InputStreamReader(p.getInputStream()));
		
		// error
		BufferedReader stdError = new BufferedReader(new
				InputStreamReader(p.getErrorStream()));
		
		
	    String o;
		while ((o = stdInput.readLine()) != null) {
	        System.out.println(o);
	    }
	    
		String err; 
		while ((err = stdError.readLine()) != null) {
	        System.out.println(err);
	    }
		
		return o;
		
	}

}
