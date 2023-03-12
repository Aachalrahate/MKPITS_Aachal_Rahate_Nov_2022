interface Vehicle
 {
  public void Start();
  public void Stop();
 }
 
 class Car implements Vehicle
  {
    int car_make;
    String model;
   @Override
   public void Start()
    {
     System.out.println("car started");
    }
    @Override
    public void Stop()
     {
      System.out.println("car stoped");
     }
  }
  
  class Motorcycle implements Vehicle
   {
    public int engSize;
    @Override
    public void Start()
     {
      System.out.println("motorcycle  start");
     }
     @Override
     public void Stop()
      {
       System.out.println("motorcycle stop");
      }
   }
   
   public class carmotorcycle_interface
    {
     public static void main(String[] args)
      {
       Car c=new Car();
        c.Start();
        c.Stop();
       Motorcycle m=new Motorcycle();
        m.Start();
        m.Stop();
      }
    }