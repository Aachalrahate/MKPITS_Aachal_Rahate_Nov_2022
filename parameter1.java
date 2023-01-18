 class parademo
{
int a;
parademo(int x)
{
a=x;
}
void dis()
{
System.out.println("a="+a);
}
}

 class parameter1
{
	public static void main(String[] args)
	{
		parademo ob1= new parademo(13);
		parademo ob2= new parademo(8);

		ob1.dis();
		ob2.dis();
	}
}





