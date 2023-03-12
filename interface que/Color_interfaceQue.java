interface Color
 {
  public void getColorCode();
 }

 class Red implements Color
  {
   public String Rcode;
   @Override
   public void getColorCode()
    {
     System.out.println("color is red");
    }
  }

  class Green implements Color
   {
    public String Gcode;
    @Override
    public void getColorCode()
     {
      System.out.println("color is Green");
     }
   }

   class Blue implements Color
    {
     @Override
     public void getColorCode()
      {
       System.out.println("color is Blue");
      }
    }

    public class Color_interfaceQue
     {
      public static void main(String[] args)
       {
        Red r=new Red();
         r.getColorCode();
        Green g=new Green();
         g.getColorCode();
        Blue b=new Blue();
         b.getColorCode();
       }
     }