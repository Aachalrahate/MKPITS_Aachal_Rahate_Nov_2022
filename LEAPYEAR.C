#include<stdio.h>
#include<conio.h>
void main()
{
int yr;
clrscr();
printf("enter the leap year");
scanf("%d",&yr);
if(yr%4==0)
{
printf(" leap year");
}
else
{
printf(" not a leap year");
}
getch();
}