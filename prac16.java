import java.util.Scanner;

class prac16{
public static void main(String[] args)
 {
 int n1,n2;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the distance points");
 n1=sc.nextInt();
 n2=sc.nextInt();

 int dis=n2-n1;
 System.out.println("Distance="+dis);
 }
}