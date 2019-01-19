#include<bits/stdc++.h>
#include<string.h>
using namespace std;
class Student
{
	int rollno;
	
	float marks[4];
	float grade;
	char name[20];
	void calculate()
	{
		for(int i=0;i<4;i++)
		{
			grade+=marks[i];
		}
		grade/=4;
	}
	public:
		char * getname()
		{
			return name;
		}
		Student(){}
		Student (const Student &d1) //copy constructor
		{
			rollno=d1.rollno;
			grade=d1.grade;
			for(int i=0;i<4;i++)
			{
				marks[i]=d1.marks[i];
			}
			strcpy(name,d1.name);
		}
		void readData()
		{
			cout<<"enter roll-number->";
			cin>>rollno;
			cout<<"enter name->";
			cin>>name;
			cout<<"enter 4 subjects marks->";
			for(int i=0;i<4;i++)
			{
				cin>>marks[i];
			}
			calculate();
		}
		void displayData()
		{
			cout<<"roll-number->"<<rollno<<endl;
			cout<<"name->"<<name<<endl;
			cout<<"grade->"<<grade<<endl;
		}
		void sortt(vector <Student> &qwerty,int n)
		{
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<2;j++)
				{
					//cout<<qwerty[j].getname()<<" "<<qwerty[j+1].getname()<<endl;
					
					if(strcmp(qwerty[j].getname(),qwerty[j+1].getname())>0)
					{
						Student temp=qwerty[j];
						qwerty[j]=qwerty[j+1];
						qwerty[j+1]=temp;
						//cout<<"gjgvgj";
					}
				}
			}
			for(int i=0;i<3;i++)
			{
				qwerty[i].displayData();
			}
		}
};
int main()
{
	Student s1,s2,s3;
	vector <Student> qwerty;
	s1.readData();
	qwerty.push_back(s1);
	s2.readData();
	qwerty.push_back(s2);
	s3.readData();
	qwerty.push_back(s3);
	s1.sortt(qwerty,3);
	return 0;
}
