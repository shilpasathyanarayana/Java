/**
 * 
 */
package come.shilpa.eight;

import java.util.Scanner;

/**
 * @author shilp
 *
 */
public class PrimeTester {
	public static void main(String[] args) {
		System.out.println("Enter the limit:");
		Scanner scanner = new Scanner(System.in);
		int limit = scanner.nextInt();
		PrimeNumber prime = new PrimeNumber();
		try {
			boolean[] primes = prime.calculatePrime(limit);
			System.out.println("after processing");
			for (int i = 0; i < primes.length; i++) {
				if (primes[i] == true) {
					System.out.println(i);
				}
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}