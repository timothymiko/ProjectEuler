
public class sumsquaredifference {

	public static void main(String[] args) {
		
		/**determine the sum of the squares of the first 100 natural numbers*/
		//variable declaration
		int sum = 0;
		
		//for loop to determine the sum
		for (int i = 1; i < 101; i++) {
			sum = sum + i*i;
		}
		
		System.out.println("Sum of the squares: " + sum);
		
		/**determine the square of the sum of the first 100 natural numbers*/
		//variable declaration
		int sum2 = 0;
		
		//determine the sum of the first 100 natural numbers
		for (int i = 1; i < 101; i++) {
			sum2 = sum2 + i;
		}
		
		//determine the square of the sum
		int square = sum2*sum2;
		
		/** Results */
		//determine the difference
		int difference = square - sum;
		
		System.out.println("Square of sum: " + square);
		System.out.println("Difference: " + difference);
	}
}
