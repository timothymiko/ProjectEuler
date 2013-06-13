import java.util.ArrayList;


public class triplet {
	
	public static ArrayList<Integer> findTriplet(int num) {
		//variable declaration
		ArrayList<Integer> abc = new ArrayList<Integer>();
		int a = 0, b = 0, c = 0;
		
		//find a, b, and c
		for (int m = 1; m < num; m++) {
			for (int n = m + 1; n < num; n++) {
				
				//based on mathematical proofs, determine the values of a, b, and c
				a = (n*n) - (m*m);
				b = 2*n*m;
				c = (n*n) + (m*m);
				
				//determine if the values of a, b, and c satisfy the criteria for the pythagorean thereom
				if ((a + b + c) == num) {
					
					//add to array
					abc.add(a);
					abc.add(b);
					abc.add(c);
					
					//kill the second for loop
					break;
				}
			}
			
			//if a, b, and c have been found, kill the first for loop
			if ((a + b + c) == num) {
				break;
			}
		}
		
		//retun the arraylist
		return abc;
	}

	public static void main(String[] args) {
		
		//variables and calculations
		ArrayList<Integer> abc = findTriplet(1000);
		int sum = abc.get(0) * abc.get(1) * abc.get(2);
		
		//output value
		System.out.println("Product of abc: " + sum);
	}
}
