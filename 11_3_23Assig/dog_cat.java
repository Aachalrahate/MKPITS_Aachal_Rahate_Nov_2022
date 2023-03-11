class Animal
 {
  void Ani()
    {
     System.out.println("My Animal");
    }
 }

 class Dog extends Animal
  {
   void Dog()
    {
     System.out.println("Dog sound bhoooo");
    }
  }

  class Cat extends Animal
    {
      void Cat()
       {
     System.out.println("Cat sound mauuuuu...");
    }
   }

  public class dog_cat
     {
      public static void main(String[] args)
       {
        Dog D=new Dog();
         D.Dog();

         Cat C=new Cat();
          C.Cat();
       }
     }