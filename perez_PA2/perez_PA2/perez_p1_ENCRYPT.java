package perez_PA2;

import java.util.Scanner;

public class perez_p1_ENCRYPT {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String userData;
		int temp1, temp2;
		
	      System.out.print("Please enter a 4-Digit code: ");
	      		userData = scnr.next();
	      	
	      int dig0 = ((Character.getNumericValue(userData.charAt(0))) + 7) % 10;
	      int dig1 = ((Character.getNumericValue(userData.charAt(1))) + 7) % 10;
	      int dig2 = ((Character.getNumericValue(userData.charAt(2))) + 7) % 10;
	      int dig3 = ((Character.getNumericValue(userData.charAt(3))) + 7) % 10;

	      temp1 = dig0;
	      dig0 = dig2;
	      dig2 = temp1;
     
	      temp2 = dig1;
	      dig1 = dig3;
	      dig3 = temp2;
	      
	      System.out.println("Your input: " + dig0 + dig1 + dig2 + dig3);
	           
	}
	
}