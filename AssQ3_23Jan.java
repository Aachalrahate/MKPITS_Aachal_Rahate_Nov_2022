import java.util.Scanner;

class AssQ3_23Jan
{
 public static void main(String[] args)
   {
   int num;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Number");
   num=sc.nextInt();
   if(num%13==0 || num%13==1)
     {
     System.out.println("multiple of 13"+num);
     }
     else
        {
        System.out.println("it is not prsent");
        }
   }
}