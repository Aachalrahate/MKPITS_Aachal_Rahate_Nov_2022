#include<stdio.h>
#include<conio.h>
main()
{
	int a,i;
	printf("enter no");
	scanf("%d",&a);
	
	while(i<=10)
	{
		printf("%d * %d =%d \n",a,i,a*i);
		i++;
	}
	
	getch();
}
