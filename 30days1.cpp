#include<stdio.h>
#include<conio.h>
int main()
{
	int ndays,y,m,d;
	printf("enter the number of days \n");
	scanf("%d",&ndays);
	y=ndays/365;
	m=(ndays-(y*365))/30;
	d=(ndays-y*365-m*30);
	printf("years=%d\n",y);
	printf("months=%d\n",m);
	printf("days=%d\n",d);
	
}
