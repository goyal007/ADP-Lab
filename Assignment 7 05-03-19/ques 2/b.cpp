#include<bits/stdc++.h>
#include<pthread.h>
#include<mutex>
#include <unistd.h>
#include <stdlib.h>
//g++ -std=c++11 account.cpp -lpthread

using namespace std;
int bal=600;
mutex m;
void * father(void *args)
{
	while(1)
	{
		m.lock();
		while(bal<=2000)
		{
			int x=rand()%200+1;
			bal+=x;
			cout<<"amout deposited by father :"<<x<<"\n";
			cout<<"acc balance :"<<bal<<"\n";
			sleep(1);
		}
		m.unlock();
	}
}
void *son(void *args)
{

	while(1)
	{
		m.lock();
		while(bal>=500)
		{
			int x=rand()%150+1;
			bal-=x;
			cout<<"amout withdraw by son :"<<x<<"\n";
			cout<<"acc balance :"<<bal<<"\n";
			sleep(1);
		}
		m.unlock();
	}
}

int main()
{
	pthread_t f,s;
	pthread_create(&f,NULL,&father,NULL);
	pthread_create(&s,NULL,&son,NULL);

	pthread_join(f,NULL);
	pthread_join(s,NULL);
	return 0;
}
