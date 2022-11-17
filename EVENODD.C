#include<stdio.h>
#include<conio.h>
void main()
{
int num;
clrscr();
printf("enter the num");
scanf("%d",&num);
if(num%5!=0)
{
printf("the no is even");
}
else
{
printf("the no is odd");
}
getch();
}