import java.util.Scanner;

class prac41
 {
 public static void main(String[] args)
  {
  int k=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter Number");
  int n=sc.nextInt();
  for(int i=1;i<=n;i++)
   {
   for(int j=1;j<=i;j++)
     {
      k++;
      System.out.print(k+"");
     }
     System.out.println();
   }
  }
 }