package week1.day1;

public class Factorial {
	// To find the factorial of 5
	// 1*2*3*4*5 = 120
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5;
		int fact = 1;
		for (int i = 1; i <= input; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial value of 5 is:" + fact);
	}

}
