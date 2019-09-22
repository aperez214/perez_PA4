package perez_PA2;

import java.util.Scanner;

public class perez_p2 {
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	char C, M;
	double BMI,
			funcBMI = 0,
			weight,
			height;
	
	System.out.println("The following program will out your BMI using Customary or Metric units.");
	System.out.print("Enter 'C' for Customary or 'M' for Metric: ");
	
		BMI = scnr.next().charAt(0);
		
	if ((BMI == 'C') || (BMI == 'c')) {
		System.out.print("\nCustomary Units: \nEnter weight in Pounds: ");
			weight = scnr.nextDouble();
		System.out.print("Enter height in Inches: ");
			height = scnr.nextDouble();
			
		funcBMI = (703 * weight) / Math.pow(height, 2);
		
		System.out.printf("Your BMI is: %.1f", funcBMI);
		}
	
		else if ((BMI == 'M') || (BMI == 'm')) {
			System.out.print("\nMetric Units: \nEnter weight in Kilograms: ");
				weight = scnr.nextDouble();
			System.out.print("Enter height in Meters: ");
				height = scnr.nextDouble();
				
			funcBMI = (weight) / Math.pow(height, 2);
			
			System.out.printf("Your BMI is: %.1f ", funcBMI);
		}
			else {
				System.out.print("\nInvalid input. Please re-run the program and try again.");
		}
	
	
	if (funcBMI <= 18.5)
			System.out.print("\nBMI Category: Underweight");
		else if (funcBMI < 25.0)
				System.out.print("\nBMI Category: Normal weight");
		else if (funcBMI < 30.0)
				System.out.print("\nBMI Category: Overweight");
		else if (funcBMI >= 30.0)
				System.out.print("\nBMI Category: Obese");
			else 
				System.out.print("\nBMI Category: Undefined");

	}
	
}