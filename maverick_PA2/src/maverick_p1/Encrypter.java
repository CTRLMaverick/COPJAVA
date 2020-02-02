package maverick_p1;

public class Encrypter {
	public static void Encrypt(int num) {
		//Create int array to hold input numbers
	    int n[] = new int[4];
        //Way to add the 7 and then to mod by 10
        for (int i = 3; i >= 0; i--) {
            int temp = 0;
            temp = num % 10;
            n[i] = (temp + 7) % 10;
            num = (int) num / 10;
        }
        int n2[] = swap(n);
        //Print the encrypted integer
        System.out.println("The Encrypted Integer is:"+n2[0]+""+n2[1]+""+n2[2]+""+n2[3]);
    }
    public static int[] swap(int numarray[]) {  
        //Encryption needs to swap the first and third value
        int temp = numarray[0];                
        numarray[0] = numarray[2];
        numarray[2] = temp;
        //Encryption needs to swap the second and fourth value
        temp = numarray[1];
        numarray[1] = numarray[3];
        numarray[3] = temp;
        return numarray;
    }
}

