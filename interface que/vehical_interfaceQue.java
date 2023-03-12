interface vehicle
 {
  public void start();
  public void stop();
 }

 class car implements vehicle
  {
   public String carmodel;
   @Override
   public void start()
    {
     System.out.println("Swift Car");
    }
    @Override
    public void stop()
     {
      System.out.println("Swift Desire Car");
     }
   }

  class motorcycle implements vehicle
    {
     public String motorcycleengine;
     @Override
     public void start()
      {
       System.out.println("Hornet Bike");
      }
      @Override
      public void stop()
       {
        System.out.println("Supersonic Bike");
       }
    }

    public class vehical_interfaceQue
      {
       public static void main(String[] args)
        {
         car c=new car();
          c.start();
          c.stop();

         motorcycle m=new motorcycle();
          m.start();
          m.stop();
        }
      }