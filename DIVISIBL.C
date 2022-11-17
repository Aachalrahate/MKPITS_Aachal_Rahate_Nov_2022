#include<stdio.h>
#include<conio.h>
void main()
{
int num,r;
clrscr();
printf("enter the no");
scanf("%d",&num);
r=num%4;
if(r==0)
{
printf("division=%d",r);
}
else
{
printf("not a divisible by 4");
}
getch();
}
