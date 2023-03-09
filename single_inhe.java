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
    System.out.println("length and breath");
    }
   }


  public class single_inhe
   {
   public static void main(String[] args)
    {
    Triangle obj=new Triangle();
     obj.area();
    }
   }