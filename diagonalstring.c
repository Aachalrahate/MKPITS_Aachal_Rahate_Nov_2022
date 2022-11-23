#include<stdio.h>
#include<conio.h>
void main()
{
	int a[2][2],i,j;
	printf("enter a 4 element");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			scanf("%d",&a[i][j]);
		}
	}
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			if(i==j)
			{
				a[i][j]=0;
			}
		}
	}
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("%d",a[i][j]);
		}
	}
	
}
