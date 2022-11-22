#include<stdio.h>
#include<conio.h>
 main()
{
	int a[2][2],i,j,matrix;
	printf("enter a 2*2 matrix");
	for(i=0; i<=1;i++)
	{
		for(j=0;j<=1;j++)
		{
			printf("matrix[%d][%d]=",i,j);
			scanf("%d",&a[i][j]);
			
		}
	}
	for(i=0; i<=1;i++)
	{
		for(j=0;j<=1;j++)
		{
			printf("matrix[%d][%d]=%d",i,j,a[i][j]);
		}
		{
			printf("\n");
		}
	}
	getch();
}
