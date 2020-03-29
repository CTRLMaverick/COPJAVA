package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {
	
	private Integer wordCounter;
	private Map<String, Integer> wordstore;
	
	public DuplicateCounter(){
	       this.wordCounter = 0;
	       this.wordstore = new HashMap<>();
	   }
	
		
		public void count(String dataFile) {
			Scanner input=null;
			try {
				input = new Scanner(new File(dataFile));
				
				
				while(input.hasNextLine()) {
					String line=input.nextLine().trim();
					String[] data=line.split("[\\W]+");
					for(String word:data) {
						this.wordCounter = wordstore.get(word);
						this.wordCounter = (this.wordCounter == null) ?1: ++this.wordCounter;
						wordstore.put(word, this.wordCounter);
					}
				}	
			}
			catch(FileNotFoundException e) {
				System.out.println("File " +dataFile+ " not found");
			}
			if(input!=null)
				input.close();
		    }


	   public void write(String outputFile) {
		   FileWriter fw;
		   PrintWriter pw;
		   
		   try {
			   fw = new FileWriter(new File(outputFile));
			   pw = new PrintWriter(fw);
			   for(Map.Entry<String, Integer> entry: wordstore.entrySet()) {
				  pw.write("The frequency of "+entry.getKey()+" is "+entry.getValue()+"\n");
			   }
			   pw.flush();
			   fw.close();
			   pw.close();
		   }
		   catch(IOException e) {
			   System.out.println("Error while writing to file:" +outputFile+ e.getMessage());
		   }
		   
	   }
	 }
	   

