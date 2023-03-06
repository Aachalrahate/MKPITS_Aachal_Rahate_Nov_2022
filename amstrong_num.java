import java.util.Scanner;

class amstrong_num
  {
  public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Number");
   int num=sc.nextInt();

   int n1=num%10;
       num=num/10;
   int n2=num%10;
   //num=num/10;
   int n3=num%10;

   int res=n3*100+n2*10+n1*1;
   System.out.println(res);

   int temp=(n3*n2*n1)+(n2*n2*n2)+(n1*n1*n1);
   System.out.println(temp);

   if(res==temp)
    {
    System.out.println("its is amstrong Number");
    }
    else
     {
      System.out.println("its is amstrong Number");
     }
   }
  }