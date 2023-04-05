package com.shilpa.assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;

public class FactorialLambda {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number:");
		int number = 0;
		try {
			number = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Please enter a number");
		}
		IntBinaryOperator multiply = (int a, int b) -> a * b;
		long fact = IntStream.rangeClosed(1, number).reduce(1, multiply);
		System.out.println("Factorial of the number is " + fact);
	}
}
