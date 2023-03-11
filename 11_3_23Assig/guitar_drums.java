class Musician
 {
  void musc()
   {
    System.out.println("Musician");
   }
 }

 class guitar extends Musician
  {
   void guit()
     {
      System.out.println(" My Guitar");
     }
  }

  class drums extends guitar
   {
    void drum()
      {
       System.out.println("My Drum");
      }
   }

   public class guitar_drums
    {
     public static void main(String[] args)
      {
       guitar g=new guitar();
        g.guit();

        drums d=new drums();
         d.drum();
      }
    }