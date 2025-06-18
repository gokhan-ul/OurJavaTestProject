package com.neotech.review02;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		
		// Ask the User to enter 2 numbers
		// Ask the User for the operator (+, -, /, *)
		// Calculate the result using switch-case
		
		Scanner gokhan = new Scanner(System.in);
		
		System.out.println("Please enter the first number:");
		double d1 = gokhan.nextDouble();
		
		System.out.println("Please enter the second number:");
		double d2 = gokhan.nextDouble();
		
		System.out.println("Please enter the operator (+, -, /, *)");
		String op = gokhan.next();
		
		double result = 0;
		
		switch (op) {
		case "+":
			result = d1 + d2;
			break;
		case "-":
			result = d1 - d2;
			break;
		case "*":
			result = d1 * d2;
			break;
		case "/":
			result = d1 / d2;
			break;
		default:
				System.out.println("Invalid operator");
		}
		
		System.out.println("The result is --> " + result);
		
		
		gokhan.close();
		
	}

}
