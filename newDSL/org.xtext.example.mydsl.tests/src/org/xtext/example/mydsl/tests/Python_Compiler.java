package org.xtext.example.mydsl.tests;

import java.awt.image.DataBuffer;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.myDsl.Fun;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.ReadJson;
import org.xtext.example.mydsl.myDsl.WriteCSV;
import org.xtext.example.mydsl.myDsl.WriteJson;
import org.xtext.example.mydsl.myDsl.JSON;

import com.google.common.io.Files;

public class Python_Compiler {
	private Model _model;
	
	Python_Compiler(Model model){
		_model = model;
	}
	public void compileAndRun() throws IOException {
		
		//Code generation
		EList<Fun> sentences = _model.getSentences();
		//String fileName = "";
		String pythonCode="";
		pythonCode+="import pandas as pd\n"
				+ "import json \n";
		boolean HaveReadJSON=false;
		for(Fun s : sentences) {
			
			if (s instanceof ReadJson) {
				
				ReadJson r = (ReadJson) s;
				// r.get
				String fileName = r.getPath();
				pythonCode+="df = pd.read_json(\""+fileName+"\")\n";
				HaveReadJSON=true;
			}
			
			if(s instanceof WriteJson) {
				WriteJson r =(WriteJson) s;
				
				String RegisterFileName = r.getPath();
				
				JSON data = r.getFile();
				EList<String> atts= data.getAttribute();
				EList<String> vals= data.getValue();
				int lenght=atts.size();
				pythonCode+="json.dump({";
				for(int i=0;i<lenght;i++) {
					pythonCode+=atts.get(i)+":"+vals.get(i)+",";
					
				}
				pythonCode+="},"+RegisterFileName+")\n";
				
			}
			if(s instanceof WriteCSV) {
				WriteCSV w=(WriteCSV) s;
				
				String RegisterFileName= w.getPath();
				JSON data= w.getFile();
				EList<String> atts= data.getAttribute();
				EList<String> vals= data.getValue();
				int lenght=atts.size();
				
				//pythonCode+="df2 = pd.read_json(jsonStr, orient ='index')";
				
				String JSONSTR= "{";
				for(int i=0;i<lenght;i++) {
					JSONSTR+=atts.get(i)+":"+vals.get(i)+",";
					
				}
				JSONSTR+="}";
				
				pythonCode+="df = pd.read_json("+JSONSTR+", orient ='index')";
			}
		}
		
		//pythonCode += "print(df)";
		// serialize code into Python filename
		String PYTHON_OUTPUT = "foo.py";
		/*
		 * FinalWriter fw = new FileWriter(PYTHOn_OUTPUT);
		 * fw.write(pythonCode);
		 * fw.flush();
		 * fw.close();
		 */
		
		// or shorter
		Files.write(pythonCode.getBytes(), new File(PYTHON_OUTPUT));
		
		// execute the generated Python code
		// roughly: exec "python foo.py"
		
		Process p = Runtime.getRuntime().exec("python "+ PYTHON_OUTPUT);
		
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
		
		
	}

}
