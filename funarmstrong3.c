#include<stdio.h>
#include<conio.h>
int armstrong()
{
	int num,n1,n2,n3,original,c;
	printf("enter 3 digit no");
	scanf("%d",&num);
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
	 	printf("is is not armstrong");
	 }
	
}

void main()
{
	int r;
	r=armstrong();
	getch();
}

