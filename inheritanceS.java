class one1
{
int a;
}
class two extends one1
{
void set()
{
a=13;
}

void dis()
{
System.out.println(a);
}
}

public class inheritanceS
{
public static void main(String[] args)
{
two ob=new two();
ob.set();
ob.dis();
}
}

