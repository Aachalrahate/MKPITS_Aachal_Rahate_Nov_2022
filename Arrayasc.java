import java.util.Arrays;

class Arrayasc
  {
  public static void main(String args[])
   {
   int [] a=new int[]{9,5,3,67,34,12,54,98};
   Arrays.sort(a);
   System.out.println("Array of Decending order");
   for(int i=0;i<a.length;i++)
    {
    System.out.println(a[i]);
    }
   }
  }