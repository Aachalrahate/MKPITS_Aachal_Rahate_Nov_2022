import java.util.Scanner;

class prac92
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Three axis X Y Z");
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();

    System.out.println("X=" +x);
    System.out.println("Y=" +y);
    System.out.println("Z=" +z);

    int a,b;
       a=(x+y)*z;
        b=(x*y)+(y*z);

        System.out.println("(x+y)*z=" +a);
        System.out.println("(x*y)+(y*z)=" +b);
   }
 }