package AdvancedCalculator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainInterface  {
	static Arithmetic ar; 
	
	public static void Menu() {
		Scanner sc = new Scanner(System.in);
		Methods a = new Methods();
		int op=0;
		try {
			System.out.println("\n");
		System.out.println("Select the Function to be performed :");
		System.out.println("1. Arithmetic Functions");
		System.out.println("2. Trigonometry Functions");
		System.out.println("3. Methods or functions");

		op=sc.nextInt();
		if(op==1){
			System.out.println("Select the Operation to be performed :");
			System.out.println("----------------------------------------------");
			
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			
			op=sc.nextInt();
			switch(op) {
			case 1:
				a.Addition();
				
				Menu();
				break;
			case 2:
				a.Subtraction();
				
				Menu();
				break;
			case 3:
				a.Multiplication();
				
				Menu();
				break;
			case 4:
				a.Division();
				
				Menu();
				break;
			
			default:
				System.out.println("please Select the valid Operation");
				
				Menu();
				break;
			}
			
			
		}else if(op==2) {
			
			System.out.println("Select the Operation to be performed :");
			System.out.println("----------------------------------------------");
			
			System.out.println("1. Sin Function");
			System.out.println("2. Cos Function");
			System.out.println("3. Tan Function");
			
			op=sc.nextInt();
			
			switch(op) {
			case 1:
				a.SinFun();
				
				Menu();
				break;
			case 2:
				a.cosFun();
				
				Menu();
				break;
			case 3:
				a.tanFun();
				
				Menu();
				break;
			default:
				System.out.println("Please select the valid operation : ");
				Menu();
				break;
			
			}
		
		
		}
		else if(op==3) {
			System.out.println("Select the Operation to be performed :");
			System.out.println("----------------------------------------------");
			
			
			
			System.out.println("1. Square");
			System.out.println("2. Square Root");
			System.out.println("3. Log");
			System.out.println("4. Power of a number");
			System.out.println("5. LCM");
			System.out.println(". Percentage of a number");
			
			op=sc.nextInt();
			switch(op) {
			case 1:
				a.Sqr();
				
				Menu();
				break;
			case 2:
				a.SqrRoot();
				
				Menu();
				break;
			case 3:
				a.logFun();
				
				Menu();
				break;	
			case 4:
				a.pow();
				
				Menu();
				break;
			case 5:
				a.lcm();
				
				Menu();
				break;
			case 6:
				a.percentage();
				
				Menu();
				break;	
			default:
				System.out.println("Please select the valid operation : ");
				Menu();
				break;
			}
			
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Menu();

	}
}
