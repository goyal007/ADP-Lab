//08-01-19
#include<bits/stdc++.h>
using namespace std;
class complexx
{
	private:
		float real,imag;
	public:
		complexx()
		{
			real=0;
			imag=0;
		}
		complexx(float a,float b)
		{
			real=a;
			imag=b;
		}
		void display()
		{
		cout<<real<<"+("<<imag<<"i)"<<"\n";
		}
		
		
		void input()
		{
			cin>>real>>imag;
		}
		
		complexx operator + (complexx number)
		{
			complexx temp;
			temp.real=real+number.real;
			temp.imag=imag+number.imag;
			return temp;
		}
		complexx operator - (complexx number)
		{
			complexx temp;
			temp.real=real-number.real;
			temp.imag=imag-number.imag;
			return temp;
		}
		complexx operator * (complexx number)
		{
			complexx temp;
			temp.real=real*number.real - imag*number.imag;
			temp.imag=real*number.imag+number.real*imag;
			return temp;
		}
		complexx operator / (complexx number)
		{
			complexx temp;
			float d;
			d=pow(number.real,2)+pow(number.imag,2);
			temp.real=(real*number.real+imag*number.imag)/d;
			temp.imag=(number.real*imag-real*number.imag)/d;
			return temp;
		}
};

int main()
{
//	complexx c1(3,4),c2(4,5),c3,c4,c5,c6;
	complexx c1,c2,c3,c4,c5,c6;
	c1.input();
	c2.input();
	c1.display();
	c2.display();
	cout<<"Addition:";
	c3=c1+c2;
	c3.display();
	cout<<"Subtraction:";
	c4=c2-c1;
	c4.display();
	cout<<"Multiplication:";
	c5=c1*c2;
	c5.display();
	cout<<"Division:";
	c6=c1/c2;
	c6.display();
	cout<<endl;
	return 0;
}
