class shape
 {
  void size()
   {
    System.out.println("print shape of size");
   }
 }

 class rectangle extends shape
   {
    void rect()
     {
      System.out.println("rectangle of area");
     }
   }

   class circle extends shape
     {
      void cir()
       {
        System.out.println("area of circle");
       }
     }

     public class shape_rect_circle_Inhe
      {
       public static void main(String[] args)
        {
         rectangle r=new rectangle();
         r.rect();
         circle c=new circle();
         c.cir();
        }
      }