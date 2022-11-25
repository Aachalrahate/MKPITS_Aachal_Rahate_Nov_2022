#include<stdio.h>
#include<conio.h>
int main()
{
	float item1,item2,nofp1,nofp2,average;
	printf("enter weight of item 1 \n");
	scanf("%f",&item1);
	printf("enter weight of item 2 \n");
	scanf("%f",&item2);
	printf("no of item1 purchase \n");
	scanf("%f",&nofp1);
	printf("no of  item2 purchase \n");
	scanf("%f",&nofp2);
	
	average=((item1*nofp1)+(item2*nofp2))/(nofp1+nofp2);
	printf("average =%f",average);
}
