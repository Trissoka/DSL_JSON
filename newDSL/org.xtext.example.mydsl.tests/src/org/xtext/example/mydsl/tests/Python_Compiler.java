package org.xtext.example.mydsl.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.mydsl.myDsl.Fun;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.ReadJson;

import com.google.common.io.Files;

public class Python_Compiler {
	private Model _model;
	
	Python_Compiler(Model model){
		_model = model;
	}
	public void compileAndRun() throws IOException {
		
		//Code generation
		EList<Fun> sentences = _model.getSentences();
		String fileName = "";
		for(Fun s : sentences) {
			
			if (s instanceof ReadJson) {
				
				ReadJson r = (ReadJson) s;
				// r.get
				fileName = r.getPath();
			}
		}
		
		String pythonCode = "import pandas as pd\n"+
				"df = pd.read_csv(\""+fileName+"\")\n"+
				"print(df)";
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
		
		
	}

}
