import java.util.Scanner;   //default contructor

class demo
 {
  int s;
  demo()
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number");
  int n=sc.nextInt();
 }
  void dis()
   {
    System.out.println("s=" +s);
   }
 }

 public class defauconst
 {
 public static void main(String[] args)
  {
   demo ob1=new demo();
   demo ob2=new demo();

   ob1.dis();
   ob2.dis();
  }
}