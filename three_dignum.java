import java.util.Scanner;

class three_dignum
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the three digit number");
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();

     int Avg;

     Avg=(a+b+c)/3;

     System.out.println("Three digit number=" +Avg);
    }
  }