// returntype no argumrnt
#include<stdio.h>
#include<conio.h>
int palindrome()
{
	int num,n1,n2,n3;
	printf("enter 3 digit no");
	scanf("%d",&num);
	return num;
	

}
int main()
{
	int num,n1,n2,n3,original,c;
	num=palindrome();
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
