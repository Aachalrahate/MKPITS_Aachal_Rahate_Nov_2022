#include <iostream>
using namespace std;
class one
{
	public:
	int a;
	int set1()
	{
		a=2;
	}
	int dis1()
	{
		cout<<a;
	}
};
class two:public one
{
	public:
		int b;
		int set2()
		{
			b=3;
		}
		int dis2()
		{
			cout<<b;
		}
	};
		class three:public two
		{
			public:
				int c;
				int set3()
				{
					c=3;
					
				}
				int dis3()
				{
					cout<<c;
		}
	
		
	};
int main()
{
	three ob;
	ob.set1();
	ob.set2();
	ob.set3();
	ob.dis1();
	ob.dis2();
	ob.dis3();
	
	
}
