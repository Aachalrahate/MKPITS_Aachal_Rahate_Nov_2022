class fordemo
{
int a[]={1,2,3,4};
void fun()
{
for(int v:a)
{
System.out.println("for each:"+v);
}
}
}

public class foreach
{
public static void main(String[] args)
{
fordemo ob=new fordemo();
ob.fun();
}
}