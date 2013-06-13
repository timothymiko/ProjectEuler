import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class trinumbers {

	// method to generate nth triangle number
	public static int genTriNumber(int n) {
		int num = 0;
		
		// function to find the nth number
		num = (n*(n+1))/2;
		
		// return the result
		return num;
	}
	
	// method to determine if a number is prime or not
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
	
	// method to generate the first n primes
	public static ArrayList<Integer> genPrime(int n) {

		// variable declaration
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int count = 0;

		// generates the first n prime numbers
		for (int i = 2; count < n; i++) {

			if (isPrime(i) == true) {
				primes.add(i);
				count++;
			}
		}

		return primes;
	}
	
	// returns the prime factorization of a number
	public static Map<Integer, Integer> PrimeFactors(BigInteger number,
			ArrayList<Integer> prime) {
		
		// Array list to hold initial factors and map to get rid of duplicates and add factors
		ArrayList<Integer> factors = new ArrayList<Integer>();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		// Determines the factors of a number and adds it to the factors array
		for (int i = 0; i < prime.size(); i++) {
			
			// Using array of primes, checks if dividing the number gives a valid result,
			// if it does, it adds it to the factors array
			while (number.mod(BigInteger.valueOf(prime.get(i))).longValue() == 0) {
				number = number.divide(BigInteger.valueOf(prime.get(i)));
				factors.add(prime.get(i));
			}

			// Ends if there aren't anymore factors
			if (number.equals(1)) {
				break;
			}

		}

		// Weeds out duplicates and adds the factors to a map
		// with the key being the factor and the value the 
		// the exponent
		for (int i = 0; i < factors.size(); i++)
		{
		    if(map.containsKey(factors.get(i)))
		    {
		        map.put(factors.get(i), map.get(factors.get(i))+1);
		    }
		    else
		    {
		        map.put(factors.get(i), 1);
		    }
		}

		return map;
}
	// Returns the number of divisors a number has using a hashmap of its factors and their respective exponents
	public static int numOfDivisors(Map<Integer, Integer> factors) {
		
		int divisors = 1;
		
		// get the exponents of all the factors into an arraylist
		ArrayList<Integer> exponents = new ArrayList<Integer>(factors.values());
		
		// if n = a^x + b^y + c^z, then the number of divisors it has is
		// equal to (x+1)*(y+1)*(z+1)
		for (int i = 0; i < exponents.size(); i++) {
			divisors *= (exponents.get(i)+1);
		}
		
		return divisors;
	}

	public static void main(String[] args) {
		
		// generates the first 10,000 prime numbers
		ArrayList<Integer> prime = genPrime(10000);
		
		// Finds the first triangle number that has more than 500 divisors
		for (int n = 1; n > 0; n++) {
			int number = genTriNumber(n);
			int divisors = numOfDivisors(PrimeFactors(BigInteger.valueOf(number), prime));
			
			// Checks if the current triangle number has more than 500 divisors
			// Outputs and breaks the loop if true
			if (divisors >= 500) {
				System.out.println("First triangle number with more than 500 divisors: " + number);
				break;
			}
		}
	}

}