package week1.day1;

public class SumOfDigits {
	/*
	 * Goal: Find the sum of digits of a given number
	 * 
	 * input: 123 output: 1+2+3 = 6
	 * 
	 */

	public static void main(String[] args) {
// Declare your input number (int)
		int input = 123;
		// Initialize an integer variable by name: sum
		int digit, sum = 0;
		// Use loop to calculate the sum: use while loop to set condition until the
		// number goes greater than 0
		while (input != 0) {
			digit = input % 10;
			// System.out.println("first sum "+sum);
			sum = sum + digit;
			// System.out.println(digit);
			input = input / 10;
			// System.out.println(input);
		}
		// Outside the loop: print the final sum
		System.out.println("Sum of Digits: " + sum);
	}

}
