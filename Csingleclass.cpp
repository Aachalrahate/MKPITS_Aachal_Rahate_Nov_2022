#include <iostream>
using namespace std;
class one
{
	public:
	int a,b;
	
};
class two:public one

{
	public:
	int c;
int set()
{
	a=2;
	b=3;
	c=4;
}
int dis()
{
	cout<<a<<b<<c;
}
};
int main()
{
	two ob;
	ob.set();
	ob.dis();
}
