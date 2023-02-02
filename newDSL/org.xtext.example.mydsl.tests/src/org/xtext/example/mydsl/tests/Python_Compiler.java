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
import org.xtext.example.mydsl.myDsl.TypeJSON;
import org.xtext.example.mydsl.myDsl.TypeReference;
import org.xtext.example.mydsl.myDsl.TypeString;
import org.xtext.example.mydsl.myDsl.Add;
import org.xtext.example.mydsl.myDsl.Sort;
import org.xtext.example.mydsl.myDsl.TypeInt;
import org.xtext.example.mydsl.myDsl.Show;

import com.google.common.io.Files;

public class Python_Compiler {
	private Model _model;
	
	Python_Compiler(Model model){
		_model = model;
	}
	
	public String recurrenceRead(TypeJSON s)
	{
		EList<String> atts= s.getAttribute();
		EList<TypeReference> vals= s.getValue();
		List<String> v = new ArrayList<String>();
		
		String retour = "{";
		
		for(TypeReference tr : vals) {
			if (tr instanceof TypeString) {
				TypeString ts = (TypeString) tr;
				String se = "\"" + ts.getVal() + "\"";
				v.add(se);
			}
			else if (tr instanceof TypeInt) {
				TypeInt ts = (TypeInt) tr;
				String re = "" + ts.getVal();
				v.add(re);
			}
			else if (tr instanceof TypeJSON) {
				TypeJSON ts = (TypeJSON) tr;
				String sj = recurrenceRead(ts);
				v.add(sj);
			}
		}
		
		int lenght=atts.size();
		
		for(int i=0;i<lenght;i++) {
			retour+="\""+atts.get(i)+"\" : "+v.get(i)+" , ";
		}
		
		retour += "}";
		
		return retour;
	}
	
	public String compileAndRun() throws IOException {
		
		//Code generation
		EList<Fun> sentences = _model.getSentences();
		//String fileName = "";
		String pythonCode="";
		pythonCode+="import pandas as pd\n"
				+ "import json\n";
		
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
				pythonCode+=VarName.get(VarName.size()-1)+" = pd.read_json(\"" + fileName+ "\", orient=\"index\")\n";
				HaveReadJSON=true;
			}
			
			// Ecriture d'un JSON en .json
			if(s instanceof WriteJson) {
				WriteJson r =(WriteJson) s;
				
				String RegisterFileName = r.getPath();
				
				TypeJSON data = r.getValue();
				if(data!=null) {
					String retour = recurrenceRead(data);
					pythonCode+= "with open (\"" + RegisterFileName + "\",\"w\") as outfile: \n \t";
					pythonCode+="json.dump(" + retour + ", outfile )\n";
				}
				else
				{
					String Name= VarName.get(VarName.size()-1);
					pythonCode+= Name + ".to_json(\""+RegisterFileName+"\",orient= 'index')\n";

				}
			}
			
			//Ecriture d'un JSON en .csv
			if(s instanceof WriteCSV) {
				WriteCSV w=(WriteCSV) s;
				
				String RegisterFileName= w.getPath();
				TypeJSON data = w.getValue();
				if(data!=null) {
					String retour = recurrenceRead(data);

					pythonCode += "data = '" + retour + "'\n";
					pythonCode += "print(data) \n";
					
					pythonCode+="df = pd.read_json(data, orient ='index') \n";
					pythonCode+="df.to_csv(\""+RegisterFileName+"\",index=False) \n";
					
				}else {
					String Name= VarName.get(VarName.size()-1);
					pythonCode+=Name+".to_csv(\""+RegisterFileName+"\",index=False) \n";
				}
				
		
			}
			
			
			// Remove un element d'un JSON via son id
			
			if(s instanceof Remove) {
				Remove r = (Remove) s;
				String id= r.getId();
				
				String Name= VarName.get(VarName.size()-1);
				
				pythonCode+=Name+".drop([\""+id+"\"], axis=0, inplace=True)\n";
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
				TypeJSON data = a.getValue();
				if(data!=null) {
					String retour = recurrenceRead(data);
					
					pythonCode+="tmpDF = pd.read_json('"+retour+"', orient ='index') \n";
				}
				
				pythonCode += Name + "= pd.concat(["+Name+",tmpDF]) \n";
			}
			
			//Montre le JSON choisi par son nom
			if (s instanceof Show) {
				Show sh= (Show) s;
				String name = sh.getName();
				if(name!=null) {
					pythonCode+= "print("+name+".to_string()) \\n";
				}else {
					pythonCode+= "print("+VarName.get(VarName.size()-1)+".to_string()) \n";
				}

			}
			
			// Obtient la valeur par ID du dernier JSON ouvert
			if (s instanceof Get) {
				Get g= (Get) s;
				
				//JSON auquel on ajoute
				//JSON data = a.getFile();
				//EList<String> atts = data.getAttribute();
				//EList<String> vals = data.getValue();
				//OU
				// Si enregistrer dans les variables
				String Name= VarName.get(VarName.size()-1);
				String id= g.getId();
				pythonCode+= "print("+Name+ ".loc[\""+id+"\"])\n";
				
				
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
		
		//Process p = Runtime.getRuntime().exec("python3 "+ PYTHON_OUTPUT);
		
		System.out.println(new BufferedReader(new
				InputStreamReader(Runtime.getRuntime().exec("pwd").getInputStream())).readLine());
		
		Process p = System.getProperty("os.name").toLowerCase().contains("windows") ? 
			    Runtime.getRuntime().exec(new String[]{"powershell", "docker run -v ${PWD}:/app -w /app/ dsl_py python3 ./foo.py"}) :
			    Runtime.getRuntime().exec(new String[]{"./test_dock.sh"});
		
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
