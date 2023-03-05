import java.util.Scanner;

class prac33
 {
 public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number");
  int n=sc.nextInt();
  for(int i=1;i<n;i++)
   {
   for(int j=0;j<n;j++)
     {
     System.out.print("*");
     }
     System.out.println();
   }
  }
 }