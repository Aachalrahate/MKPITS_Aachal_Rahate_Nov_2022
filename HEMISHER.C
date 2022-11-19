#include<stdio.h>
#include<conio.h>
void main()
{
int r,area;
clrscr();
printf("enter radius");
scanf("%d",&r);
area=2*3.14*r*r;
printf("area of hemisphere=%d",area);
getch();
}