import java.util.Arrays;

class Arraysort
 {
 public static void main(String args[])
  {
  int[] a=new int[] {12,54,91,32,14,76,44};
  Arrays.sort(a);
  System.out.println("Element array in ascending order");
  for(int i=0;i<a.length;i++)
   {
   System.out.println(a[i]);
   }
  }
 }