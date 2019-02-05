#include<bits/stdc++.h>
using namespace std;
int main()
{
	string s;
	cout<<"enter the string\n";
	getline(cin,s);
	map <char,int> hash;
	
	for(char i='0';i<='9';i++)
	{
		hash[i]=0;
	}
	
	for(int i=0;i<s.size();i++)
	{
		if(s[i]!=' ' )
		hash[s[i]]+=1;
	}
	
	int max=INT_MIN;
	for(char i='0';i<='9';i++)
	{
		if(hash[i]>max)
		{
			max=hash[i];
		}
	}
	
	
	int temp=INT_MAX;
	cout<<endl;
	for(char i='0';i<='9';i++)
	{
		if(hash[i]==max)
		{
			if(i<temp)
			{
				temp=i;
			}
		}
	}
	cout<<temp-'0'<<endl;
	
	return 0;
}
