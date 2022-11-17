#include<stdio.h>
#include<conio.h>
void main()
{
int num,n1,n2,n3,reverse;
clrscr();
printf("enetr the 3 digit no");
scanf("%d",&num);
n1=num%10;
num=num/10;
n2=num%10;
num=num/10;
n3=num%10;
reverse=n1*100+n2*10+n3*1;
printf("reverse=%d",reverse);
getch();
}