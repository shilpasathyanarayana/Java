package com.shilpa.assignment2;

import java.util.Scanner;

public class Queens {

	/***************************************************************************
	 * Return true if queen placement q[n] does not conflict with other queens q[0]
	 * through q[n-1]
	 ***************************************************************************/
	public static boolean isConsistent(int[] q, int n) {
		for (int i = 0; i < n; i++) {
			if (q[i] == q[n])
				return false; // same column
			if ((q[i] - q[n]) == (n - i))
				return false; // same major diagonal
			if ((q[n] - q[i]) == (n - i))
				return false; // same minor diagonal
		}
		return true;
	}

	/***************************************************************************
	 * Prints n-by-n placement of queens from permutation q in ASCII.
	 ***************************************************************************/
	public static void printQueens(int[] q) {
		int n = q.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (q[i] == j)
					System.out.print("q ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/***************************************************************************
	 * Try all permutations using backtracking
	 ***************************************************************************/
	public static void enumerate(int m) {
		int[] a = new int[m];
		enumerate(a, 0);
	}

	public static void enumerate(int[] a, int k) {
		int n = a.length;
		if (k == n)
			printQueens(a);
		else {
			for (int i = 0; i < n; i++) {
				a[k] = i;
				if (isConsistent(a, k)) {
					enumerate(a, k + 1);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		enumerate(8);
		scanner.close();
	}

}