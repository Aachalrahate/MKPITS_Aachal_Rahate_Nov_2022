import java.util.HashSet;

 class prac68
   {
   public static void main(String args[])
     {
      HashSet hs=new HashSet();
      System.out.println("Before hash"+ hs.size());
      hs.add("Mahi");
      hs.add("Sahi");
      hs.add("Piya");
      hs.add("Kuhu");

      System.out.println("After hash" +hs.size());
      System.out.println(hs);
     }
   }