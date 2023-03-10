class prac86
 {
  public static void main(String[] args)
   {
   int count=0;
    int a[]={2,4,0,7,4,9,1,3,4};
    for(int i=0;i<a.length-1;i++)
      {
      if(a[i]==a[i+1])
        {
          count++;
        }
      }
      System.out.println("repetative 4 and 4=" +count);
   }
 }