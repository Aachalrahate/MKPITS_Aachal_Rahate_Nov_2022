import java.util.Scanner;

class prac32
 {
 public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number");
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
   {
   for(int j=0;j<n-i-1;j++)
   {
   System.out.print("");
   }
   for(int k=0;k<=i;k++)
    {
    System.out.println("* ");
    }
   }
  }
 }