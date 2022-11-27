#include<stdio.h>
#include<conio.h>
void palindrome(int num)
{
	int n1,n2,n3,original,c;
	original=num;
	n1=num%10;
	num=num/10;
	n2=num%10;
	num=num/10;
	n3=num%10;
	c=n1*100+n2*10+n3*1;
	if(original==c)
	{
		printf("it is palindrome");
	}
	else
	{
		printf("it is not palindrome");
	}
}
int main()
{
	int n1,n2,n3,num;
	printf("enter 3 digit no");
	scanf("%d",&num);
	palindrome(num);
	getch();
}
