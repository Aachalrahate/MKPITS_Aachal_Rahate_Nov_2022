interface Vehical
 {
  public void drive();
  public void stop();
 }
 
 class Car implements Vehical
  {
   int car_make;
    String model;
   @Override
   public void drive()
    {
     System.out.println("car is driving");
    }
    @Override
    public void stop()
     {
     System.out.println("car is stop");
     }
    }
    
    class Truck implements Vehical
     {
      float load_cap;
      float towing_cap;
      
      @Override
      public void drive()
       {
        System.out.println("Truck is driving");
       }
       
       @Override
       public void stop()
        {
         System.out.println("Truck is Stop");
        }
     }
    
    class CarTruck_interfaceQue
      {
       public static void main(String[] args)
        {
         Car c=new Car();
          c.drive();
          c.stop();
         Truck t=new Truck();
          t.drive();
          t.stop(); 
        }
      }