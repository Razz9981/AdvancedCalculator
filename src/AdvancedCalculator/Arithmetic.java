package AdvancedCalculator;

import java.util.Scanner;

public class Arithmetic extends Trigonometry{
	Scanner sc= new Scanner(System.in);
	String record;
public void Addition() {
		
	
		
		System.out.println("Enter two number for Addition -> ");
		System.out.println("----------------------------------------------");
		
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		
		System.out.println();
		double Addition =number1+number2 ;
		record = "Addition of numbers " + number1+" + "+ number2 + " is " + Addition;
		System.out.println(record);
		super.records(record);
		System.out.println("Exit");
	
		
	}
public void Subtraction() {
	
	
	System.out.println("Enter two number for Subtraction -> ");
	System.out.println("----------------------------------------------");
	
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	
	System.out.println();
	double Subtraction =number1-number2 ;
	record = "Subtraction of numbers " + number1+" - "+ number2+ " is " + Subtraction;
	System.out.println(record);
	super.records(record);
	System.out.println("Exit");
	
}
public void Multiplication() {
	
	
	System.out.println("Enter two number for Multiplication -> ");
	System.out.println("----------------------------------------------");
	
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	
	System.out.println();
	double Multiplication =number1*number2 ;
	record ="Multiplication of numbers " + number1+" + "+ number2 + " is " + Multiplication;
	System.out.println(record);
	super.records(record);
	System.out.println("Exit");
	
}
public void Division() {
	
	
	System.out.println("Enter two number for Division -> ");
	System.out.println("----------------------------------------------");
	
	int number1 = sc.nextInt();
	int number2 = sc.nextInt();
	
	System.out.println();
	int Division =number1/number2 ;
	record= "Division of numbers " + number1+" / "+ number2 + " is " + Division;
	System.out.println(record);
	
	if(number1%number2 !=0) {
		int remainder=number1%number2;
		
		System.out.print(remainder);
		record =record +" and The Remainder is = "+remainder;
	}
	super.records(record);
	System.out.println("Exit");
	
}





}




