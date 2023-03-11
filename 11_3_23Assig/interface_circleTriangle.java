class Shape
 {
  void sh()
   {
    System.out.println("shape size");
   }
 }
 
 class circle extends Shape
   {
    void cir()
     {
      System.out.println("Area of Circle");
     }
   }
   
  class rectangle extends Shape
    {
     void rect()
      {
       System.out.println("Area of Rectangle");
      }
    }
    
    public class interface_circleTriangle
      {
       public static void main(String[] args)
        {
         circle c=new circle();
          
        }
      }