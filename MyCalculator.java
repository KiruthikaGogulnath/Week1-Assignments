package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// Creating object
		Calculator obj = new Calculator();
		
		// Using object accessing the methods of other class
		int addition = obj.addThreeNumbers(10, 20, 30);
		System.out.println("The sum of Three numbers is : "+addition);
		
		int subtraction = obj.subTwoNumbers(30, 10);
		System.out.println("The Subtraction of two numbers is : "+subtraction);
		
		int multiplication = obj.multiplyTwoNumbers(15, 10);
		System.out.println("The multiplication of two numbers is : "+multiplication);
		
		float division = obj.divideTwoNumbers(250, 3);
		System.out.println("The division of two numbers is : "+division);
		
	}

}
