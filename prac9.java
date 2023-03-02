import java.util.Arrays;

class prac9
 {
 public static void main(String[] args)
   {
   int a[]={12,29,45,13};
   int c=a.length;
   Arrays.sort(a);
   System.out.println("sorted Array");
   for(int i=0;i<a.length;i++)
     {
     System.out.println(a[i]);
     }
   }
 }