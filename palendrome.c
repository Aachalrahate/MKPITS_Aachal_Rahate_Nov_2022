#include<stdio.h>
#include<conio.h>
void main()
{
	int num,n1,n2,n3,original,reverse;
	
	printf("enter 3digit no");
	scanf("%d,&num");
	original=num;
	n1=num%10;
	num=num/10;
	n2=num%10;
	num=num/10;
	n3=num%10;
	reverse=n1*n1*n1+n2*n2*n2+n3*n3*n3;
	if(original==reverse)
{
	printf("it is  palendrome no");
	
	}
	else
	{
		printf("it is not palendrome no");
		}	
		getch();
}

