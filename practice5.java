import java.util.Scanner;

class practice5
{
public static void main(String[] args)
  {
  int i,fact=1;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the Number");
  int num=sc.nextInt();
  for(i=1;i<=num;i++)
  {
    fact=fact*1;
  }
   System.out.println("Factorial "+num +"num" +fact);
  }
}