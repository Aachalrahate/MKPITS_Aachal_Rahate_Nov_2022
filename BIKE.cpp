#include<stdio.h>
#include<conio.h>
void main()
{
	int i,j;
	float avg;
	printf("enter total distance traveled by bike \n");
	scanf("%d",&i);
	printf("enter fuel spent in liters \n");
	scanf("%d",&j);
	avg=i/j;
	printf("average consumption (km/lt)=%.2f",avg);
	printf("\n");
}
