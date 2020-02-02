
public class HelloWorld {

	public static void main(String[] args) {
		int c = 0;
		int product = 1;
		while(c <= 5) {
		    product *= c;
		    ++c;
		}
		System.out.printf("This is %d",c);
	}

}
