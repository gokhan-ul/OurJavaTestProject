package com.neotech.review02;

public class SumEvenOddForLoop {

	public static void main(String[] args) {
		// Add Even numbers
		// Also add Odd numbers
		// Also add All numbers
		// Between 1 && 20
		// Using for loop
		
		int evenSum = 0;
		int oddSum = 0;
		int allSum = 0;
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) { // even
				evenSum += i;
			} else {
				oddSum += i;
			}
			
			allSum += i;
		}
		
		System.out.println("The sum of even numbers -> " + evenSum);
		System.out.println("The sum of even numbers -> " + oddSum);
		System.out.println("The sum of even numbers -> " + allSum);
		
	}

}
