import java.util.Scanner;

class prac84
  {
  public static void main(String[] args)
    {
      boolean check=false;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two Integer");
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    if(a>80 && a<100  || b>180 && b<200)
      {
        check=true;
        System.out.println(check);
       
      }
      else
      {
      check=false;
      System.out.println(check);
      }
    }
  }