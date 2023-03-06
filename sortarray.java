import java.util.Arrays;

class sortarray
 {
 public static void main(String[] args)
   {
   int a[]={12,34,6,7,89,2,3,13,22};
   Arrays.sort(a,2,7);
   for(int i=0;i<a.length;i++)
     {
      System.out.println(a[i]);
     }
   }
 }