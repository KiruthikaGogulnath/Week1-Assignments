package week1.day1;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 1;
		int num3, i;
		int range = 8;
		System.out.print("The Fibonacci series of Range 8 is : "+ num1 + "," + num2);
		for (i = 2; i < range; ++i) {
			num3 = num1 + num2;
			System.out.print("," + num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
