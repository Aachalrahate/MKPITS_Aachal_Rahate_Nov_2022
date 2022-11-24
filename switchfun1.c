#include<stdio.h>
#include<conio.h>
void add()
{

int a,b,result;
printf("enter the number");
scanf("%d %d",&a,&b);
result=a+b;
printf("the addition of two no=%d\n",result);
}
void sub()
{
	int a,b,result;
	printf("enter the number");
	scanf("%d %d",&a,&b);
	result=a-b;
	printf("the subtraction of two no=%d\n",result);
}
void div()
{
	int a,b,result;
	printf("enter the number");
	scanf("%d%d",&a,&b);
	result=a/b;
	printf("the division of two no=%d\n",result);
}
void mult()
{
	int a,b,result;
	printf("enter the number");
	scanf("%d %d",&a,&b);
	result=a*b;
	printf("the multiplication of two no=%d\n",result);
}
void main()
{
	int choice;
	printf("press 1for addition");
printf("\n press 2 for subtraction");
printf("\n press 3 for division");
printf("\n press 4 for multiplication");
printf("enter your choice");
scanf("%d",&choice);
switch(choice)

{
	case 1:
		add();
		getch();
		break;
	case 2:
		sub();
		getch();
		break;
	case 3:
		div();
		getch();
		break;
	case 4:
		mult();
		getch();
		break;
		case 5:
		
		default:
	printf("enter invalid choice");
			
}
}
		

	

