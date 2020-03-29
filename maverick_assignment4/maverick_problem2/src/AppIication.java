package src;

public class AppIication {
	
	private static final String ifile = "problem2.txt";
	private static final String ofile = "unique_word_counts.txt";
			
	 public static void main(String[] args) {
		 
		 DuplicateCounter dc = new DuplicateCounter();
	       
	       dc.count(ifile);
	       dc.write(ofile);
	   }
	}

