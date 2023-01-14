class Divisible4
{
public static void main(String[] args)
{
int num=20,r,quo;

r=num%4;
quo=num/4;

if(r==0)
{
System.out.println(num+ "divisible by 4");
System.out.println("The Quotient is=" +quo);
}
}
}