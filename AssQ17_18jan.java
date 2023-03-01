import java.util.Scanner;

class demo
{
int num;
int n1,n2,n3,n4,n5,n6,n7;

void set()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number of value");
    num=sc.nextInt();
  }
    void dis()
       {
        n1=num%10;
        num=num/10;
        n2=num%10;
        num=num/10;
        n3=num%10;
        num=num/10;
        n4=num%10;
        num=num/10;
        n5=num%10;
        num=num/10;
        n6=num%10;
        num=num/10;
        n7=num%10;

        System.out.println("the seperate digit are "+n7+" "+n6+"  "+n5+" "+n4+" "+n4+" "+n3+" "+n2+" "+n1);
       }
     }
       class AssQ17_18jan
         {
         public static void main(String[] args)
          {
          demo ob=new demo();
          ob.set();
          ob.dis();
          }
         }