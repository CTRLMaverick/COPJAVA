package src;
import java.security.SecureRandom;
import java.util.*;
import java.util.Scanner;


public class CAI2 {
	Random rng = new Random();
	Scanner inpt = new Scanner(System.in);
	SecureRandom rand = new SecureRandom();
	private int rand_int1 = rand.nextInt(10);
	private int rand_int2 = rand.nextInt(10);	
	private int answer = rand_int1*rand_int2;
	public int rnum1 = rand.nextInt(4)+1;
	public int useranswer;
	public String response;
	
	
	public int getUseranswer() {
		return useranswer;
	}
	
	public void displayCorrectResponse() {
		switch (rnum1) {
		case 1:
			//rnum1=1;
			response = "Very Good!";
			break;
		case 2:
			//rnum1=2;
			response = "Excellent!";
			break;
		case 3:
			//rnum1=3;
			response = "Nice Work!";
			break;
		case 4:
			//rnum1=4;
			response = "Keep up the good work!";
			break;
		}
	  System.out.println(response);
	}
	
	public void displayIncorrectResponse() {
		switch (rnum1) {
		case 1:
			//rnum1=1;
			response = "No. Please try again";
			break;
		case 2:
			//rnum1=2;
			response = "Wrong. Try once more.";
			break;
		case 3:
			//rnum1=3;
			response = "Don't give up!";
			break;
		case 4:
			//rnum1=4;
			response = "No. Keep trying.";
			break;
		}
	  System.out.println(response);
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
		CAI2 q = new CAI2();
		q.quiz();
	}


	
}