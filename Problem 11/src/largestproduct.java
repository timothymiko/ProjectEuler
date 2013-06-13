import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class largestproduct {

	public static void main(String[] args) throws IOException {

		/** DATA IMPORT */

		// variable declaration
		BufferedReader fileIn = new BufferedReader(new FileReader(
				"src/grid.txt"));
		int nums[][] = new int[20][20];
		Scanner scanner = new Scanner(fileIn);

		// import data from file
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				nums[i][j] = scanner.nextInt();
			}
		}


		/** END OF DATA IMPORT */

		/** CALCULATIONS */
		
		//variable declaration
		int largestNumber = 0;
		
		//calculations
		for (int i = 0; i < 17; i++) {
			for (int j = 0; j < 17; j++) {
				if ((nums[i][j] * nums[i+1][j] *
						nums[i+2][j] * nums[i+3][j]) > largestNumber) {
					largestNumber = nums[i][j] * nums[i+1][j] * nums[i+2][j] * nums[i+3][j];
				}
				
				if ((nums[i][j] * nums[i][j+1] *
						nums[i][j+2] * nums[i][j+3]) > largestNumber) {
					largestNumber = nums[i][j] * nums[i][j+1] * nums[i][j+2] * nums[i][j+3];
				}
				
				if ((nums[i][j] * nums[i+1][j+1] *
						nums[i+2][j+2] * nums[i+3][j+3]) > largestNumber) {
					largestNumber = nums[i][j] * nums[i+1][j+1] * nums[i+2][j+2] * nums[i+3][j+3];
				}
				
				if ((nums[i+3][j] * nums[i+2][j+1] *
						nums[i+1][j+2] * nums[i][j+3]) > largestNumber) {
					largestNumber = nums[i+3][j] * nums[i+2][j+1] * nums[i+1][j+2] * nums[i][j+3];
				}
			}
		}
		
		/** END OF CALCULATIONS */
		
		// Print out the result
		System.out.println("The largest product of 4 consecutive numbers in the grid is " + largestNumber);

	}
}
