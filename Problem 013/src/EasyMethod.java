/**
 * 
 * @author timothymiko
 * Date: 6/12/2013
 * 
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;


public class EasyMethod {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		BufferedReader fileIn = new BufferedReader(new FileReader(
				"src/numbers.txt"));
		BigInteger nums[] = new BigInteger[100];
		Scanner scanner = new Scanner(fileIn);
		
		// import data from file
		for (int i = 0; i < 100; i++) {
			nums[i] = new BigInteger(scanner.nextLine());
		}
		
		BigInteger sum = new BigInteger("0");
		
		for (int i = 0; i < nums.length; i++) {
			sum = sum.add(nums[i]);
		}
		
		System.out.println(sum);
	}

}
