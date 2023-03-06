import java.util.Scanner;

class multiplication_table
 {
 public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the table to print");
   int n=sc.nextInt();
   for(int i=1;i<=10;i++)
     {
     int mult=n*i;

     System.out.println(n+"*"+i+"="+mult);
   }
 }
}