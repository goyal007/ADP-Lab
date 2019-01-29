#include<bits/stdc++.h>
using namespace std;
class Product
{
	int product_id,category_id,unit_price;
	string name;
	public:
		Product()
		{}
		Product(int pid,int cid,int price,string name)
		{
			product_id=pid;
			category_id=cid;
			unit_price=price;
			this->name=name;
		}
		void get_Product()
		{
			cout<<"enter pid:\n";
			cin>>product_id;
			cout<<"enter cid:\n";
			cin>>category_id;
			cout<<"enter price:\n";
			cin>>unit_price;
			cout<<"enter name:\n";
			cin>>name;
		}
		void show_product()
		{
			cout<<"product:"<<product_id<<endl;
			cout<<"category_id:"<<category_id<<endl;
			cout<<"unit price:"<<unit_price<<endl;
			cout<<"name:"<<name<<endl;
		}
		void cp(int pric)
		{
			unit_price=pric;
		}
};
class ElectricalProduct:public Product
{
	int voltage_range,wattage;
	public:
	ElectricalProduct()
	{}
		ElectricalProduct(int pid,int cid,int price,string name,int vol_range,int watt):Product(pid, cid, price,name)
		{
			voltage_range=vol_range;
			wattage=watt;
		}
		void get_ElectricalProduct()
		{
			cout<<"enter voltage:\n";
			cin>>voltage_range;
			cout<<"enter wattage:\n";
			cin>>wattage;
			get_Product();
			
		}
		void show_ElectricalProduct()
		{
			show_product();
			cout<<"voltage:"<<voltage_range<<endl;
			cout<<"wattage"<<wattage<<endl;
		}
		void change_wattage()
		{
			cout<<"enter new wattage:\n";
			int volt;
			cin>>volt;
			wattage=volt;
		}
		void change_price()
		{
			cout<<"enter new price:\n";
			int pric;
			cin>>pric;
			cp(pric);
		}
};
int main()
{
	ElectricalProduct p2(1,2,100,"ashish",12,13);
	//ElectricalProduct p2;
	//p2.get_ElectricalProduct();
	
	p2.show_ElectricalProduct();
	
	p2.change_wattage();
	p2.change_price();
	
	p2.show_ElectricalProduct();
	return 0;
}
