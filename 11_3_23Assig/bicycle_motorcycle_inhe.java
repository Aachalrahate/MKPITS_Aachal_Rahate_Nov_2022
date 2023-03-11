class vehical
  {
   void vehi()
    {
     System.out.println("Wheel and engine");
    }
  }

  class bicycle extends vehical
    {
     void start()
      {
       System.out.println("Bicycles from top brands like Hero");
      }
    }

    class motorcycle extends bicycle
      {
       void start1()
        {
       System.out.println("Honda Motorcycle");
      }
     }

   public class bicycle_motorcycle_inhe
     {
      public static void main(String[] args)
        {
         bicycle b=new bicycle();
          b.start();
          //v.vehi();
         motorcycle m=new motorcycle();
          m.start1();
        }
     }