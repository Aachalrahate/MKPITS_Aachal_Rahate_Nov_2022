class shape
  {
  void area()
   {
    System.out.println("Display area");
   }
}

   class Triangle extends shape{

   void area(int l,int b)
    {
    System.out.println("Triangle area");
    }
   }

   class square extends Triangle
  {
  void square(int b,int h)
   {
    System.out.println("square area");
   }
}


  public class Mutli_inhe
   {
   public static void main(String[] args)
    {
    square obj=new square();
     obj.area();
    }
   }