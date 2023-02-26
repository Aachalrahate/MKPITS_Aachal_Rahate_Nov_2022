import java.util.Scanner;

class Ass18_1feb
{
public static void main(String[] args)
{
int a1,a2,a3;
Scanner sc=new Scanner(System.in);
System.out.println("enter the side1 triangle");
a1=sc.nextInt();
System.out.println("enter the side2 triangle");
a2=sc.nextInt();
System.out.println("enter the side3 triangle");
a3=sc.nextInt();
if(a1==a2 && a2==a3)
  {
  System.out.println("it is euailater triangle");
  }
    else if(a1==a2 || a2==a3 || a3==a1)
     {
     System.out.println("it is isosceles");
     }
       else
         {
         System.out.println("it is Scalene");
         }
}
}