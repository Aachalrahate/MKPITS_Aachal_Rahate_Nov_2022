//returntype with argument
#include<stdio.h>
#include<conio.h>
int palindrome(int num)
{
	int n1,n2,n3,orininal,c;
	 n1=num%10;
	 num=num/10;
	 n2=num%10;
	 num=num/10;
	 n3=num%10;
	  c=n1*100+n2*10+n3*1;
	  return c;
}
void main()
{
	int num, r,original,c;
	printf("enter 3 digit no");
	scanf("%d",&num);
	c=palindrome(num);
	original=num;
	if(original==c)
	  {
	  	printf("it is palindrome");
	  }
	  else
	  {
	  	printf("it is not palindrome");
	  }
	printf("palindrome=%d",r);
	getch();
}
