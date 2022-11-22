#include<stdio.h>
#include<conio.h>
void main()
{
	int a[10],i,scr,flag=0;
	printf("enter 10 no \n");
	for(i=0;i<=10;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter no to search");
	scanf("%d",&scr);
	for(i=0;i<=10;i++)
	{
		if(a[i]==scr)
		{
			flag=1;
		}
	}//for close
printf("%d",scr);
printf("\n %d",flag);
if(flag==1)
{
	printf("present");
	
}else
{
	printf("not present");
	
}
getch();
}

