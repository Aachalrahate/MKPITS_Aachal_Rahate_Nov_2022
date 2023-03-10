import java.util.Scanner;

class prac87
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Two integer");
     int a=sc.nextInt();
     int b=sc.nextInt();

     int s1,s2;

     s1=a/10;
     a=a%10;

     s2=b/10;
     b=b%10;

      if(a==b)
        {
         System.out.println("Last digit number are same");
        }
         else
           {
            System.out.println("Last digit number are not same");
           }
    }
  }
