package perez_PA2;

import java.util.Scanner;

public class perez_p1_DECRYPT {
	
	public static void main(String[] args) {

	Scanner scnr = new Scanner(System.in);
	String userData;
	int temp1, temp2, i;
	
    System.out.print("Please enter a 4-Digit code: ");
      		userData = scnr.next();
      	
    int dig0 = ((Character.getNumericValue(userData.charAt(0))));
    int dig1 = ((Character.getNumericValue(userData.charAt(1))));
    int dig2 = ((Character.getNumericValue(userData.charAt(2))));
    int dig3 = ((Character.getNumericValue(userData.charAt(3))));

	    	  
		      if (dig0 >= 7) {  
		    	  dig0 = dig0 - 7;
		      }
		      else {
		    	  dig0 = dig0 + 10 - 7;
		      }
		      
		      if (dig1 >= 7) {  
		    	  dig1 = dig1 - 7;
		      }
		      else {
		    	  dig1 = dig1 + 10 - 7;
		      }
		      
		      if (dig2 >= 7) {  
		    	  dig2 = dig2 - 7;
		      }
		      else {
		    	  dig2 = dig2 + 10 - 7;
		      }
		      
		      if (dig3 >= 7) {  
		    	  dig3 = dig3 - 7;
		      }
		      else {
		    	  dig3 = dig3 + 10 - 7;
		      }
		
	      temp1 = dig0;
	      dig0 = dig2;
	      dig2 = temp1;
	 
	      temp2 = dig1;
	      dig1 = dig3;
	      dig3 = temp2;
	      
	      System.out.println("Your input: " + dig0 + dig1 + dig2 + dig3);
	}
}