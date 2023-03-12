interface Shape
 {
  public void Area();
  public void Perimeter();
 }

 class Square implements Shape
   {
    public int length;
    @Override
    public void Area()
     {
      System.out.println("area of square");
     }
     @Override
     public void Perimeter()
      {
       System.out.println("perimeter area");
      }
    }

  class triangle implements Shape
    {
     public int height;
     @Override
     public void Area()
      {
       System.out.println("Area height");
      }
      @Override
      public void Perimeter()
       {
        System.out.println("perimeter heigth");
       }
    }

    public class SquTri_interfaceQue
     {
      public static void main(String[] args)
       {
        Square s=new Square();
         s.Area();
         s.Perimeter();
        triangle t=new triangle();
         t.Area();
         t.Perimeter();
       }
     }