package AdvancedCalculator;

import java.util.Scanner;

public class Methods extends Arithmetic{
	

	
	
	Scanner sc = new Scanner(System.in);
	public void Sqr() {
		
		
		System.out.println("Enter any number to find the Square -> ");
		int numberS = sc.nextInt();
		System.out.println("----------------------------------------------");
		
		System.out.println();
		double square =numberS*numberS ;
		record ="Square of number " + numberS + " is " + square;
		System.out.println(record);
		super.records(record);
		System.out.println("Exit");
		
	}

	
	public void SqrRoot() {
		
		System.out.println("Enter any number to find the Square root -> ");
		int numberS = sc.nextInt();
		System.out.println("----------------------------------------------");
		
		System.out.println();
		double squareroot = Math.sqrt(numberS);
		record ="Square root of number " + numberS + " is " + squareroot;
		System.out.println(record);
		super.records(record);
		System.out.println("Done");
	}

	public void logFun() {
		System.out.println("Enter any number to find the Log -> ");
		int numberL = sc.nextInt();
		System.out.println("----------------------------------------------");
		
		System.out.println();
		double Log = Math.log(numberL);
		record = "Log of number " + numberL + " is " + Log;
		System.out.println(record);
		super.records(record);
		System.out.println("Exit");
		
	}
	public void pow() {
		int n,p,result=1;
		System.out.println("Enter any number to find the Square root ->");
		n=sc.nextInt();
		System.out.println("Enter power");
		p=sc.nextInt();
		
		for(int i=1; i<=p; i++) {
			result=n*result;
			
			
		}
		record =n+" to the power "+p+" is equal to ->"+result;
		System.out.println(record);
		super.records(record);
		System.out.println("Exit");
		
	}
	public void lcm() {
	    System.out.println("Enter two numbers to find the LCM ->");
	    int number1 = sc.nextInt();
	    int number2 = sc.nextInt();

	    // Find the maximum of the two numbers
	    int max = Math.max(number1, number2);

	    int lcm = max;

	    while (true) {
	        // Check if lcm is divisible by both numbers
	        if (lcm % number1 == 0 && lcm % number2 == 0) {
	            break;
	        }
	        // Increment lcm by the maximum number
	        lcm += max;
	    }

	    record="LCM of " + number1 + " and " + number2 + " is " + lcm;
	    System.out.println(record);
		super.records(record);
		System.out.println("Exit");
	}
	public void percentage() {
	    System.out.println("Enter the total number ->");
	    int total = sc.nextInt();
	    System.out.println("Enter the percentage value ->");
	    double percentage = sc.nextDouble();

	    double result = (percentage / 100) * total;

	    record =percentage + "% of " + total + " is " + result;
	    System.out.println(record);
		super.records(record);
		System.out.println("Exit");
	}

}
