class Game
  {
   void gm()
    {
     System.out.println("Playing Game");
    }
  }

 class chess extends Game
  {
   void chess()
    {
     System.out.println("My Best Game chess");
    }
  }

  class checkers extends chess
   {
    void checker()
     {
      System.out.println(" checkers is classic board game");
     }
   }

   public class chess_checker_multi
     {
      public static void main(String[] args)
       {
        chess c=new chess();
         c.chess();

         checkers c1=new checkers();
          c1.checker();
       }
     }
