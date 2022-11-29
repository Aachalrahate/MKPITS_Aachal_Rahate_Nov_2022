#include<stdio.h>
#include<conio.h>
int main()
{
	int x,y,temp,i,sum=0;
	printf("\n input the first integer");
	scanf("%d",&x);
	printf("\n input the second integer");
	scanf("%d",&y);
	if(x>y)
	{
		temp=y;
		y=x;
		x=temp;
	}
	for(i=x+1;i<y;i++)
	{
		if((i%7)==2||(i%7)==3)
		{
printf("%d\n",i);
		}
	}
	return 0;
}

