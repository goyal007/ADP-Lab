#include<bits/stdc++.h>
using namespace std;
class oper
{
    int num1,num2;
    public:
        oper()
        {
            
        }
        oper(int a,int b)
        {
            num1=a;
            num2=b;
        }
        oper operator + (oper & temp)
        {
            oper t;
            t.num1=num1*temp.num2+num2*temp.num1;
            t.num2=num2*temp.num2;
            int q=__gcd(t.num1, t.num2);
            t.num1/=q;
            t.num2/=q;

            return t;
        }
        oper operator - (oper & temp)
        {
            oper t;
            t.num1=num1*temp.num2-num2*temp.num1;
            t.num2=num2*temp.num2;
            int q=__gcd(t.num1, t.num2);
            t.num1/=q;
            t.num2/=q;
            return t;
        }
        oper operator * (oper & temp)
        {
            oper t;
            t.num1=num1*temp.num1;
            t.num2=num2*temp.num2;
            int q=__gcd(t.num1, t.num2);
            t.num1/=q;
            t.num2/=q;
            return t;
        }
        oper operator / (oper & temp)
        {
        	if(temp.num1!=0)
        	{
        		oper t;
            	t.num1=num1*temp.num2;
            	t.num2=num2*temp.num1;
            	int q=__gcd(t.num1, t.num2);
	            t.num1/=q;
	            t.num2/=q;
	            return t;
			}
			else
			{
				cout<<"Division not Possible."<<'\n';
				exit(0);
			}
            
        }
        int operator > (oper & temp)
        {
            float r1,r2;
            r1=num1*1.0/num2*1.0;
            r2=temp.num1*1.0/temp.num2*1.0;
            if(r1>r2)
            	return 1;
            else
            	return 0;
        }
        int operator < (oper & temp)
        {
            float r1,r2;
            r1=num1*1.0/num2*1.0;
            r2=temp.num1*1.0/temp.num2*1.0;
            if(r1<r2)
            	return 1;
            else
            	return 0;
        }
        int operator == (oper & temp)
        {
            float r1,r2;
            r1=num1*1.0/num2*1.0;
            r2=temp.num1*1.0/temp.num2*1.0;
            if(r1==r2)
            	return 1;
            else
            	return 0;
        }
        void display()
    	{
    		cout<<num1<<" / "<<num2;
    	}
};
int main()
{
    oper f1(3,8),f2(5,8),f3(1,2),f4(1,2),f5(1,2),f6(1,10);
    f1.display();
    cout<<endl;
    f2.display();
    cout<<endl;
    oper sum,sub,mul,div;
    sum=f1+f2;
    cout<<"Sum:"<<endl;
    sum.display();
    cout<<endl;
    sub=f1-f2;
    cout<<"Sub:"<<endl;
    sub.display();
    cout<<endl;
    mul=f1*f2;
    cout<<"Mul:"<<endl;
    mul.display();
    cout<<endl;
    div=f1/f2;
    cout<<"Div:"<<endl;
    div.display();
    cout<<endl;
    if(f3==f4)
    {
    	f3.display() ;
    	cout<<" == ";
    	f4.display();
    	cout<<endl;
    }
    else
    {
    	f3.display() ;
    	cout<<" != ";
    	f4.display();
    	cout<<endl;
    }
    if(f5>f6)
    {
    	f5.display();
    	cout <<" > ";
    	f6.display();
    	cout<<endl;
    }
    else
    {
    	f5.display() ;
    	cout<<" < ";
    	f6.display();
    	cout<<endl;
    }
    if(f1<f2)
    {
    	f1.display() ;
    	cout<<" < ";
    	f2.display();
    	cout<<endl;
    }
    else
    {
    	f1.display() ;
    	cout<<" > ";
    	f2.display();
    	cout<<endl;
    }
	return 0;
}
