import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class largestproduct {

	
	public static void main(String[] args) {
		
		/**variable declaration*/
		File file = new File("/Users/timothymiko/Documents/Development/Project Euler/100digitnumber.txt");
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		char[] parts = null;
		int[] digits = null;
		String number = null;
		int finalNumber = 0;
		
		/**import 1000 digit number file and add the number to an array*/
		//interpret the file
		try {
			fis = new FileInputStream(file);
			
			//use buffered input stream for fast reading
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			//call dis.available() to determine if there are any lines left
			while (dis.available() != 0) {
				
				//import line of numbers into string
				number = dis.readLine();
			}
			
			//close resources
			fis.close();
			bis.close();
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//turn number into array of integers
		parts = number.toCharArray();
		digits = new int[parts.length];
		for (int i = 0; i < parts.length; i++) {
		  digits[i] = parts[i] - '0';
		}

		/** calculations */
		//determine largest multiple of 5 consecutive numbers in number arraylist
		for (int i = 0; i < digits.length-4; i++) {
			
			if ((digits[i] * digits[i+1] * digits[i+2] * digits[i+3] * digits[i+4]) > finalNumber) {
				finalNumber = (digits[i] * digits[i+1] * digits[i+2] * digits[i+3] * digits[i+4]);
			}
			
		}
		
		//print out the result
		System.out.println("Greatest product of 5 consecutive digits: " + finalNumber);
		
	}
}

