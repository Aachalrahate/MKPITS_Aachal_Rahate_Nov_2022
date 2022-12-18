#include<stdio.h>
int main()
{
	int a=69,r,c;
	for(r=1; r<=4;r++)
	{
		for(c=1;c<=5;c++)
		{
			if(c==3)
			continue;
			printf("%d",c);
		}
		printf("\n");
	}
}
