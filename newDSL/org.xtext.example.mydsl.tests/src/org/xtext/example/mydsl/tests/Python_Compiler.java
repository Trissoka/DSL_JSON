package org.xtext.example.mydsl.tests;

import java.awt.image.DataBuffer;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.myDsl.Fun;
import org.xtext.example.mydsl.myDsl.Get;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.ReadJson;
import org.xtext.example.mydsl.myDsl.Remove;
import org.xtext.example.mydsl.myDsl.WriteCSV;
import org.xtext.example.mydsl.myDsl.WriteJson;
import org.xtext.example.mydsl.myDsl.JSON;
import org.xtext.example.mydsl.myDsl.Add;
import org.xtext.example.mydsl.myDsl.Sort;

import com.google.common.io.Files;

public class Python_Compiler {
	private Model _model;
	
	Python_Compiler(Model model){
		_model = model;
	}
	public String compileAndRun() throws IOException {
		
		//Code generation
		EList<Fun> sentences = _model.getSentences();
		//String fileName = "";
		String pythonCode="";
		pythonCode+="import pandas as pd\n"
				+ "import json \n";
		
		// Vrai si un JSON a été lu
		boolean HaveReadJSON=false;
		
		// List du nom des variables
		List<String> VarName= new ArrayList<String>();
		
		// Indique qu'il faut utiliser la derniere variable, vrai par default
		boolean UseLast=true;
		
		
		for(Fun s : sentences) {
			
			
			// Lecture d'un JSON
			if (s instanceof ReadJson) {
				
				ReadJson r = (ReadJson) s;
				// r.get
				String fileName = r.getPath();
				VarName.add("df"+VarName.size());
				pythonCode+=VarName.get(VarName.size()-1)+" = pd.read_json(\"" + fileName+ "\" )\n";
				HaveReadJSON=true;
			}
			
			// Ecriture d'un JSON en .json
			if(s instanceof WriteJson) {
				WriteJson r =(WriteJson) s;
				
				String RegisterFileName = r.getPath();
				
				JSON data = r.getFile();
				EList<String> atts= data.getAttribute();
				EList<String> vals= data.getValue();
				int lenght=atts.size();
				pythonCode+="json.dump( {";
				for(int i=0;i<lenght;i++) {
					pythonCode+=atts.get(i)+" : "+vals.get(i)+" , ";
					
				}
				pythonCode+=" }, "+RegisterFileName+" )\n";
				
			}
			
			//Ecriture d'un JSON en .csv
			if(s instanceof WriteCSV) {
				WriteCSV w=(WriteCSV) s;
				
				String RegisterFileName= w.getPath();
				JSON data= w.getFile();
				if(data!=null) {
					EList<String> atts= data.getAttribute();
					EList<String> vals= data.getValue();
					int lenght=atts.size();
					
					//pythonCode+="df2 = pd.read_json(jsonStr, orient ='index')";
					
					String JSONSTR= "{ ";
					for(int i=0;i<lenght;i++) {
						JSONSTR+=atts.get(i)+" : "+vals.get(i)+" , ";
						
					}
					JSONSTR+=" } ";
					
					pythonCode+="df = pd.read_json("+JSONSTR+", orient ='index') \n";
					pythonCode+="df.to_csv("+RegisterFileName+",index=False) \n";
					
				}else {
					pythonCode+="df.to_csv("+VarName.get(VarName.size()-1)+",index=False) \n";
				}
				
		
			}
			
			
			// Remove un element d'un JSON via son id
			
			if(s instanceof Remove) {
				Remove r = (Remove) s;
				int id= r.getId();
				
				JSON data=r.getFile();
				
				EList<String> atts = data.getAttribute();
				EList<String> vals = data.getValue();
				int lenght=atts.size();
				String JSONSTR = "{";
				for(int i=0;i<lenght;i++) {
					if(i!=id) {
						JSONSTR+=atts.get(i)+":"+vals.get(i)+",";
					}	
				}
				JSONSTR+="}";
				if(UseLast) {
					pythonCode+=VarName.get(VarName.size()-1)+" = pd.read_json("+JSONSTR+", orient ='index') \\n";
				}
				//pythonCode+="df = pd.read_json("+JSONSTR+", orient ='index') \n";
				
				
			}
			
			// Ajoute un élément au dernier JSON lu.
			if( s instanceof Add) {
				Add a = (Add) s;
				//JSON auquel on ajoute
				//JSON data = a.getFile();
				//EList<String> atts = data.getAttribute();
				//EList<String> vals = data.getValue();
				//OU
				// Si enregistrer dans les variables
				String Name= VarName.get(VarName.size()-1);
				
				//JSON a ajouter
				JSON data = a.getData();
				if(data!=null) {
					EList<String> atts = data.getAttribute();
					EList<String> vals = data.getValue();
					int lenght=atts.size();
					String JSONSTR = "{";
					for(int i=0;i<lenght;i++) {
						if(i!=id) {
							JSONSTR+=atts.get(i)+":"+vals.get(i)+",";
						}	
					}
					JSONSTR+="}";
					
					pythonCode+="tmpDF = pd.read_json("+JSONSTR+", orient ='index') \\n";
					
				}
				
				pythonCode += Name+".append(tmpDF) \\n";
				
			}
			
			//Montre le JSON choisi par son nom
			if (s instanceof Show) {
				Show sh= (Show) s;
				String name = sh.getName();
				if(name!=null) {
					pythonCode+= "display("+name+".to_string()) \\n";
				}else {
					pythonCode+= "display("+VarName.get(VarName.size()-1)+".to_string()) \\n";
				}

			}
			
			// Obtient la valeur par ID du dernier JSON ouvert
			if (s instanceof Get) {
				Get g= (Get) g;
				
				//JSON auquel on ajoute
				//JSON data = a.getFile();
				//EList<String> atts = data.getAttribute();
				//EList<String> vals = data.getValue();
				//OU
				// Si enregistrer dans les variables
				String Name= VarName.get(VarName.size()-1);
				int id= g.getId();
				pythonCode+= Name+ "["+id + "]";
				
				
			}
			
			// Trie le dernier JSON ouvert
			if (s instanceof Sort) {
				Sort so = (Sort) s;
				
				
				//JSON auquel on ajoute
				//JSON data = a.getFile();
				//EList<String> atts = data.getAttribute();
				//EList<String> vals = data.getValue();
				//OU
				// Si enregistrer dans les variables
				String Name= VarName.get(VarName.size()-1);
				String attname=so.getAttribute();
				pythonCode+= Name+".sort_values(by = "+attname+")";
				
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
		
		return o;
		
	}

}
