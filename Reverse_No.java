import java.util.Scanner;

class Reverse_No
 {
  public static void main(String[] args)
   {
int  reverse = 0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int number=sc.nextInt();

    while(number!=0)
     {
      int remainder=number%10;
       reverse=reverse*10+remainder;
       number=number/10;
     }

     System.out.println("The reverse Number is" +reverse);
   }
 }