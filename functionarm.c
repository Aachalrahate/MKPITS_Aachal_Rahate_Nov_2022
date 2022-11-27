#include<stdio.h>
#include<conio.h>
void armstrong(int num)
{
	int n1,n2,n3,original,c;
	original=num;
	n1=num%10;
	num=num/10;
	n2=num%10;
	num=num/10;
	n3=num%10;
	c=n1*n1*n1+n2*n2*n2+n3*n3*n3;
	if(original==c)
	{
		printf("it is armstrong");
	}
	else
	{
		printf("it is not armstrong");
	}
}
 int main()
{
	int num,n1,n2,n3;
	printf("enter 3 digit no");
	scanf("%d",&num);
	armstrong(num);
	getch();
}

