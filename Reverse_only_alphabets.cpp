// You are given a string that contains alphabetical characters (a - z, A - Z) and some other characters ($, !, etc.). For example, one input may be:

//'sea!$hells3'

//Can you reverse only the alphabetical ones?





#include<bits/stdc++.h>
using namespace std;

bool isalpha(char c)
{
	return (c >= 65 && c <= 90) ||(c >= 97 && c <= 122);
}

int main()
{
	char str[100];
	cout<<"Enter the string : ";
	cin>>str;
	
	int l=0,r=strlen(str)-1;
	
	while(l<r)
	{
		if(!isalpha(str[l]))
		{
			l++;
		}
		else if(!isalpha(str[r]))
		{
			r--;
		}
		else
		{
			swap(str[l],str[r]);
			l++;
			r--;
		}
	}
	cout<<str;
}
