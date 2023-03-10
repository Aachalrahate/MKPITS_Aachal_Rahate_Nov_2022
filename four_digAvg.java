//Four Digit number Average

import java.util.Scanner;

class four_digAvg
 {
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter four Digit Number");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int num3=sc.nextInt();
    int num4=sc.nextInt();

    int Avg;

    Avg=(num1+num2+num3+num4)/4;

    System.out.println("the avg of 4 digit numbers are=" +Avg);
   }
 }