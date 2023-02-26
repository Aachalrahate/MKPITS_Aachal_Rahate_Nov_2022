import java.util.Scanner;

class AssQ17_1feb
{
public static void main(String[] args)
 {
  int s1,s2,s3;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the side1 triangle");
  s1=sc.nextInt();
  System.out.println("enter the side2 triangle");
  s2=sc.nextInt();
  System.out.println("enter the side3 triangle");
  s3=sc.nextInt();
   if(s1==s2 && s2==s3)
    {
     System.out.println("triangle is Equilateral");
    }
      else if(s1==s2 || s2==s3 || s3==s1)
       {
          System.out.println("triangle is Isosceles");
       }
        else
           {
              System.out.println("triangle is Scalene");
           }
 
      }
    }