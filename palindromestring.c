#include<stdio.h>
#include<string.h>
void main()
{
	char name1[10],name2[10];
	int s;
	printf("enter your name1");
	scanf("%s",name1);
	strcpy(name2,name1);
	strrev(name1);
	s=strcmp(name2,name1);
	if(s==0)
	printf("the string is palindrome");
	else
	{
		printf("the string is not palindrome");
	}
}
