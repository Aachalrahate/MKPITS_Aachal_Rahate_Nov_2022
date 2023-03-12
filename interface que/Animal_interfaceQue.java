interface Animal
 {
  public void makeSound();
  public void move();
 }

 class dog implements Animal
  {
   public String dogsbreed;
   @Override
   public void makeSound()
    {
     System.out.println("my dog is cute");
    }

    @Override
    public void move()
     {
      System.out.println("Moving");
     }
  }

  class cat implements Animal
   {
    public String catsname;
    @Override
    public void makeSound()
     {
      System.out.println("my cat name Bella");
     }

     @Override
     public void move()
      {
       System.out.println("Movable");
      }
   }

   public class Animal_interfaceQue
     {
      public static void main(String[] args)
       {
        dog g=new dog();
         g.makeSound();
         g.move();

        cat c=new cat();
         c.makeSound();
         c.move();
       }
     }