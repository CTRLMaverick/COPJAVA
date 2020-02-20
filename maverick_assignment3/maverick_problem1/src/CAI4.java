package src;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI4 {
	 
	Random rng = new Random();
	Scanner inpt = new Scanner(System.in);
	public int rand_int1;
	public int rand_int2;
	public int answer;
	public int qcounter=0;
	public double numcorrect=0;
	public int numincorrect=0;
	public int rnum1 = rng.nextInt(4)+1;
	public int useranswer;
	public int difficultyanswer;
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
		
	public void isAnswerCorrect(int z) {
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
		
	public void askQuestion(int rand_int1, int rand_int2) {
		System.out.printf("How much is %d times %d?\n",rand_int1,rand_int2);
	}
		
	public void readResponse() {
		System.out.printf("Enter your answer:  ");
		useranswer = inpt.nextInt();
	}
	
	public void readDifficulty() {
		System.out.printf("Enter your difficulty:\n1\n2\n3\n4\n");
		difficultyanswer = inpt.nextInt();
	}
	
	public void generateQuestionArgument(int difficultyanswer) {
		 for (int i=0;i<10;i++) {
				SecureRandom rand = new SecureRandom();
			if (difficultyanswer==1) {
				rand_int1 = rand.nextInt(10);
				rand_int2 = rand.nextInt(10);	
				answer = rand_int1*rand_int2;
				}
		    else if (difficultyanswer==2) {
		    	rand_int1 = rand.nextInt(100);
				rand_int2 = rand.nextInt(100);	
				answer = rand_int1*rand_int2;
		        }
		    else if (difficultyanswer==3) {
		    	rand_int1 = rand.nextInt(1000);
				rand_int2 = rand.nextInt(1000);	
				answer = rand_int1*rand_int2;
		    }
		    else if (difficultyanswer==4) {
		    	rand_int1 = rand.nextInt(10000);
				rand_int2 = rand.nextInt(10000);	
				answer = rand_int1*rand_int2;
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
		
	public void quiz() {
		    readDifficulty();
		   
		for (int i=0;i<10;i++) {
			qcounter++;
			generateQuestionArgument(difficultyanswer);
			askQuestion(rand_int1,rand_int2);
			readResponse();
			isAnswerCorrect(answer);
			}
		  displayCompletionMessage(numcorrect);
		}
		
		public static void main(String[] args) {
			CAI4 q = new CAI4();
			q.quiz();
		}
	}
