#include<stdio.h>
#include<conio.h>
void fact()
{
	int num,i,s=1;
	printf("enter a num");
	scanf("%d",&num);
	for(i=1;i<=num;i++)
	{
		s=s*i;
	}
	printf("factorial=%d",s);
}
void main()
{
	fact();

}
