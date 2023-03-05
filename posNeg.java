import java.util.Scanner;

class posNeg
 {
 public static void main(String[] args)
   {
   int num;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number");
   int n=sc.nextInt();
   if(num>0)
    {
    System.out.println("Number is Positive");
    }
    else
      {
      if(num<0)
        {
        System.out.println("Number is Negative");
        }
      }
   }
 }