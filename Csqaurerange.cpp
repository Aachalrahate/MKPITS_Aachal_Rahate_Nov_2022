#include <iostream>
using namespace std;
int main()
{
	int num,i,sq=1;
	for(i=1;i<=num;i++)
	{
		cout<<"enter first to last no=\n";
		cin>>num;
		if(num%2==0)
		{
		sq=(num*num);	
		}
	}
	cout<<"the square of even number is ="<<sq;
}
