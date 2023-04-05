/**
 * 
 */
package com.shilpa.assignment2;

import java.util.Scanner;

/**
 * @author shilp
 *
 */
public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = scanner.nextInt();
		int factorial = 1;  
		for (int i = number; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println("Factorial of enetrered number is " + factorial);

		int newFact = calcFact(number);
		System.out.println(newFact);
	}

	public static int calcFact(int number) {
		if (number == 1) {
			return 1;
		}
		int fact = number;
		fact = fact * calcFact((number - 1));
		return fact;
	}
}
