#include<stdio.h>
#include<conio.h>
int main()
{
	int i,j,k,a=65;
	for(i=65;i<=68;i++)
	{
		for(j=68;j>i;j--)
		{
			printf(" ");
		}
		for(k=65;k<=i;k++)
		{
		printf("%c ",a);
	}
	a++;
	printf("\n");
}

}

