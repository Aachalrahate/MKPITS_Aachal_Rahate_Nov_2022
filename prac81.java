class prac81
 {
 public static void main(String[]args)
  {
   int a1[]={2,4,3,7,8,0};
   int a2[]=new int[a1.length];
   for(int i=0;i<a1.length;i++)
    {
     if(a1[i]>0)
      {
       a2[i]=a1[i];
      }
    }
    for(int i=0;i<a2.length;i++)
      {
       System.out.println(a2[i]);
      }
  }
 }