import java.util.ArrayList;

public class multiples {

	public static void main(String[] args) {
		
		//variables
		int count = 0;
		int sum = 0;
		
		//arraylist to hold values
		ArrayList<Integer> threesFives = new ArrayList<Integer>();
		
		//adds all multiples of 3 and 5 below 1000 to arraylist
		for (int i = 1; i < 1000; i++) {
			
			if (i%3 == 0 || i%5 == 0) {
				threesFives.add(count, i);
				count++;
			}
			
		}

		//calculates the sum of the array
		for (int i = 0; i < threesFives.size(); i++) {
			sum += threesFives.get(i);
		}
		
		//prints out the answer
		System.out.println("The sum of the multiples of 3's and 5's below 1000 is " + sum + ".");
		
	}

}