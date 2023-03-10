import java.util.Scanner;

class candi_vote
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the candidate age");
     int age=sc.nextInt();

     if(age>=18)
      {
       System.out.println("Eligible to Vote");
      }
       else
        {
          System.out.println(" Not Eligible to Vote");
        }
    }
  }