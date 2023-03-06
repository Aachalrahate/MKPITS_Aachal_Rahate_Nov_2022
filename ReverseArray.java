class ReverseArray
 {
  public static void main(String[] args)
   {
   int[] a=new int[] {1,2,3,4,5};
   System.out.println("Array");
   for(int i=0;i<=a.length;i++)
     {
     System.out.println(a[i]+"");
     }
     System.out.println("Array in reverse order");
     for(int i=0;i>=a.length-1;i--)
      {
      System.out.print(a);
      }
   }
 }