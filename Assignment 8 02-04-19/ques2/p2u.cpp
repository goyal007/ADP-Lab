#include <iostream>
#include <pthread.h>
#include <stdlib.h>
#include <mutex>
using namespace std;

mutex m;

class Integer{

	int num;
	
	public:
		Integer(){
			num = 0;
		}
		
		int get(){
			return num;
		}
		
		int set(int val){
			num = val;
		}
		
};

void* fun(void* arg){
	Integer *sum = (Integer*)arg;
	m.lock();
	int val = sum->get();
	cout<<"Value read as "<<val<<'\n';
	sum->set(val+1);
	cout<<"Value updated as "<<sum->get()<<'\n';
	m.unlock();
}

int main(){
	pthread_t tid[1000];
	Integer *sum = new Integer();
	
	for(int i=0;i<1000;i++){
		pthread_create(&tid[i],NULL,fun,(void*)sum);
	}
	
	for(int i=0;i<1000;i++){
		pthread_join(tid[i],NULL);
	}
	
}
