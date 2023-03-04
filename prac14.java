import java.util.Scanner;

class prac14{
public static void main(String[] args)
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("calculate Average");
 int n=sc.nextInt();
 double sum=0;
 for(int i=0;i<n;i++)
  {
  System.out.println("Enter the weight");
  double w=sc.nextDouble();
  sum=sum+w;
  }
  double avg=sum/n;
  System.out.println("Average" +avg);
 }
}