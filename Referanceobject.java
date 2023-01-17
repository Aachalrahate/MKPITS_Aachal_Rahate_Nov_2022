 class adddemo
{
int a=8,b=8;
int res;

void sum()
{
res=a+b;
}
void dis()
{
System.out.println(res);
}
}

 public class Referanceobject
{
public static void main(String[] args)
{
adddemo ob=new adddemo();
ob.sum();
ob.dis();

adddemo ob2=ob;
ob2.dis();

//change ob2

ob2.a=12;
System.out.println(ob2.a);
ob2.dis();

adddemo ob3=new adddemo();
System.out.println(ob);
System.out.println(ob2);
System.out.println(ob3);
}
}