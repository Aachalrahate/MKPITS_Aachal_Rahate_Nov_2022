class Shape
 {
  void sh()
   {
    System.out.println("Shape area");
   }
 }

 class Ellipse extends Shape
  {
   void ellip()
    {
     System.out.println("ellipse shape");
    }
  }

  class rhombus extends Ellipse
    {
     void size()
      {
       System.out.println("rhombus shape");
      }
    }

    public class ellipse_rhombus_signl
     {
  public static void main(String[] args)
     {
      Ellipse ob=new Ellipse();
       ob.ellip();

      rhombus ob1=new rhombus();
       ob2.size();
     }
}