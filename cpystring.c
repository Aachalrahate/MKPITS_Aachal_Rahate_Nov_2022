#include<stdio.h>
#include<string.h>
void main()
{
	char name[10],name2[10];
	printf("enter your name");
	scanf("%s",name);
	strcpy(name2,name);
	printf("%s",name);
}
