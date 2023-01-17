class tri
{
int i,sum=0;
void set()
{
for(i=1;i<50;i++)
{
sum=sum+i;
System.out.println(sum);
}
}
}

class Triangular
{
public static void main(String[] args)
{
tri ob1=new tri();
ob1.set();
}
}