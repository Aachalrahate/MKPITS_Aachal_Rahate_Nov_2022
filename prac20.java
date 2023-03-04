import java.util.Scanner;

class prac20{
public static void main(String[] args){
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your number");
int n=sc.nextInt();
for(int i=n;i<=1;i--)
  {
  sum=sum+i;
  }
  System.out.println(sum);
}
}