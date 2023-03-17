public class Stackdemo1
  {
   int []arry;
   int topOfStack;

   Stackdemo1(int size)
    {
     arry=new int[size];
     topOfStack=-1;
     System.out.println("Stack created with size= +size");
    }

    public boolean isEmpty()
     {
      if(topOfStack == -1)
       {
        return true;
       }
       else
        {
         return false;
        }
     }

     public static void main(String[] args)
      {
       Stackdemo1 stck=new Stackdemo1(3);
       boolean check=stck.isEmpty();
       System.out.println(check);
      }
  }