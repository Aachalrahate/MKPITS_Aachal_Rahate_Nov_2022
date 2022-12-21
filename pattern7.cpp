#include<stdio.h>
#include<conio.h>
int main()
{
	int h,sp,str;
	for(h=1;h<=7;h=h+2)
	{
		for(sp=1;sp<=40-h;sp++)
		{
			printf(" ");
		}
		for(str=h;str>=1;str--)
		{
			printf("%d ",str);
		}
		printf("\n");
	}
}
