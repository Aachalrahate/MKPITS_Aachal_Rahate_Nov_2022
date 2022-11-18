#include<stdio.h>
#include<conio.h>
void main()
{
int choice, a,b, result;
clrscr();
printf(" press 1 for addition");
printf("\n press 2 for substraction");
printf("\n press 3 for division");
printf("\n press 4 for multiplication");
printf("enter your choice");
scanf("%d",&choice);
if(choice==1)
{
printf("enter the two no addition");
scanf("%d%d",&a,&b);
result=a+b;
printf("addition=%d",result);
}
else
if(choice==2)
{
printf("enter the two no of substraction");
scanf("%d%d",&a,&b);
result=a-b;
printf("substaction=%d",result);
}
else
if(choice==3)
{
printf("enter the two no of division");
scanf("%d%d",&a,&b);
result=a/b;
printf("division=%d",result);
}
else
if(choice==4)
{
printf("enter the two no of multiplication");
scanf("%d%d",&a,&b);
result=a*b;
printf("multiplication=%d",result);
}
getch();
}