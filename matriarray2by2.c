#include<stdio.h>
#include<conio.h>
 main()
{
	int a[1][1],i,j,matrix;
	printf("enter a 2*2 matrix");
	for(i=0; i<=1;i++)
	{
		for(j=0;j<=1;j++)
		{
			scanf("%d",&a[i][j]);
			
		}
	}
	for(i=0; i<=1;i++)
	{
		for(j=0;j<=1;j++)
		{
			printf(" %d",a[i][j]);
		}
		{
			printf("\n");
		}
	}
	getch();
}
