//Can you write a function that takes two arrays as inputs and returns to us their intersection? 
//We can call the method intersection. Let's return the intersection of the two inputs in the form of an array.
//As a reminder, the definition of an intersection of two sets A and B is the 
//set containing all elements of A that also belong to B (or equivalently, all elements of B that also belong to A).



#include<bits/stdc++.h>
using namespace std;

void intersection(vector<int> arr1,vector<int>arr2,int n)
{
	set<int> arr_inter;
	
	for(int i=0;i<arr1.size();i++)
	{
		arr_inter.insert(arr1[i]);
	}
	
	for(int i=0;i<n;i++)
	{
		if(arr_inter.find(arr2[i]) != arr_inter.end())  //set.find() function returns to end if the element is not found
		cout<<arr2[i]<<" ";
	}
}

int main()
{
	vector<int> arr1;
	vector<int> arr2;
	cout<<"Enter the no of elements in arr1 and arr2"<<endl;
	int m,n,temp;
	cin>>m>>n;
	cout<<"Enter array 1 elements"<<endl;
	for(int i=0;i<m;i++)
	{
		cin>>temp;
		arr1.push_back(temp);
	}
	cout<<"Enter array 2 elements"<<endl;
	for(int i=0;i<n;i++)
	{
		cin>>temp;
		arr2.push_back(temp);
	}
	
	intersection(arr1,arr2,n);
}
