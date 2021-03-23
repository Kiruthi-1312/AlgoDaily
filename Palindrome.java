//Given a string str, can you write a method that will return True if is a palindrome and False if it is not?



import java.util.*;
import java.lang.*;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		
		StringBuffer str1 = new StringBuffer(str);
		str1.reverse();
		
		String s1 = str1.toString();
		
		if(s1.equals(str))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
	}

}
