package week1.day2;

public class NegToPosNumber {
	public static void main(String[] args) {

	int number = -40;
	System.out.println("The Negative number is: "+number);
	if(number < 0)
	{
		int positive = Math.abs(number);
		System.out.println("The positive number is: "+positive);
	}
		
	}
}
