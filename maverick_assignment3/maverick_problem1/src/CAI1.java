package src;
import java.security.SecureRandom;
import java.util.Scanner;


public class CAI1 {
	Scanner inpt = new Scanner(System.in);
	SecureRandom rand = new SecureRandom();
	private int rand_int1 = rand.nextInt(10);
	private int rand_int2 = rand.nextInt(10);	
	private int answer = rand_int1*rand_int2;
	public int useranswer;
	
	
	public int getUseranswer() {
		return useranswer;
	}
	
	public void displayCorrectResponse() {
		System.out.printf("Very Good!");
	}
	
	public void displayIncorrectResponse() {
		System.out.printf("No. Please try again.");
	}
	
	public void isAnswerCorrect() {
		  if (useranswer==answer) {
		    	displayCorrectResponse();
		    }
		  else if (useranswer!=answer) {
		    	displayIncorrectResponse();
		    }
	}
	
	public void askQuestion() {
		System.out.printf("How much is %d times %d?\n",rand_int1,rand_int2);
	}
	
	public void readResponse() {
		System.out.printf("Enter your answer:  ");
		useranswer = inpt.nextInt();
	}
	
	public void quiz() {
		while (useranswer!=answer) {
			askQuestion();
		    readResponse();
		    isAnswerCorrect();
		}
	}
	
	public static void main(String[] args) {
		CAI1 q = new CAI1();
		q.quiz();
	}
} 