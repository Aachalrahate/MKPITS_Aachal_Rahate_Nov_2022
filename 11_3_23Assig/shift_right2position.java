class shift_right2position
  {
   public static void main(String[] args)
    {
     int a[]={1,2,3,4,5,6,7};

      int temp1=a[a.length-1];
      int temp2=a[a.length-2];

     int a2[]=new int[a.length];

     for(int i=0;i<a.length;i++)
      {
       a2[i]=a[i-2];
      }

      a2[1]=temp1;
      a2[2]=temp2;

      for(int i=0;i<a2.length;i++)
       {
        System.out.println(" "+a2[i]);
       }
    }
  }