#include<stdio.h>
#include<conio.h>
int main()
{
	int i,j,k,a=65;
	for(i=65;i<=71;i=i+2)
	{
	for(j=1;j<=81-i;j++)
	{
		printf(" ");
		}
		for(k=65;k<=i;k=k+2)	
		{
	printf(" %c ",i);
}
printf("\n");
}
}
