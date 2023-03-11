class Stack
  {
   void sk()
    {
     System.out.println("stack interface");
    }
  }

  class array extends Stack
   {
    void arr()
     {
      System.out.println("array is collection of similar datatype ");
     }
   }

   class linkedList extends array
     {
      void link()
        {
         System.out.println("linked list is a linear collection of data elements");
        }
     }

     public class ArrayLinkedlist
      {
       public static void main(String[] args)
        {
         array a=new array();
          a.arr();
         linkedList l=new linkedList();
          l.link();
        }
      }