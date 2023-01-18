
import java.util.Scanner;
class thisdemo
{
int a;
thisdemo()
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter number");
a=scanner.nextInt();
}
void dis()
{
	System.out.println("a="+a);
}
}

public class consdemo
{
public static void main(String[] args)
{
thisdemo ob1=new thisdemo();
thisdemo ob2=new thisdemo();

ob1.dis();
ob2.dis();
}
}