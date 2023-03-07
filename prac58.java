import java.util.HashSet;
 
 class prac58
   {
   public static void main(String args[])
     {
      HashSet hs=new HashSet();
      System.out.println("Before hash"+ hs.size());
      hs.add(10);
      hs.add(8);
      hs.add(6);
      hs.add(3);
      
      System.out.println("After hash" +hs.size());
      System.out.println(hs);
     }
   }