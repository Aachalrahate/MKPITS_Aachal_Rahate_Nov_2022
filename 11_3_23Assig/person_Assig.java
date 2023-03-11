class person
 {
  void per()
    {
     System.out.println("all are one");
    }
  }
  class employee extends person
   {
    void emp()
     {
      System.out.println("Employee");
     }
   }
    class customer extends person
     {
      void cust()
       {
        System.out.println("Customer");
       }
     }

    public class person_Assig
       {
        public static void main(String[] args)
         {
          employee e=new employee();
           e.per();
           e.emp();

           customer c=new customer();
            c.cust();
         }
       }