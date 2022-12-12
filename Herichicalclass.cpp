#include <iostream>
using namespace std;
class one
{
	public:
	int a;	
};
class two:public one
{
	public:
		int b;
		int set1()
		{
			a=2;
			b=3;
		}
		int dis()
		{
			cout<<a<<b;
		}
};
class three:public one
{
	public:
		int c;
		int set2()
		{
			a=2;
			c=4;
		}
		int dis()
		{
			cout<<a<<c;
		}
};
int main()
{
	two ob;
		ob.set1();
		ob.dis();
	three ob1;
		ob1.set2();
		ob1.dis();
	}
