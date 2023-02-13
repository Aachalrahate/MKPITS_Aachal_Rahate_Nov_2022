class Exception
{
public static void main(String[] args)
{
int a=13;
int c=0;
System.out.println("first execution");


try
{
c=5/0;
}
catch(ArithmeticException e)
{
System.out.println("hii");
}
System.out.println("second execution=" +c);

}
}