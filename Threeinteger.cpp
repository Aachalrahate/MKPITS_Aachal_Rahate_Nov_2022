#include<stdio.h>
#include<conio.h>
int main()
{
	int p1,p2,p3;
	printf("enter the age of 3 no");
	scanf("%d %d %d",&p1,&p2,&p3);
	if(p1>p2&&p1>p3)
	{
		printf("p1 is greater");
	}
	else
	if(p2>p3&&p2>p1)
	{
		printf("p2 is greater");
	}
	else
	if(p3>p1&&p3>p2)
	{
		printf("p3 is greater");
		
	}
}
