class Shape
 {
 void sp()
  {
   System.out.println("Shape of size");
  }
 }
 
 class square extends Shape
  {
   void squ()
    {
     System.out.println("Area of Square");
    }
  }
  
  class triangle extends Shape
    {
     void tri()
      {
       System.out.println("Area of Triangle");
      }
    }
    
    public class square_tri_inher
     {
      public static void main(String[] args)
        {
         square s=new square();
          s.squ();
         triangle t=new triangle();
          t.tri();
        }
     }