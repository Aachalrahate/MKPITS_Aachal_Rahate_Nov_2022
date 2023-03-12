interface Shape
  {
   public void Area();
   public void Perimeter();
  }

  class ellipse implements Shape
  {
   public int major;
   @Override
   public void Area()
    {
     System.out.println("an ellipse");
    }

    @Override
    public void Perimeter()
     {
      System.out.println("Perimeter length");
     }
   }

   class rhombus implements Shape
     {
      public int minor;
      @Override
      public void Area()
       {
        System.out.println("all equal sides");
       }

       @Override
       public void Perimeter()
        {
         System.out.println("Perimeter area");
        }
     }

     public class Shape_interfaceQue
       {
        public static void main(String[] args)
          {
           ellipse e=new ellipse();
            e.Area();
            e.Perimeter();
           rhombus r=new rhombus();
            r.Area();
            r.Perimeter();
          }
       }