#include<bits/stdc++.h>
using namespace std;
class Student
{
	int admno;
	char Name[20];
	float marksEng,marKsMaths,marksSci,total;
	public:
		void readData()
		{
			cout<<"enter admission number->";
			cin>>admno;
			cout<<endl;
			cout<<"enter name->";
			cin>>Name;
			cout<<endl;
			cout<<"enter english marks->";
			cin>>marksEng;
			cout<<endl;
			cout<<"enter maths marks->";
			cin>>marKsMaths;
			cout<<endl;
			cout<<"enter science marks->";
			cin>>marksSci;
			cout<<endl;
		}
		void compute()
		{
			total=marksEng+marKsMaths+marksSci;
		}
		void display()
		{
			cout<<"admission number->"<<admno<<endl;
			cout<<"name->"<<Name<<endl;
			cout<<"english marks->"<<marksEng<<endl;
			cout<<"maths marks->"<<marKsMaths<<endl;
			cout<<"science marks->"<<marksSci<<endl;
			cout<<"total->"<<total<<endl;
		}
};
int main()
{
	Student s1,s2;
	s1.readData();
	s1.compute();
	s1.display();
	return 0;
}
