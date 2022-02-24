package week1.day2;

public class Calculator {
	/*
	 * Create a class "Calculator" with below methods (a) add(int num1, int num2,int
	 * num3), it should return sum of num1+num2+num3 (b) sub(int num1, int num2), it
	 * should return subtraction of of num1-num2 (c) mul(double num1, double num2),
	 * it should return product of num1 * num2 (d) divide(float num1,float num2), it
	 * should return division of num1 / num2
	 */

	public static int addThreeNumbers(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		// System.out.println(sum);
		return sum;
	}

	public int subTwoNumbers(int num1, int num2) {
		int sub = num1 - num2;
		return sub;
	}

	public int multiplyTwoNumbers(int num1, int num2) {
		int multiply = num1 * num2;
		return multiply;
	}

	public float divideTwoNumbers(float num1, float num2) {
		float divide = num1 / num2;
		return divide;
	}

	
}
