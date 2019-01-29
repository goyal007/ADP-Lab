#include<bits/stdc++.h>
using namespace std;
class encryption
{
	public:
	bool check(string password)
	{
		int length=password.size();
		if(length<5 || length>12)
			return false;
		int one_lower=0;
		int one_digit=0;
		for(int i=0;i<length;i++)
		{
			if(isupper(password[i]))
			{
			//	cout<<"1"<<endl;
				return false;
			}
			if(isdigit(password[i]))
			{
				one_digit++;
			}
			 if(islower(password[i]))
			{
				one_lower++;
			}
			//cout<<one_lower<<" "<<one_digit;
			
			if(isdigit(password[i])  || islower(password[i]))
			{
				
			}
			else
			{
			//	cout<<"3"<<endl;
				return false;
			}
			
			
		}
				int i=0;
				int j=0;
				int index=0;
				while(i<length)
				{
					int temp=i;
					j=i+1;
					while(j<length)
					{
					temp=i;
						//cout<<password[temp]<<"\t"<<password[j]<<"\t"<<temp<<"\t"<<j<<"\n";
					//cout<<"result"<<(password[j]==password[temp])<<endl;
						if(password[j]==password[temp]  && j<length)
						{
							index=j;
							if(index-1==temp)
							{
							//	cout<<"4"<<endl;
								return false;
							}
						
							j++;
							temp++;
							while(password[j]==password[temp] && j<length)//strcmp
							{
								//cout<<password[temp]<<"\t"<<password[j]<<"\t"<<temp<<"\t"<<j<<"\t"<<index<<"\n";
								j++;
								temp++;
							}
							
							if(index==temp)
							{
								//cout<<"5"<<endl;
								return false;
							}
						}
						
						j++;
					}
						
					
					i++;
				}
		if(one_lower>=1 && one_digit>=1)
			{
			
			}
			else
			{
			//	cout<<"2"<<endl;
				return false;
			}
		return true;
	}
};
int main()
{
	encryption e1;
	string s1;
	cout<<"enter password:"<<endl;
	cin>>s1;
	bool result=e1.check(s1);
	if(result)
	{
		cout<<"correct";
	}
	else
	{
		cout<<"incorrect";
	}
	return 0;
}
