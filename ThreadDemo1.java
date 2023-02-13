class Th1 extends Thread
{
@Override
public void run()
{
for(int i=0;i<10;i++)
{
try
{
sleep(1000);
}
catch(InterruptedException e)
{     }

System.out.println(getName()+":"+i);
}
}
}
 class Th2 extends Thread
 {
 @Override
 public void run()
 {
 for(int i=10;i>0;i--)
 {
 System.out.println(getName()+":"+i);
 }
 }
 }

 public class ThreadDemo1
 {
 public static void main(String[] args)
 {
 Th1 ob1=new Th1();
 ob1.setName("ram");
 Th2 ob2=new Th2();
 ob2.setName("shyam");
 System.out.println(ob1); //
 System.out.println(ob2);

 Thread mth=Thread.currentThread();
 System.out.println(mth);
 ob1.start();
 ob2.start();
 }
 }