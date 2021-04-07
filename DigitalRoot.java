//We're provided a positive integer num. Can you write a method to repeatedly add all of its digits until the result has only one digit?

//Digital Root (repeated digital sum) of the given large integer



import java.util.*;
public class DigitalRoot {

	public static void main(String[] args) {
		System.out.println("Enter the number : ");
		
		Scanner sc =  new Scanner(System.in);
		
		long n = sc.nextLong();
		
		System.out.println("Sum of Digits");
		if(n==0)
			System.out.println("0");
		else if(n%9==0)
			System.out.println("9");
		else
			System.out.println(n%9);
	}

}
