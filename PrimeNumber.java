package week1.day1;

public class PrimeNumber {
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare an integer Input and assign a value 13
		int input = 13;
		// Declare a boolean variable flag as false
		boolean flag = false;
		// Iterate from 2 to half of the input
		for (int i = 2; i <= input / 2; ++i) {
			// Divide the input with each for loop variable and check the remainder
			int reminder = input % i;
			if ( reminder == 0) {
				// Set the flag as true when there is no remainder
				flag = true;
				// break the iterator
				break;
			}

		}
		// Check the flag (Provide a condition)
		if (flag == false)
			System.out.println(input + " is a prime number.");
		else
			System.out.println(input + " is not a prime number.");
	}

}
