#include<stdio.h>
#include<conio.h>
void add(int x,int y)
{
	int c;
	c=x+y;
	printf("add=%d",c);
}
void main()
{
	int a=2,b=3;
	add(a,b);
	getch();
}
