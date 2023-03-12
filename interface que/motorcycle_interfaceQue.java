interface vehicle
 {
  public void start();
  public void stop();
 }

 class Bicycle implements vehicle
  {
   public int numofgears;
   @Override
   public void start()
    {
     System.out.println("single track vehival");
    }
    @Override
    public void stop()
     {
      System.out.println("pedal cycle");
     }
   }

  class motorcycle implements vehicle
    {
     public String engine ;
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

    public class motorcycle_interfaceQue
      {
       public static void main(String[] args)
        {
         Bicycle b=new Bicycle();
          b.start();
          b.stop();

         motorcycle m=new motorcycle();
          m.start();
          m.stop();
        }
      }