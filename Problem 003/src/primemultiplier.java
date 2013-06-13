import java.math.BigInteger;
import java.util.ArrayList;

public class primemultiplier {

	// Checks if number is prime
	public static boolean isPrime(int number) {
		
		for (int i = 2; i < Math.sqrt(number); i++) {
			
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	// Returns the largest prime factor of a number
	// Requires a list of prime numbers. For larger numbers, a larger list of primes is required.
	public static BigInteger largestPrimeFactor(BigInteger number, ArrayList<Integer> prime) {
		
		for (int i = 0; i < prime.size(); i++) {
			
			while (number.mod(BigInteger.valueOf(prime.get(i))) == BigInteger.valueOf(0)) {
				if (number.divide(BigInteger.valueOf(prime.get(i))).longValue() == 1) {
					break;
				}
				
				number = number.divide(BigInteger.valueOf(prime.get(i)));
			}
		}
		return number;
	}

	public static void main(String[] args) {

		// variable declaration
		int count = 0; // control variable to keep track of the number of primes
		ArrayList<Integer> prime = new ArrayList<Integer>(); // holds the list of prime numbers
		BigInteger number = new BigInteger("600851475143"); // initial number
		BigInteger factor; // largest prime factor of number

		//generates the first 1000 prime numbers
		for (int i = 2; count < 1000; i++) {

			if (isPrime(i) == true) {
				prime.add(i);
				count++;
			}
		}
		
		// Returns largest prime factor and outputs result
		factor = largestPrimeFactor(number, prime);
		System.out.println("The largest prime factor of " + number + " is " + factor + ".");
	}

}
