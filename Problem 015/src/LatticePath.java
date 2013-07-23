import java.math.BigInteger;
import java.util.Scanner;



/**
 * 
 * @author timothymiko
 * Date: 7/23/2013
 * 
 */
public class LatticePath {
	
	// Method to compute the factorial of a number
	private static BigInteger factorial( BigInteger n )
	{
		if ( n.compareTo(BigInteger.valueOf(1)) <= 0 )
		{
			return BigInteger.valueOf(1);
		} else {
			return n.multiply(factorial(n.subtract(BigInteger.valueOf(1))));
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the square grid's width: ");
		int width = scanner.nextInt();
		
		// Assumes the grid is a square
		BigInteger grid = BigInteger.valueOf(width); 
		BigInteger sum = grid.multiply(BigInteger.valueOf(2));
		
		/** Computes the number of lattice paths using binomial coefficients
		*	
		*	See: 
		*	http://mathworld.wolfram.com/LatticePath.html
		*	http://mathworld.wolfram.com/BinomialCoefficient.html
		*
		**/
		BigInteger routes = factorial(sum).divide(factorial(grid).multiply(factorial(sum.subtract(grid))));

		System.out.println("There are " + routes + " routes to the bottom right corner of a " + width + "x" + width + " grid.");
		
	}

}
