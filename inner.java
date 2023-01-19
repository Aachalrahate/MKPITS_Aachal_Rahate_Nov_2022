class one1
{
int b1=13;
void dis1()
{
System.out.println("nested called");
two tob=new two();
tob.dis();
}
class two
{
int a;
void dis()
{
System.out.println("two " +b1);
}
}
}

public class inner
{
public static void main(String[] args)
{
one1 ob=new one1();
ob.dis1();
}
}