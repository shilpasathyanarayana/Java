
public class PrimeNumber {

	public static void main(String[] args) {
		boolean[] primes = new boolean[1000];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}

		for (int i = 2; i < primes.length; i++) {
			if (primes[i])
				for (int j = i; j * i < primes.length; j++) {
					primes[i * j] = false;
				}

		}
		System.out.println("after processing");
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] == true) {
				System.out.println(i);
			}
		}
	}
}
