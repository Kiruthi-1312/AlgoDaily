//Given an array of integers.
//All numbers occur twice except one number which occurs once. Find the number in O(n) time & constant extra space.


#include<iostream>
using namespace std;

int Single(int arr[],int n)
{
	int result = arr[0];
	for(int i=1;i<n;i++)
	{
		result = result ^ arr[i];
	}
	return result;
}

int main()
{
	int arr[] = {2,3,4,3,4,5,2,5};
	int n = sizeof(arr)/sizeof(arr[0]);
	cout<<Single(arr,n);
}
