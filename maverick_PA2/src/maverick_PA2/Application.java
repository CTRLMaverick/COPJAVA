package maverick_PA2;

import java.util.*;

import maverick_PA2.Encrypter;
import maverick_PA2.Decrypter;


public class Application {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int decision = 5;
            //Create menu to encrypt or to decrypt
	        while (decision != 0) { 
                //Display menu options
	            System.out.println("1. To Encrypt" + "\n" + "2. To Decrypt" + "\n" + "0. To Exit");
                //Take user input whether to encrypt, decrypt or stop application
	            decision = sc.nextInt();
	            //Create values corresponding to menu option
	            if (decision == 1) {
	                System.out.println("Enter the number to be Encryped");
	                int number = sc.nextInt();
	                //Call encryption method
	                Encrypter.Encrypt(number);
	            }
	              else if (decision == 2) {
	                System.out.println("Enter the number to be Decryped");
	                int number = sc.nextInt();
                    //Call decryption method
	                Decrypter.Decrypt(number);
	            }
	        }
	 }
}
