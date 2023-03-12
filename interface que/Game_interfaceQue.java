interface Game
 {
  public void Play();
  public void getRules();
 }

 class Chess implements Game
  {
   public int NumOfPieces;
   @Override
    public void Play()
     {
      System.out.println("Play game");
     }
     @Override
     public void getRules()
      {
       System.out.println("Rules of game");
      }
   }

   class Checkers implements Game
    {
     public int CheckersClass;
     @Override
     public void Play()
      {
       System.out.println("checker game");
      }

      @Override
      public void getRules()
       {
        System.out.println("checkers rules");
       }
    }

    public class Game_interfaceQue
     {
      public static void main(String[] args)
       {
        Chess c=new Chess();
         c.Play();
         c.getRules();
        Checkers c1=new Checkers();
         c1.Play();
         c1.getRules();
       }
     }