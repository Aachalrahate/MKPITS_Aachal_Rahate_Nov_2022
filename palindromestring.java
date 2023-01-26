import java.util.Scanner;

class palindromestring
{
public static void main(String[] args)
{
String name;
Scanner sc=new Scanner(System.in);
System.out.println("enter name of string");
name=sc.next();
StringBuffer sob=new StringBuffer(name);
sob.reverse();
String rev=sob.toString();
System.out.println(rev);
if(name.equals(rev))
{
System.out.println("It is palindrome");
}
else
{
System.out.println("It is not a palindrome");
}
}
}
