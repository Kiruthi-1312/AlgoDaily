// Given two strings s1 and s2, find if s1 is a substring of s2. If yes, return the index of the first occurrence, else return -1.


/********** TIME COMPLEXITY : O(n) ***************/

import java.util.*;
public class Substring {

	public static int isSubstring(String s1,String s2)
	{
		int t=0,i;
		
		for(i=0;i<s1.length();i++)
		{
			if(t==s2.length())
				break;
			if(s1.charAt(i)==s2.charAt(t))
				t++;
			else
				t=0;
		}
		return t<s2.length() ? -1 : (i-t);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println("Enter the substring to be searched : ");
		String s1 = sc.next();
		
		System.out.println(isSubstring(s,s1));

	}

}
