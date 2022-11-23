#include<stdio.h>
#include<string.h>
void main()
{
	char name[10],i;
	printf("enter your name");
	scanf("%s",name);
	{
		for(i=0;name[i]!='\0';i++)
		printf("%c",name[i]);
	}
}
