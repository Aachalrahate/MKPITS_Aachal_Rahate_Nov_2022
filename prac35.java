import java.util.Scanner;

class prac35
 {
 public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number");
  int n=sc.nextInt();
  for(int i=1;i<n;i++)
   {
   for(int j=0;i<i;j++)
     {
     System.out.print("");
     }
     for(int k=0;k<2*(n-i)-1;k++)
      {
      System.out.print("*");
      }
       System.out.println();

   }
  }
 }