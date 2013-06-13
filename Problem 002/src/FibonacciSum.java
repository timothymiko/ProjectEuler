import java.util.ArrayList;


public class FibonacciSum {

	public static void main(String[] args) {
		
		//variable declaration
		int sum = 0, firstFibonacci, secondFibonacci;
		ArrayList<Integer> fibonacci = new ArrayList<Integer>();
		ArrayList<Integer> even = new ArrayList<Integer>();
		
		//initial values of Fibonacci sequence
		fibonacci.add(0, 1);
		fibonacci.add(1, 2);
		
		//generates the fibonacci sequence and adds the even values to an arraylist
		while (fibonacci.get(1) <= 4000000) {
			
			//loop variable declaration
			firstFibonacci = fibonacci.get(0);
			secondFibonacci = fibonacci.get(1);
			int middleman = firstFibonacci + secondFibonacci;
			
			//checks if the number stored in secondFibonacci is even
			if (secondFibonacci % 2 == 0) {
				even.add(secondFibonacci);
			}
			
			//checks if the number stored in middleman is even
			if (middleman % 2 == 0) {
				even.add(middleman);
			}
			
			//continues fibonacci sequence while conserving memory
			fibonacci.remove(0);
			fibonacci.add(0, middleman);
			fibonacci.remove(1);
			fibonacci.add(1, middleman + secondFibonacci);
		}
		
		//adds the sum of the even numbers
		for (int i = 0; i < even.size(); i++) {
			sum += even.get(i);
		}
		
		//outputs the sum
		System.out.println("Sum: "+sum);

	}

}
