package src;

import java.security.SecureRandom;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class CAI5 {
	 
	Random rng = new Random();
	Scanner inpt = new Scanner(System.in);
	DecimalFormat numberFormat = new DecimalFormat("#.###");
	public double rand_int1;
	public double rand_int2;
	public double answer;
	public int qcounter=0;
	public double numcorrect=0;
	public int numincorrect=0;
	public int rnum1 = rng.nextInt(4)+1;
	public double useranswer;
	public int difficultyanswer;
	public int mathchoiceanswer;
	public int tryagainanswer;
	public String response;
		
	public void displayCorrectResponse(int b) {
		switch (b) {
		case 1:
			response = "Very Good!\n";
			break;
		case 2:
			response = "Excellent!\n";
			break;
		case 3:
			response = "Nice Work!\n";
			break;
		case 4:
			response = "Keep up the good work!\n";
			break;
		}
	  System.out.println(response);
	}
		
	public void displayIncorrectResponse(int a) {
		switch (a) {
		case 1:
			response = "No. Please try again.\n";
			break;
		case 2:
			response = "Wrong. Try once more.\n";
			break;
		case 3:
			response = "Don't give up!\n";
			break;
		case 4:
			response = "No. Keep trying.\n";
			break;
		}
	  System.out.println(response);
	}
		
	public void isAnswerCorrect(double z) {
		SecureRandom ran = new SecureRandom();
	    int ran_int1 = ran.nextInt(3)+1;
		 if (useranswer==z) {
			numcorrect++;
			displayCorrectResponse(ran_int1);
		  }
		 else if (useranswer!=z) {
			displayIncorrectResponse(ran_int1);
		  }
		}
		
	public void askQuestion(double rand_int1, double rand_int2, double mathchoiceanswer) {
		if (mathchoiceanswer==1) {
			System.out.printf("How much is %.0f plus %.0f?\n",rand_int1,rand_int2);
			answer = rand_int1+rand_int2;
		}
		else if (mathchoiceanswer==2) {
			System.out.printf("How much is %.0f times %.0f?\n",rand_int1,rand_int2);
			answer = rand_int1*rand_int2;
		}
		else if (mathchoiceanswer==3) {
			System.out.printf("How much is %.0f minus %.0f?\n",rand_int1,rand_int2);
			answer = rand_int1-rand_int2;
		}
		else if (mathchoiceanswer==4) {
			System.out.printf("How much is %.0f divided by %.0f?\n",rand_int1,rand_int2);
			answer = rand_int1/rand_int2;
		}
		else if (mathchoiceanswer==5) {
			SecureRandom ran = new SecureRandom();
		    int ran_intq = ran.nextInt(3)+1;
			switch (ran_intq) {
			case 1:
				System.out.printf("How much is %.0f plus %.0f?\n",rand_int1,rand_int2);
				answer = rand_int1+rand_int2;
				break;
			case 2:
				System.out.printf("How much is %.0f times %.0f?\n",rand_int1,rand_int2);
				answer = rand_int1*rand_int2;
				break;
			case 3:
				System.out.printf("How much is %.0f minus %.0f?\n",rand_int1,rand_int2);
				answer = rand_int1-rand_int2;
				break;
			case 4:
				System.out.printf("How much is %.0f divided by %.0f?\n",rand_int1,rand_int2);
				answer = rand_int1/rand_int2;
				break;
		}
	  }
	}
		
	public void readResponse() {
		System.out.printf("Enter your answer:  ");
		useranswer = inpt.nextInt();
	}
	
	public void readDifficulty() {
		System.out.printf("Enter your difficulty:\n1\n2\n3\n4\n");
		difficultyanswer = inpt.nextInt();
	}
	
	public void readProblemType() {
		System.out.printf("Enter your type of arithmetic:\n1-Addition\n2-Multiplication\n3-Substraction\n4-Division\n5-All the Above\n");
		mathchoiceanswer = inpt.nextInt();
	}
	public void generateQuestionArgument(int difficultyanswer) {
		 for (int i=0;i<10;i++) {
				SecureRandom rand = new SecureRandom();
			if (difficultyanswer==1) {
				rand_int1 = rand.nextInt(10);
				rand_int2 = rand.nextInt(10);	
				}
		    else if (difficultyanswer==2) {
		    	rand_int1 = rand.nextInt(100);
				rand_int2 = rand.nextInt(100);	
		        }
		    else if (difficultyanswer==3) {
		    	rand_int1 = rand.nextInt(1000);
				rand_int2 = rand.nextInt(1000);	
		    }
		    else if (difficultyanswer==4) {
		    	rand_int1 = rand.nextInt(10000);
				rand_int2 = rand.nextInt(10000);	
		    }
		 }
	}

	public void displayCompletionMessage(double r) {
		double prcntcorrect = numcorrect/10*100;
		if (prcntcorrect>75) {
			System.out.printf("Congratulations, you are ready to go to the next level!");
			System.out.printf("\nPercent Correct: %.2f",prcntcorrect);
		}
		else if (prcntcorrect<75) {
			System.out.printf("Please ask your teacher for extra help");
			System.out.printf("\nPercent Correct: %.2f",prcntcorrect);
			}
		}
	
	public void tryAgainorNot() {
		System.out.printf("\n\nWould you like to try again?\n1-Yes\n2-No");
		tryagainanswer = inpt.nextInt();
		if (tryagainanswer==1) {
			CAI5 q = new CAI5();
			q.quiz();
		}
		else if (tryagainanswer==2) {
			System.exit(0);
		}
	}
		
	public void quiz() {
		    readDifficulty();
		    readProblemType();
		for (int i=0;i<10;i++) {
			generateQuestionArgument(difficultyanswer);
			askQuestion(rand_int1,rand_int2, mathchoiceanswer);
			readResponse();
			isAnswerCorrect(answer);
			}
		  displayCompletionMessage(numcorrect);
		  tryAgainorNot();
		}
		
		public static void main(String[] args) {
			CAI5 q = new CAI5();
			q.quiz();
		}
	}
