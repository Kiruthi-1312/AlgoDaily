//Suppose we're given an array of numbers like the following:

//[4, 2, 4]

//Could you find the majority element? 

//A majority is defined as "the greater part, or more than half, of the total. It is a subset of a set consisting of more than half of the set's elements."

/* Naive Approach (using 2 for loops)*/


import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int maxCount =0,index=-1;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=0;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			if(count > maxCount)
			{
				maxCount=count;
				index=i;
			}	
				
		}
		
		if(maxCount > n/2)
		{
			System.out.println("Majority Element is "+arr[index]);
		}
		else
		{
			System.out.println("No Majority Element");
		}
	}

}
