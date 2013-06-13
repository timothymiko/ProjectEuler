import java.util.ArrayList;
import java.util.Collections;


public class palindromes {

	// Determines if the input is a palindrome
	public static boolean isPalindrome(int i) {
		
		// Converts the inputed number to a string
		String a = Integer.toString(i);
		String firstHalf = a.substring(0, a.length()/2); // First half of the number converted into a string
		String secondHalf = a.substring(a.length()/2); // Second half of the number converted into a string
		
		// Reverses the second half of the string
		StringBuilder secondHalfReversed = new StringBuilder();
		
		for (int c = secondHalf.length() - 1; c >= 0; --c) {
			secondHalfReversed.append(secondHalf.charAt(c));
		}
		
		String newString = secondHalfReversed.toString();
		
		// Checks if the second half matches the first half. Returns true if it does.
		if (firstHalf.equals(newString)) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// ArrayList of palindromes
		ArrayList<Integer> palindromes = new ArrayList<Integer>();
		
		// For loop that creates a list of 6 digit numbers, checks to see if they are
		// a valid palindrome, and adds them to the ArrayList if they are.
		for (int i = 999; i >= 100; --i) {
			for (int a = 999; a >= 100; --a) {
				if (isPalindrome(i*a)) {
					palindromes.add(i*a);
				}
			}
		}
		
		// Outputs the largest palindrome in the list
		System.out.println("Largest palindrome: " + Collections.max(palindromes));
		
	}

}
