 class multdemo
{
int a=8,b=9;
int res;

void mult()
{
res=a*b;
}
void dis()
{
System.out.println(res);
}
}

 public class one2
{
public static void main(String[] args)
{
multdemo ob=new multdemo();
ob.mult();
ob.dis();
}
}