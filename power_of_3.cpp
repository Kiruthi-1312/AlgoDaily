//Given an integer n, write a method to determine if it is a power of 3.


#include<iostream>
using namespace std;

int main()
{
	int n;
	cout<<"Enter the number : "<<endl;
	cin>>n;
	if(n<2)
	cout<<"false";
	else
	{
		while(n%3==0)
	 {
		n = n/3;
	 }
	 if(n==1)
	 cout<<"True";
	 else
	 cout<<"False";
	}

}
