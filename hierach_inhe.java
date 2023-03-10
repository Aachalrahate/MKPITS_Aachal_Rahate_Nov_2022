class shape
 {
 void area()
  {
   System.out.println("Display area");
  }
 }
 
 class Triangle extends shape{
 void area(int l,int h)
  {
  System.out.println("Triangle");
  }
 }
 
 class Rectangle extends shape{
 void area(int l,int b,int h)
  {
   System.out.println("Rectangle");
  }
 }
 
 public class hierach_inhe{
 
 public static void main(String[] args)
  {
   Rectangle r=new Rectangle();
    r.area();
  }
  }