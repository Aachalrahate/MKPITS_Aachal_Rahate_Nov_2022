import java.util.Scanner;

class sumofprime{
public static void main(String[] args){
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the range of prime number");
int range=sc.nextInt();
for(int i=1;i<=range;i++)
{
if(isPrime[i])
sum=sum+i;
}
System.out.println(sum);
}
}
