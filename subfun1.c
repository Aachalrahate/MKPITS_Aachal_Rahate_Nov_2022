#include<stdio.h>
#include<conio.h>
void sub()
{
	int num1,num2,result;
	printf("enter two no");
	scanf("%d%d",&num1,&num2);
	result=num1-num2;
	printf("subtraction=%d",result);
}
void main()
{
	sub();
	getch();
}
