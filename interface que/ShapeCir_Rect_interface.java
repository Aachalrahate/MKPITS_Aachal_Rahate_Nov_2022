interface Shape
 {
  public void getArea();
  public void getPerimeter();
 }
 
 class Circle implements Shape
  {
   public int radiusofcircle;
   @Override
   public void getArea()
    {
     System.out.println("radius of circle");
    }
    
    @Override
    public void getPerimeter()
     {
      System.out.println("perimeter");
     }
  }
  
  class Rectangle implements Shape
   {
    public int rectangleClass;
    @Override
    public void getArea ()
     {
      System.out.println("Rectangle area");
     }
     @Override
     public void getPerimeter()
      {
       System.out.println("Rectangle perimeter");
      }
   }
   
   class ShapeCir_Rect_interface
    {
     public static void main(String[] args)
      {
       Circle c=new Circle();
        c.getArea();
        c.getPerimeter();
       Rectangle r=new Rectangle();
        r.getArea();
        r.getPerimeter();
      }
    }