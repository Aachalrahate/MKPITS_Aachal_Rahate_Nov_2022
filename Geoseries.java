class Geo
{
int i;
void set()
{
for(i=5;i<=200;i=i*2)
{
System.out.println(i);
}
}
}

class Geoseries
{
public static void main(String[] args)
{
Geo ob1=new Geo();
ob1.set();
}
}