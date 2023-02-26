import java.util.Scanner;

class AssQ11
{
public static void main(String[] args)
   {
   int hgt;
Scanner sc=new Scanner(System.in);
System.out.println("enter the height");
hgt=sc.nextInt();
if(hgt<100)
     {
      System.out.println("height is small");
     }
     else if(hgt>100)
     {
     System.out.println("height is tall");
     }
}
}