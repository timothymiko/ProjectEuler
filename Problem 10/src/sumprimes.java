import java.math.BigInteger;
import java.util.ArrayList;

public class sumprimes {

	// determines if a number is prime
	public static boolean isPrime(long number) {
		
		// determines if number is prime
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			} 
		}
		return true;
	}

	// generates an array of prime numbers under the value n
	public static ArrayList<Integer> genPrime(int n) {

		// variable declaration
		ArrayList<Integer> primes = new ArrayList<Integer>();
		//int count = 0;

		System.out.println("About to generate all prime numbers under " + n + " .");
		// generates the first n prime numbers
		for (int i = 2; i < n; i++) {

			if (isPrime(i)) {
				primes.add(i);
			}
		}

		System.out.println("Done generating primes.");
		return primes;
	}

	// determine the sum of an array of integers
	public static BigInteger sumArray(ArrayList<Integer> nums) {
		
		// create biginteger of value 0
		BigInteger sum = new BigInteger("0");

		// loop through the array and add all of the numbers together in one
		// biginteger
		for (int i = 0; i < nums.size(); i++) {
			int pass = nums.get(i);
			sum = sum.add(BigInteger.valueOf(pass));
		}
		
		// return the BigInteger
		return sum;
	}

	// main method
	public static void main(String[] args) {
		
		// variables
		ArrayList<Integer> primes = genPrime(2000000);
		BigInteger sum = sumArray(primes);

		// outputs the sum
		System.out.println("Sum of primes: " + sum);
	}
}
