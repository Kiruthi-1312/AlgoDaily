//We're given a number in the form of an integer n.

//Write a function that returns the string representation of all numbers from 1 to n based on the following rules:

// If it's a multiple of 3, represent it as "fizz".
// If it's a multiple of 5, represent it as "buzz".
// If it's a multiple of both 3 and 5, represent it as "fizzbuzz".
// If it's neither, just return the number itself.



#include<bits/stdc++.h>
using namespace std;

int main()
{
	int n;
	cout<<"Enter the Number :\n";
	cin>>n;
	
	for(int i=1;i<=n;i++)
	{
		if(i%3==0 && i%5==0)
		{
			cout<<"fizzbuzz ";
		}
		else if(i%3==0)
		{
			cout<<"fizz ";
		}
		else if(i%5==0)
		{
			cout<<"buzz ";
		}
		else
		{
			cout<<i<<" ";
		}
	}
}
