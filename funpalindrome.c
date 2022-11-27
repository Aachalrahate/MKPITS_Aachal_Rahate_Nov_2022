#include<stdio.h>
#include<conio.h>
void palindrome()
{
int num,n1,n2,n3,original,reverse;
printf("enter 3 digit no");
scanf("%d",&num);
original=num;
n1=num%10;
num=num/10;
n2=num%10;
num=num/10;
n3=num%10;
reverse=n1*100+n2*10+n3*1;
if(original==reverse)
{
	printf("it is palindrome no");
}
else
{
	printf("it is not palindrome no");
}
}
void main()
{
	palindrome();
	getch();
}

