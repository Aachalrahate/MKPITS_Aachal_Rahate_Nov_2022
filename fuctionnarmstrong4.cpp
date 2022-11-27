#include<stdio.h>
#include<conio.h>
int armstrong(int num)
{
	int n1,n2,n3,original,c;
	original=num;
	n1=num%10;
	num=num/10;
	n2=num%10;
	num=num/10;154
	n3=num%10;
	c=n1*n1*n1+n2*n2*n2+n3*n3*n3;
	if(original==c)
	{
		printf("it is armstrong");
	}
	else
	{
		printf("is is not armstrong");
	}
}
void main()
{

int num,r;
printf("enter 3 digit no");
scanf("%d",&num);
r=armstrong(num);
printf("armstrong=%d",r);
}
