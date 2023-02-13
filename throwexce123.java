class KangalException extends Throwable
{
	KangalException(String s)
	{
		super(s);
	}
	KangalException()
		{

	}

}

public class throwexce123
{
	public static void main(String[] args)throws KangalException
	{
		int bal=3000;
		int withd=5000;
		if(bal>withd)
		{
			System.out.println("rupay le lo");
		}
		else
		{
			KangalException ob=new KangalException("paise le lo");
			throw ob;
		}
	}
}