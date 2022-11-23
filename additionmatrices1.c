#include<stdio.h>
#include<conio.h>
 int main()
{
	int A[2][2],B[2][2],C[2][2],i,j;
	printf("enter  elemet A");
	for(i=0;i<2;i++)
	{
for(j=0;j<2;j++)
{
	printf("matrix A[%d][%d]=",i,j);
	scanf("%d",&A[i][j]);
}
}

	printf("eneter elemet B");
	for(i=0;i<2;i++)
	{
	
	for(j=0;j<2;j++)
	{
		printf("matrix B[%d][%d]=",i,j);
		scanf("%d",&B[i][j]);
	
		
	}
}

printf("addition of matrix");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
	C[i][j]=A[i][j]+B[i][j];
	}
}
	
		
	printf("addition of element\n");
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("%d ",C[i][j]);
		}
		printf("\n");
	}
	getch();
}







