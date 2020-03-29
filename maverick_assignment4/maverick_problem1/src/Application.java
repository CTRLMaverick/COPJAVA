package src;


public class Application   {
	
	private static final String ifile = "problem1.txt";
	private static final String ofile = "unique_words.txt";
	
	public static void main(String[] args ) {
		DuplicateRemover dr = new DuplicateRemover();
		
		dr.remove(ifile);
		dr.write(ofile);
	}
}
