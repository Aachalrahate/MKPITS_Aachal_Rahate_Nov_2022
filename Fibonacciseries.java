import java.util.Scanner;

class Fibonacciseries
  {
   public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Number");
     int n=sc.nextInt();
     
     int n1=0, n2=1, i=2;
     int n3;
     System.out.println(n1+" "+n2);
     
     while(i<n)
      {
       n3=n1+n2;
       System.out.print(" "+n3+" ");
       n1=n2;
       n2=n3;
       i++;
      }
    }
  }