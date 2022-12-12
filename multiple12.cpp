#include <iostream>
using namespace std;
class two
{
	public:
		int b;
		int set1()
		{
			b=3;
		}
		int dis1()
		{
			cout<<b;
		}
};
class three
{
	public:
		int c;
		int set2()
		{
			c=4;
		}
		int dis2()
		{
			cout<<c;
		}
};
class one:public two,public three
{
	public:
		int a;
		int set3()
		{
			a=2;
		}
		int dis3()
		{
			cout<<a;
		}
};
int main()
{
	one ob;
	ob.set1();
	ob.set2();
	ob.set3();
	ob.dis1();
	ob.dis2();
	ob.dis3();
}
