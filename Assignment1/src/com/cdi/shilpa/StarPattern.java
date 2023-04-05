package com.cdi.shilpa;
import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		int i = 0;
		System.out.print("Enter the number of rows:");
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		scanner.close();
		for (i = 0; i < rows; i++) {
			for (int k = 0; k <= i; k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		for (i = rows; i > 0; i--) {
			for (int k = 1 * i - 1; k >= 0; k--)
				System.out.print("*");
			System.out.println();
		}
		for (i = 0; i <= rows; i++) {
			for (int j = 0; j <= rows - i - 1; j++)
				System.out.print(" ");
			for (int j = 0; j <= i - 1; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		for (i = rows; i > 0; i--) {
			for (int j = rows - i - 1; j >= 0; j--)
				System.out.print(" ");
			for (int j = i - 1; j >= 0; j--)
				System.out.print("*");
			System.out.println();
		}
	}
}