import java.util.LinkedList;

 class prac63
   {
   public static void main(String args[])
     {
      LinkedList li=new LinkedList();
      System.out.println("list"+ li.size());
      li.add(10);
      li.add(8);
      li.add(6);
      li.add(3);
      li.add(12);
      li.add(34);

      System.out.println("list" +li.size());
      System.out.println(li);
     }
   }