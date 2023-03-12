interface Musician
 {
  public void playinstrument();
  public  void sing();
 }

 class guitar implements Musician
  {
   public String guitarBrand;
   @Override
   public void playinstrument()
    {
   System.out.println("best guitar");
  }

   @Override
   public void sing()
    {
   System.out.println("play guitar");
   }
  }
  class Drummer implements Musician
    {
    public int DrumSize;
     @Override
     public void playinstrument()
      {
       System.out.println("Drummer play");
      }

      @Override
      public void  sing()
       {
        System.out.println("singer play");
       }
    }

    public class musician_interfaceQue
      {
       public static void main(String[] args)
        {
         guitar g=new guitar();
          g.playinstrument();
          g.sing();

         Drummer d=new Drummer();
          d.playinstrument();
          d.sing();
        }
      }