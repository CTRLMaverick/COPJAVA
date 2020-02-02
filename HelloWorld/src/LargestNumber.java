import java.util.Scanner;

public class LargestNumber {
	public static void main(String[] args) {
	final int NUM_USERS = 10;
		
	Scanner in = new Scanner(System.in);
	
	int[] input = new int[NUM_USERS];
	for(int i=0;i<input.length;i++) {
		System.out.print("Please enter a number: ");
		input[i] = in.nextInt();
	}
	
	int maxValue = input[0];
	for(int i = 1; i<input.length;i++) {
			if(input[i]>maxValue) {
				maxValue = input[i];
			}
		
	}

	System.out.println("The max value is " + maxValue);
 }
}