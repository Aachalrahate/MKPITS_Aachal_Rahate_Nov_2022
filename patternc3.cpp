#include<stdio.h>
#include<conio.h>
int main()
{
    int i,j,k;
    for (i=1; i<=7; i=i+2)

    {
        for (k=7-i; k>=1; k--)
        {
            printf(" ");
        }

        for (j=1; j<=i; j=j+2)

        {

            printf(" %d ", i);
        }
        printf("\n");
    }
}

