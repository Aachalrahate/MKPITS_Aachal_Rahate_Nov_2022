#include <iostream>
using namespace std;
#include<string.h>
class one
{
	public:
		char name[100];
		int i,a,e,l,o,u,I;
		int get()
		{
			a=0;
			e=0;
			I=0;
			o=0;
			u=0;
			cout<<"enter line";
			gets(name);
		}
		int logic()
		{
			int l=strlen(name);
			for(i=0;i<=l;i++)
			{
				if(name[i]=='A')
				{
					a=a+1;
				}
				else
				if(name[i]=='E')
				{
					e=e+1;
				}
				else
				if(name[i]=='I')
				{
					I=I+1;
				}
				else if(name[i]=='O')
				{
					o=o+1;
				}
				else if(name[i]=='U')
				{
					u=u+1;
				}
			}
	    }
int dis()
{
	cout<<"A= "<<a<<endl;
	cout<<"E= "<<e<<endl;
	cout<<"I= "<<I<<endl;
	cout<<"O= "<<o<<endl;
	cout<<"U= "<<u<<endl;
}
};
int main()
{
	one ob;
	ob.get();
	ob.logic();
	ob.dis();
}

