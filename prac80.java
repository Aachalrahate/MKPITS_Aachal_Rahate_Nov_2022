class prac80
  {
  public static void main(String[] args)
   {
    int a[]={4,7,8,9,2,5,1};
    for(int i=0;i<a.length-1;i++)
     {
      if(a[i]>=a[i+1])
       {
        System.out.println(a[i]);
       }
     }
   }
  }