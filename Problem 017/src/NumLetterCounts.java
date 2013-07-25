import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * 
 * @author timothymiko
 * Date: 7/25/2013
 * 
 */
public class NumLetterCounts {

	public static void main(String[] args) throws FileNotFoundException {
		
		generateFile(); // generate file with numbers

		// Import file
		Scanner scanner = new Scanner(new File("src/numbers.txt"));
		int count = 0;
		
		// Filter through the file and get letter count
		for (int i = 0; i < 1000; i++ )
		{
			String line = scanner.nextLine();
			line = line.replaceAll("(\\s)|(-*)", ""); // remove all whitespaces & hyphens
			count += line.length(); // increase the count by the character length
		}
		
		System.out.println("Number of characters: " + count); // output the results

	}
	
	// Used to generate numbers file
	public static void generateFile()
	{
		BufferedWriter out = null;
		
		String[] oneToNine = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] tenToNineteen = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String[] others = { "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		
		try {
			
			out = new BufferedWriter(new FileWriter("src/numbers.txt"));
			
			/** PRINTING OUT 1-99 **/
			
			for (int i = 0; i < oneToNine.length; i++) 
			{
				out.write(oneToNine[i]);
				out.newLine();
			}
			
			for (int i = 0; i < tenToNineteen.length; i++)
			{
				out.write(tenToNineteen[i]);
				out.newLine();
			}
			
			for (int i = 0; i < others.length; i++)
			{
				for (int j = 0; j < oneToNine.length; j++)
				{
					if ( j == 0 )
					{
						out.write(others[i]);
						out.newLine();
					}
					
					out.write(others[i] + "-" + oneToNine[j]);
					out.newLine();
				}
			}
			
			/** PRINTING OUT 100-999 */
			
			for ( int i = 0; i < oneToNine.length; i++ )
			{
				out.write(oneToNine[i] + " hundred");
				out.newLine();
				
				for (int j = 0; j < oneToNine.length; j++) 
				{
					out.write(oneToNine[i] + " hundred and " + oneToNine[j]);
					out.newLine();
				}
				
				for (int j = 0; j < tenToNineteen.length; j++)
				{
					out.write(oneToNine[i] + " hundred and " + tenToNineteen[j]);
					out.newLine();
				}
				
				for (int k = 0; k < others.length; k++)
				{
					for (int j = 0; j < oneToNine.length; j++)
					{
						if ( j == 0 )
						{
							out.write(oneToNine[i] + " hundred and " + others[k]);
							out.newLine();
						}
						
						out.write(oneToNine[i] + " hundred and " + others[k] + "-" + oneToNine[j]);
						out.newLine();
					}
				}
			}
			
			out.write("one thousand");
			
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
