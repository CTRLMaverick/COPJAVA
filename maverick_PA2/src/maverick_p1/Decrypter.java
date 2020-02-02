package maverick_p1;

import java.util.*;
import java.util.stream.Collectors;

import maverick_p1.Encrypter;

public class Decrypter {
 public static void Decrypt(int number) {  
    //Create an array to hold the numbers 1-9 that will later be matched to the user input
    int arr[] = { 7, 8, 9, 0, 1, 2, 3, 4, 5, 6 };  
    //Have the array as an index for entered value
    int n[] = new int[4];                      
    //Find a way to change the values in the index
    for (int i = 3; i >= 0; i--) {               
        n[i] = number % 10;                      
        number = (int) number / 10;
    }
    
    int r[] = Encrypter.swap(n);               
    //Scan through the index using the information that the user provided
    n[0] = find_index(arr, r[0]);       
    n[1] = find_index(arr, r[1]);       
    n[2] = find_index(arr, r[2]);
    n[3] = find_index(arr, r[3]);
    //Print the decrypted integer
    System.out.println("The Decrypted Integer is:"+n[0]+""+n[1]+""+n[2]+""+n[3]);

}
    //Change the array to a list
public static int find_index(int[] arr, int num) {  
    //Return the decrypted integer
    return Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(num);

}

}