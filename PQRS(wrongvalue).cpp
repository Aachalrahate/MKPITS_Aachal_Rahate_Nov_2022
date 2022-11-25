#include<stdio.h>
#include<conio.h>
int main()
{
	int p,q,r,s;
	printf("enter first integer\n");
	scanf("%d",&p);
	printf("enter second integer\n");
	scanf("%d",&q);
	printf("enter third integer\n");
	scanf("%d",&r);
	printf("enter fourth integer\n");
	scanf("%d",&s);
	if((r>0)&&(s>0)&&(p%2==0)&&(q>r)&&(s>p)&&(r+s)>(p+q))
	{
		printf("correct values\n");
	}
	else
	{
		printf("wrong values\n");
	}
}
