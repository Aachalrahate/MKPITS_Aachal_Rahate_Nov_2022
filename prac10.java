import java.util.Scanner;

class prac10
 {
 public static void main(String[] args)
   {
   int sum=0;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number");
   int num=sc.nextInt();
   for(int i=0;i<5;i++)
    {
   if(num%2!=0)
     {
     sum=sum+num;
     }
   }
   System.out.println("sum of odd number" +sum);
 }
}