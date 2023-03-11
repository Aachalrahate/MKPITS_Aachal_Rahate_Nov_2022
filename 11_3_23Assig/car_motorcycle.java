class vehical
 {
	 void veh()
	 {
	  System.out.println("my vehical");
	 }
   }
  class car extends vehical
   {
    void carname()
     {
      System.out.println("My car name is swift");
     }
   }

   class motorcycle extends vehical
    {
     void motorcyclename()
      {
       System.out.println("my motorcycle name is Hornet");
      }
    }


  public class car_motorcycle
   {
    public static void main(String[] args)
     {
      car c=new car();
       c.carname();

       motorcycle m=new motorcycle();
        m.motorcyclename();
     }
   }