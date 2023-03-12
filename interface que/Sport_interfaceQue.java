interface Sport
 {
  public void playGame();
  public void getEquipmenet();
 }

 class basketball implements Sport
  {
   public int ballsize;
   @Override
   public void playGame()
    {
     System.out.println("Game Start");
    }
    @Override
    public void getEquipmenet()
     {
      System.out.println("Equipment");
     }
  }

  class football implements Sport
   {
   public int footballshape;
   @Override
   public void playGame()
    {
     System.out.println("foot ball shape");
    }
    @Override
    public void getEquipmenet()
     {
      System.out.println("getEquipmenet");
     }
   }

   public class Sport_interfaceQue
    {
     public static void main(String[] args)
      {
       basketball b=new basketball();
        b.playGame();
        b.getEquipmenet();
      football f=new football();
        f.playGame();
        f.getEquipmenet();
      }
    }