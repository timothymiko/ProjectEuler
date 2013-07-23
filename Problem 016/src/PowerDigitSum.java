import java.math.BigInteger;


/**
 * 
 * @author timothymiko
 * Date: 7/23/2013
 * 
 */
public class PowerDigitSum {

	public static void main(String[] args) {

		// Calculate 2 to the power of 1000
		BigInteger num = BigInteger.valueOf(2);
		num = num.pow(1000);
		
		// Convert to a string, and then to an array of characters
		String number = num.toString();
		char[] numArray = number.toCharArray();
		
		// Calculate the sum of the numbers represented by the char array
		int sum = 0;
		
		for ( int i = 0; i < numArray.length; i++)
		{
			sum += Integer.parseInt(Character.toString(numArray[i]));
		}
		
		System.out.println("The sum is " + sum + ".");

	}

}
