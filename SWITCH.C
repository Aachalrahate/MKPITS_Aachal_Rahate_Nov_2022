#include<stdio.h>
#include<conio.h>
void main()
{
int choice, a,b, result;
clrscr();
printf("\n press 1 for addition");
printf("\n press 2 for substraction");
printf("\n press 3 for division");
printf("\n press 4 for multiplication");
printf("enter your choice");
scanf("%d",&choice);
switch(choice)
{
case 1:
printf("enter number");
scanf("%d%d",&a,&b);
result=a+b;
printf("addition=%d",result);

break;
case 2:
printf("enter number");
scanf("%d%d",&a,&b);
result=a-b;
printf("substaction=%d",result);

break;
case 3:
printf("enter number");
scanf("%d%d",&a,&b);
result=a/b;
printf("division=%d",result);

break;
case 4:
printf("enter number");
scanf("%d%d",&a,&b);
result=a*b;
printf("multiplication=%d",result);
break;
default:
printf("invalid choice");
}
getch();
}