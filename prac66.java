import java.util.LinkedList;

 class prac66
   {
   public static void main(String args[])
     {
      LinkedList li=new LinkedList();
      System.out.println("list"+ li.size());
      li.add("Aachal");
      li.add("Saloni");
      li.add("Prachi");
      li.add("Pallavi");
      li.removeFirst();
      li.removeLast();


      System.out.println("list" +li.size());
      System.out.println(li);
     }
   }