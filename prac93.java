import java.util.Scanner;

class prac93
 {
  public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the A B and C");
     
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
     
     System.out.println("A=" +a);
     System.out.println("B=" +b);
     System.out.println("C=" +c);
    
     int n1,n2;
     
     n1=(a+b)*(b+c);
     n2=(a+b)*c;
     
     System.out.println("(a+b)*(b+c)=" +n1);
     System.out.println("(a+b)*c=" +n2);
    }
 }