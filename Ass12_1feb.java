import java.util.Scanner;

class Ass12_1feb
{
public static void main(String[] args)
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of a & b");
a=sc.nextInt();
b=sc.nextInt();
if(a>0 && b>0)
{
System.out.println("1st quadrant");
}
else if(a>0 && b<0)
{
System.out.println("2st quadrant");
}
else if(a<0 && b<0)
{
System.out.println("3st quadrant");
}
else if(a<0 && b>0)
{
System.out.println("1st quadrant");
}
}
}