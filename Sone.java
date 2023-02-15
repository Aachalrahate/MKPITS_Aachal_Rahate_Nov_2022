public class Sone

{
public static void main(String[] args)
{
StringBuffer sb=new StringBuffer("Aachal");
System.out.println(sb);

//reverse string
sb.reverse();
System.out.println(sb);

//append a character
sb.append("$");
System.out.println(sb);

//append a char array
char a[]={'R','a','m'};
sb.append(a);
System.out.println(sb);

//insulting char at specifing location
sb.insert(3,'*');
System.out.println(sb);

//delete form particular position
sb.delete(3,5);
System.out.println(sb);
}
}