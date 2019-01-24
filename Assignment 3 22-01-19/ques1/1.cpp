#include<bits/stdc++.h>
using namespace std;
int main()
{
	string s;
	cout<<"enter the string\n";
	getline(cin,s);
	map <char,int> hash;
	
	for(char i='A';i<='Z';i++)
	{
		hash[i]=0;
	}
	for(char i='a';i<='z';i++)
	{
		hash[i]=0;
	}
	for(int i=0;i<s.size();i++)
	{
		if(s[i]!=' ' )
		hash[s[i]]+=1;
	}
	
	int max=INT_MIN;
	for(char i='A';i<='Z';i++)
	{
		if(hash[i]>max)
		{
			max=hash[i];
		}
	}
	for(char i='a';i<='z';i++)
	{
		if(hash[i]>max)
		{
			max=hash[i];
		}
	}
	
	
	cout<<endl;
	for(char i='A';i<='Z';i++)
	{
		if(hash[i]==max)
		{
			cout<<i;
		}
	}
	for(char i='a';i<='z';i++)
	{
		if(hash[i]==max)
		{
			cout<<i;
		}
	}
	return 0;
}
