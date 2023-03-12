interface Shape
 {
  public void Area();
  public void Perimeter();
 }
 
 class rectangle implements Shape
  {
   public int length;
   @Override
   public void Area()
    {
     System.out.println("Area of length");
    }
    
   @Override
   public void Perimeter()
    {
     System.out.println("Perimeter of length");
    }
  }
  
  class circle implements Shape
    {
     public int width;
     @Override
     public void Area()
      {
       System.out.println("Area of circle");
      }
      
      @Override
      public void Perimeter()
       {
        System.out.println("Perimeter width");
       }
     }
     
     public class RectCircle_interce
       {
        public static void main(String[] args)
         {
          rectangle r=new rectangle();
           r.Area();
           r.Perimeter();
          circle c=new circle();
           c.Area();
           c.Perimeter();
         }
       }