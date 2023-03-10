import java.util.Scanner;

class prac89
 {
 public static void main(String[] args)
  {
  int sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter two number");
  int x=sc.nextInt();
  int y=sc.nextInt();

  if(x>y)
    {
   int temp=y;
       y=x;
       x=temp;
    }
    for(int i=x;i<=y;i++)
     {
      if((i%17) !=0)
      {
       sum=sum+i;
     }
  }
  System.out.println(" "+sum);
 }
}