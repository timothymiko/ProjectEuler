
public class smallestmultiple {

	public static void main(String[] args) {
		
		boolean control = false;
	
		// Starts at 2521 due to the conditions given in the problem. Continues 
		// infinitely until an answer has been found
		for (int num = 2521; num > 0; num++) {
			
			//loop through 1 - 20 and checks to see if the number is divisible by each one
			for (int i = 1; i <= 20; i++) {
				
				control = false;
				
				// if the number is not divisble by i, then the control is set to false
				// and the current iteration of the for loop is stopped.
				if (num%i != 0) {
					control = true;
					break;
				}
			}
			
			//if the number makes it through the second for loop without turning the control variable to false.
			//the answer has been found
			if (control == false) {
				System.out.println("Smallest number evenly disivible by the numbers 1 through 20: " + num);
				break;
			}
		}
	}
}
