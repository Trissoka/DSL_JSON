package org.xtext.example.mydsl.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.myDsl.CountJson;
import org.xtext.example.mydsl.myDsl.Fun;
import org.xtext.example.mydsl.myDsl.JSON;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.ReadJson;
import org.xtext.example.mydsl.myDsl.Remove;
import org.xtext.example.mydsl.myDsl.WriteCSV;
import org.xtext.example.mydsl.myDsl.WriteJson;

import com.google.common.io.Files;

public class JQ_Compiler {
	private Model _model;
	
	JQ_Compiler(Model model){
		_model = model;
	}
	public void compileAndRun() throws IOException {
		
		//Code generation
		EList<Fun> sentences = _model.getSentences();
		String jqCode = "";
		for(Fun s : sentences) {
			if (s instanceof ReadJson) {
				ReadJson r = (ReadJson) s;
				String fileName = r.getPath();
				
				jqCode = "jq '.' "+fileName;
			}
			else if (s instanceof CountJson) {
				CountJson c = (CountJson) s;
				String fileName = c.getPath();
				
				jqCode = "jq '. | length' "+fileName;
				
			}
			else if (s instanceof WriteJson) {
				WriteJson w = (WriteJson) s;
				String fileName = w.getPath();
				JSON json_data = w.getFile();
				
				jqCode = "echo '"+json_data+"' | jq '.'  > "+fileName;
			}
			else if (s instanceof WriteCSV) {
				WriteCSV w_csv = (WriteCSV) s;
				String jsonFile = w_csv.getPath();
				String tabName = w_csv.getTabName();
				String header = w_csv.getHeader();
				String outputFile = w_csv.getOutputFile();
				
				jqCode = "cat "+ jsonFile +"| jq -r '."+tabName+"[] | "+header+"| @csv' >"+outputFile ;
				//header de la forme [.prop1, .prop2, ..., .prop_n]
			}
			else if(s instanceof Remove) {
				Remove rem = (Remove) s;
				int id = rem.getId();
				String tabName = rem.getTabName();
				String fileName = rem.getFile();
				
				jqCode = "";
			}
		}
		
		
		// serialize code into sh filename
		String JQ_OUTPUT = "foo.sh";
		/*
		 * FinalWriter fw = new FileWriter(PYTHOn_OUTPUT);
		 * fw.write(pythonCode);
		 * fw.flush();
		 * fw.close();
		 */
		
		// or shorter
		Files.write(jqCode.getBytes(), new File(JQ_OUTPUT));
		
		// execute the generated Python code
		// roughly: exec "python foo.py"
		
		Process p = Runtime.getRuntime().exec(JQ_OUTPUT);
		
		// output
		
		BufferedReader stdInput = new BufferedReader(new
				InputStreamReader(p.getInputStream()));
		
		// error
		BufferedReader stdError = new BufferedReader(new
				InputStreamReader(p.getErrorStream()));
		
		
	}

}