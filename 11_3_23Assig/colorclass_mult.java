class Color
 {
  void inter()
    {
     System.out.println("variety of colors");
    }
 }

 class Red extends Color
  {
   void Red()
    {
     System.out.println("Red color is attractive");
    }
  }

  class Green extends Red
   {
    void Green()
     {
      System.out.println("Green represents nature");
     }
   }

   class Blue extends Green
    {
     void Blue()
      {
       System.out.println("Blue is primary color");
      }
    }

    public class colorclass_mult
     {
      public static void main(String[] args)
       {
        Red r=new Red();
         r.Red();
        Green g=new Green();
          g.Green();
        Blue b=new Blue();
          b.Blue();
       }
     }