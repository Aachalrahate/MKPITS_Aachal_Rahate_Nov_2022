import java.util.Scanner;
class perfectnum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the perfect number");
int num=sc.nextInt();
int sum=1;
for(int i=2;i<=num/2;i++)
 {
 if(num%i==0)
   sum=sum+i;
  }
   if(sum==num)
    {
    System.out.println("number is prime");
    }
    else
    System.out.println("number is not prime");
   }
 }
