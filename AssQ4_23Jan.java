import java.util.Scanner;

class AssQ4_23Jan
{
public static void main(String[] args)
   {
   int num;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the Number");
   num=sc.nextInt();
   if(num%3==0)
   {
   System.out.println("multiple of 3"+num);
   }
    if(num%7==0)
      {
      System.out.println("multiple of 7"+num);
      }

      if(num%3==num%7)
      {
      System.out.println("is is multiple of both");
      }
   }
}