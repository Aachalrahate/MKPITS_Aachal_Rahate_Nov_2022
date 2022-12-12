#include <iostream>
using namespace std;
class stud
{
	public:
		int id;
		char name[5];
		char add[10];
		int set1()
		{
			cout<<"enter id";
			cin>>id;
			cout<<"enter name";
			cin>>name;
			cout<<"enter add";
			cin>>add;
		}
		int dis1()
		{
			cout<<id<<endl;
			cout<<name<<endl;
			cout<<add<<endl;
		}
	};
	
	class exam:public stud
	{
		public:
			int ppr1,ppr2;
			int set2()
			{
				ppr1=20;
				ppr2=30;
			}
			int dis2()
			{
				cout<<ppr1<<endl;
				cout<<ppr2<<endl;
				
			}
	};
	class sport
	{
		public:
			int spr;
			int set3()
			{
				spr=40;
			}
			int dis3()
			{
				cout<<"sport="<<spr;
			}
	};
	class result:public exam,public sport
	{
		public:
			int sum;
			int set4()
			{
				sum=ppr1+ppr2+spr;
			}
			int dis4()
			{
				cout<<"sum"<<sum<<endl;
			}
	};
	int main()
	{
		result ob;
		ob.set1();
		ob.dis1();
		ob.set2();
		ob.set3();
		ob.set4();
		ob.dis1();
		ob.dis2();
		ob.dis3();
		
	}
	
