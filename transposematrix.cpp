#include<stdio.h>
#include<conio.h>
void main()
{
	int A[2][2],B[2][2],i,j,matrix;
	printf("enter 4 element");
	for(i=0;i<2;i++)
	{
		for(j=0; j<2;j++)
		{
			printf("matrix[%d][%d]=",i,j);
			scanf("%d",&A[i][j]);
		}
	}
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			B[i][j]=A[j][i];	
			
				printf("%d",B[i][j]);
		}
		printf("\n");
	}
}


