#include<stdio.h>
#include<conio.h>
int main()
{
	int h,sp,str;
	for(h='A';h<='G';h=h+2)
	{
		for(sp=140-h;sp>=1;sp--)
		{
			printf(" ");
		}
		for(str=h;str>='A';str--)
		{
			printf(" %c",str);
		}
		printf("\n");
	
	}
}
