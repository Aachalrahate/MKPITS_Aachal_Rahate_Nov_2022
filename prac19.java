import java.util.Scanner;

class prac19{
public static void main(String[] args){
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your number");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
  {
  sum=sum+i;
  }
  System.out.println(sum);
}
}