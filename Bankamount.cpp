#include<stdio.h>
#include<conio.h>
int main()
{
	int amount,total;
	printf("enter amount \n");
	scanf("%d",&amount);
	total=amount/100;
	printf("\n %d note of 100",total);
	amount=amount-(total*100);
	total=amount/50;
	printf("\n%d note of 50",total);
	amount=amount-(total*50);
	total=amount/10;
	printf("\n %d note of 10",total);
	amount=amount-(total*10);
}
