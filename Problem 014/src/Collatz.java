

/**
 * 
 * @author timothymiko
 * Date: 7/22/2013
 * 
 */
public class Collatz {
	public static void main(String[] args) {

		// Variables
		int chain = 0;
		int startNum = 0;
		
		// Calculations
		for ( int start = 1000000; start > 1; start-- )
		{
			int count = 1;
			long num = start;
			
			// Collatz sequence iterations
			while ( num != 1 )
			{
				if ( (num % 2) == 0 )
				{
					num = num/2;
				} else {
					num = 3*num + 1;
				}
				
				count++;
			}
			
			// Check if current sequence is the longest
			if ( count > chain )
			{
				chain = count;
				startNum = start;
			}
		
		}
		
		// Print out the result
		System.out.println(startNum);
		
	}

}
