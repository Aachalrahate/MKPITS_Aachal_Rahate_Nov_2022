import java.util.Scanner;

class prac85
  {
   public static void main(String[] args)
     {
      boolean check=false;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the two integer");
      int p=sc.nextInt();
      int q=sc.nextInt();
      
      if(p>80 && p<100 || q>180 && q<200)
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