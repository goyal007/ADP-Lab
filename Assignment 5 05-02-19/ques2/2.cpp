#include <bits/stdc++.h>
using namespace std;
class game
{
	int rounds,total_a,total_b;
	vector <int> a,b;
	public:
		game()
		{

		}
		game(int rounds)
		{
			total_a=0;
			total_b=0;
			this->rounds=rounds;
		}
		play_game()
		{
			for(int i=0;i<rounds;i++)
			{
				int n1,n2,temp,temp1;
				cout<<"Enter Your Number Player 1: ";
				cin>>n1;
				cout<<"Enter Your Number Player 2: ";
				cin>>n2;
				while(1)
				{
					 temp=rand()%1501;
					int c=0;
					for(int i=0;i<a.size();i++)
					{
						if(a[i]==temp)
						{
							c=1;
							break;
						}
					}

					if(c==0)
					{
						break;
					}
				}
				a.push_back(temp);

				while(1)
				{
					 temp1=rand()%1501;
					int c=0;
					for(int i=0;i<b.size();i++)
					{
						if(b[i]==temp1)
						{
							c=1;
							break;
						}
					}

					if(c==0)
					{
						break;
					}
				}
				b.push_back(temp1);

				if(temp1>temp)
					total_b=total_b+(temp1-temp);
				else
					total_a=total_a+(temp-temp1);
				cout<<"A's random number:"<<temp<<endl;
				cout<<"B's random number:"<<temp1<<endl;
				if(total_a>total_b)
					cout<<"Winner is A as A's total score is "<<total_a<<" whereas B's total score is "<<total_b<<endl;
				else
					cout<<"Winner is B as B's total score is "<<total_b<<" whereas A's total score is "<<total_a<<endl;
			}
		}

};
int main()
{
	int rounds;
	cout<<"Enter the no. of turns : ";
	cin>> rounds;
	srand(time(0));
	game object(rounds);
	object.play_game();
	return 0;
}
