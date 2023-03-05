import java.util.Scanner;

class prac29
{
public static void main(String[] args)
  {
  int sum=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int n=sc.nextInt();
  for(int num=1;num<=n;num++)
    {
    for(int i=2;i<=num/2;i++)
      {
      if(num%i==0)
        sum=sum+i;
      }
      if(sum==num)
       {
       System.out.println("perfect number");
       }
    }
  }
}