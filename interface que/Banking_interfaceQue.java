
Que..BankAccount interface and checking and savings classes:
Create an interface called BankAccount that has three abstract methods: getBalance(), deposit(), and withdraw(). Then create two classes called CheckingAccount and SavingsAccount that implement the BankAccount interface. The CheckingAccount class should have an instance variable for the account's overdraft limit, and the SavingsAccount class should have an instance variable for the account's interest rate. Implement the getBalance(), deposit(), and withdraw() methods for each.


interface BankAccount
 {
  public void getBalance();
  public void deposite();
  public void withdraw();
 }


 class Checking implements BankAccount
  {
   public int accountOverdraft_limit;
   @Override
   public void getBalance()
    {
     System.out.println("check Balance");
    }

    @Override
    public void deposite()
     {
      System.out.println("check deposite");
     }

     @Override
     public void withdraw()
      {
       System.out.println("check Balance");
      }
    }

  class Saving implements BankAccount
   {
    public int SavingAccount;
    @Override
    public void getBalance()
     {
      System.out.println("Saving Balance");
     }

      @Override
         public void deposite()
          {
           System.out.println("deposite");
          }

          @Override
          public void withdraw()
           {
            System.out.println("save Balance");
           }
          }


          class Banking_interfaceQue
           {
           public static void main(String[] args)
	          {
	           Checking c=new Checking();
	            c.getBalance();
	            c.deposite();
	             c.withdraw();

	           Saving s=new Saving();
	            s.getBalance();
	            s.deposite();
	             s. withdraw();
	          }
               }