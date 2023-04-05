package come.shilpa.eight;

public class PrimeNumber {

	public boolean[] calculatePrime(int limit) {
		if (limit < 0 || limit > 10000) {
			throw new RuntimeException("Limit is either negetive or more that 10000");
		}
		boolean[] primes = new boolean[limit];
		for (int i = 0; i < primes.length; i++) {
			primes[i] = true;
		}

		for (int i = 2; i < primes.length; i++) {
			if (primes[i])
				for (int j = i; j * i < primes.length; j++) {
					primes[i * j] = false;
				}
		}
		return primes;
	}
}