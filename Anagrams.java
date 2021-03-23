//We are given two strings like "cinema" and "iceman" as inputs. 
//Can you write a method isAnagram(str1, str2) that will return true or false depending on whether the strings are anagrams of each other?



import java.util.*;

public class Anagrams {

	 void isAnagram(String s1,String s2)
	{
		String str1 = s1.replaceAll("\\s","");
		String str2 = s2.replaceAll("\\s","");
		
		boolean result = true;
		
		if(str1.length()!=str2.length())
		{
			result = false;
		}
		else
		{
			char[] arr1 = str1.toLowerCase().toCharArray();
			char[] arr2 = str2.toLowerCase().toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			 result = Arrays.equals(arr1, arr2);
		}
		String op = result ? "Given Strings are Anagram" :"Given Strings are not Anagram";
		System.out.println(op);
	}
	
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	
	Anagrams an = new Anagrams();
	//an.isAnagram("cinema","iceman");
   
   System.out.println("Enter the two strings :");
	String s1 = sc.next();
	String s2 = sc.next();
	an.isAnagram(s1, s2);
	
	}

}
