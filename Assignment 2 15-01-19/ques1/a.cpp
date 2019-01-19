#include<bits/stdc++.h>
using namespace std;
class Data
{
	int day,month,year;
	public:
		Data()
		{
			day=12;
			month=3;
			year=1993;
		}
		Data(int s,int day=12,int month=10,int year=2000)   //first argument is to remove ambiguity
		{
			this->day=day;
			this->month=month;
			this->year=year;
		}
		Data(Data &obj1)
		{
			day=obj1.day;
			month=obj1.month;
			year=obj1.year;
		}
		void display()
		{
			cout<<"day->"<<day<<endl<<"month->"<<month<<endl<<"year->"<<year<<endl;
		}
};
int main()
{
	Data c1,c2(0,27,7,1997); 
	//	Data d3 = d2;
	Data c3(c1);
	c1.display();
	c2.display();
	c3.display();
	return 0;
}
