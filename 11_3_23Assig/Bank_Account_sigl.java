class BankAccount
 {
  void BA()
   {
    System.out.println("Create Bank Account");
   }
 }
 
 class checking extends BankAccount
   {
    void check()
      {
       System.out.println("checking Bank Account");
      }
   }
   
   class saving extends BankAccount
     {
      void save()
        {
         System.out.println("Saving money");
        }
     }
     
     public class Bank_Account_sigl
      {
       public static void main(String[] args)
        {
         checking c=new checking();
          c.check();
         saving s=new saving();
          s.save();
        }
      }