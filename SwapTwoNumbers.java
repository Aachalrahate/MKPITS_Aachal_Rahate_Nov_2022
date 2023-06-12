import java.util.Scanner;

class SwapTwoNumbers
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the First Number");
    int a=sc.nextInt();

    System.out.println("Enter the Second Number");
    int b=sc.nextInt();

    System.out.println("before Swapping");
    System.out.println("a = " +a +", b = " +b);

    a=a^b;
    b=a^b;
    a=a^b;

   System.out.println("After Swapping");
   System.out.println("a = " +a +", b = " +b);

   }
 }