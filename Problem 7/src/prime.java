import java.util.ArrayList;


public class prime {
	
	// Checks to see if the input is prime or not
	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
	
	// Returns the first n prime numbers
	public static ArrayList<Integer> genPrime(int n) {
		
		//variable declaration
		ArrayList<Integer> primes = new ArrayList<Integer>();
		int count = 0;
		
		//generates the first n prime numbers
		for (int i = 2; count < n; i++) {

			if (isPrime(i) == true) {
				primes.add(i);
				count++;
			}
		}
		
		return primes;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> primes = genPrime(10001);
		
		System.out.println("10001st prime: " + primes.get(10000));

	}
}
