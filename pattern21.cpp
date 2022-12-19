#include<stdio.h>
#include<conio.h>
int main()
{
	int i,j,k;
	for(i=1;i<=4;i++)
	{
		for(j=4-i;j>=1;j--)
		{
		
			printf(" ");
		}
		for(k=1;k<=i;k++)
		{
			printf("%d ",i);
		}
	printf("\n");
	}
	getch();
}
