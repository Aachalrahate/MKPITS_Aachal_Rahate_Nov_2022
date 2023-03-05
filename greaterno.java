import java.util.Scanner;

class greaterno
 {
 public static void main(String[] args)
  {
  int p1,p2,p3;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter three number");
  int n=sc.nextInt();

  if(p1>p2 && p1>p3)
    {
    System.out.println("p1 is greater");
    }
    else
       if(p2>p3 && p2>p1)
         {
             System.out.println("p2 is greater");
         }
         else
           if( p3>p1 && p3>p2)
             {
               System.out.println("p3 is greater");
             }
   }


 }