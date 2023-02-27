import java.util.Scanner;

class AssQ5_23Jan
{
public static void main(String[] args)
  {
  int num;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  num=sc.nextInt();
  if(num%10<0 || num%10>8)
   {
   System.out.println("multiple of 10" +num);
   }
  }
}