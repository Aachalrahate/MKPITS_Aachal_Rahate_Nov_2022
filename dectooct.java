import java.util.Scanner;

class dectooct
  {
  public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Decimal Number");
    int n=sc.nextInt();
    String oct="";
    while(n>0)
      {
      int r=n%8;
      oct=r+oct;
      n=n/8;

      System.out.println("Octale number="+oct);
      }
    }
  }