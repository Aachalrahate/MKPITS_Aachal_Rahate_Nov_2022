class adddemo
{
private int a,b;
int res;
void set(int x,int y)
{
a=x;
b=y;
}
adddemo sum(adddemo cob2, adddemo cob3)
{
adddemo tob=new adddemo();

tob.a=a+cob2.a+cob3.a;
tob.b=b+cob2.b+cob3.b;
return tob;
}
void dis()
{
System.out.println(a+" "+b);
}
}


class objreturmntype
{
public static void main(String[] args)
{
adddemo ob1=new adddemo();
adddemo ob2=new adddemo();
adddemo ob3=new adddemo();
adddemo ob4=new adddemo();

ob1.set(12,3);
ob2.set(3,6);
ob3.set(13,8);
ob4.set(4,4);

ob4=ob1.sum(ob2,ob3);

ob4.dis();
}
}
