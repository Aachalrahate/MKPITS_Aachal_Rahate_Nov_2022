#include<stdio.h>
#include<string.h>
void main()
{
	char name[10],name2[10];
	char source;
	printf("enter your name1");
	scanf("%s",name);
	printf("enter your name2");
	scanf("%s",name2);
	strcat(name,name2);
	printf("%s",name);
}
