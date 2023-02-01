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
import org.xtext.example.mydsl.myDsl.TypeJSON;
import org.xtext.example.mydsl.myDsl.TypeReference;
import org.xtext.example.mydsl.myDsl.TypeString;
import org.xtext.example.mydsl.myDsl.Add;
import org.xtext.example.mydsl.myDsl.Sort;
import org.xtext.example.mydsl.myDsl.TypeInt;
import org.xtext.example.mydsl.myDsl.Show;

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
		
		for(Fun s : sentences) {
			
			if( s instanceof ReadJson) {
				ReadJson r = (ReadJson) s;
				
				String FileName = r.getPath();
				VarName.add(FileName);
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
				TypeJSON data = w.getValue();
				EList<String> atts= data.getAttribute();
				EList<TypeReference> vals= data.getValue();
				List<String> v = new ArrayList<String>();
				for(TypeReference tr : vals) {
					if (tr instanceof TypeString) {
						TypeString ts = (TypeString) tr;
						String se = ts.getVal();
						v.add(se);
					}
					else if (tr instanceof TypeInt) {
						TypeInt ts = (TypeInt) tr;
						String re = "" + ts.getVal();
						v.add(re);
					}
				}
				int lenght=atts.size();
				
				
				JQCode+="jq -n ";
				for(int i=0;i<lenght;i++) {
					JQCode+="--arg "+atts.get(i)+" \""+v.get(i)+"\" "; 
					
				}
				JQCode+= " '$ARGS.named' >"+RegisterFileName+ "\n";
			}
			
			if(s instanceof WriteCSV) {
				WriteCSV w= (WriteCSV) s;
				
				String RegisterFileName= w.getPath();
				TypeJSON data = w.getValue();
				EList<String> atts= data.getAttribute();
				EList<TypeReference> vals= data.getValue();
				List<String> v = new ArrayList<String>();
				for(TypeReference tr : vals) {
					if (tr instanceof TypeString) {
						TypeString ts = (TypeString) tr;
						String se = ts.getVal();
						v.add(se);
					}
					else if (tr instanceof TypeInt) {
						TypeInt ts = (TypeInt) tr;
						String re = "" + ts.getVal();
						v.add(re);
					}
				}
				int lenght=atts.size();
				
				String JSONSTR= "{ ";
				for(int i=0;i<lenght;i++) {
					JSONSTR+="\"" + atts.get(i)+"\" : \""+v.get(i)+"\" , ";
					
				}
				JSONSTR+=" } ";
				
				JQCode+= " jq -n -r '["+JSONSTR+"] | .[] | to_entries | map(.value) | @csv' >" +RegisterFileName+"\n";
			
			}
			
			
			
			
			
		}
		
		
		
		String JQ_OUTPUT = "foo.sh";

		// or shorter
		Files.write(JQCode.getBytes(), new File(JQ_OUTPUT));
		
		
		Process p = Runtime.getRuntime().exec("bash "+ JQ_OUTPUT);
		
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
