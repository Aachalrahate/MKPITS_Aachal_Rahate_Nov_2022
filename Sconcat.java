class Sconcat
{
public static void main(String[] args)
{
	//lenght of string
/*char data[]={'a' ,'c' , 'h', 'a', 'l'};
String sob=new String(data);
System.out.println(sob);
int len=sob.length();
System.out.println(len);*/


// copy one string to another
String ob1="aachal";
String ob2=new String();

ob2=ob1;
System.out.println(ob2);

//concatination
String ob3="MINA";
System.out.println(ob1.concat(ob3));

//compare
System.out.println(ob1.compareTo(ob3));

}
}