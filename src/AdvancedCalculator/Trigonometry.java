package AdvancedCalculator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Trigonometry {
	 static String record="",old="",title=" !!!!!!!! ADVANCED CALCULATOR !!!!!!! \n"+System.lineSeparator();
	
	Scanner sc = new Scanner(System.in);
	public static void records(String str) {
		try {
			FileWriter fw = new FileWriter("D:\\Records.txt");
			old = title+old + System.lineSeparator()+"->  "+str;
			fw.write(old);
			title=" ";
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void SinFun() {
		System.out.println("Enter the degree to find the sin -> ");
		int degree =sc.nextInt();
		double numberS = Math.toRadians(degree);
		System.out.println("----------------------------------------------");
		System.out.println();
		
		double Sin = Math.sin(numberS);
		record =("Sin (" + numberS + ") is " + Sin);
		System.out.println(record);
		records(record);
		System.out.println("Exit");
		
	}
	
	public void cosFun() {
		System.out.println("Enter the degree to find the Cos -> ");
		int degree =sc.nextInt();
		double numberS = Math.toRadians(degree);
		System.out.println("----------------------------------------------");
		System.out.println();
		
		double cos = Math.cos(numberS);
		record =("Cos (" + degree + ") is " + cos);
		System.out.println(record);
		records(record);
		System.out.println("Exit");
		
	}
	public void tanFun() {
		System.out.println("Enter the degree to find the tan -> ");
		int degree =sc.nextInt();
		double numberS = Math.toRadians(degree);
		System.out.println("----------------------------------------------");
		System.out.println();
		
		
		double tan = Math.tan(numberS);
		record=("tan (" + degree + ") is " + tan);
		System.out.println(record);
		records(record);
		System.out.println("Exit");
		
	}


	
}
