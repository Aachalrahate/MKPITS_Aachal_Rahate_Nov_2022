#include<stdio.h>
#include<conio.h>
void main()
{
	int a,i;
	printf("enter no");
	scanf("%d,&a");
	do
	{
		printf(" %d * %d =%d \n",a,i,a*i);
		i++;
	}
	while(i<=10);
}
