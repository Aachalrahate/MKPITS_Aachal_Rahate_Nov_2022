class arrayTran
   {
   public static void main(String args[])
    {
    int a[][]={{21,3},{7,6},{5,9}};
    int sum=0;
    System.out.println("Enter the 6 elements");
    for(int i=0;i<3;i++)
     {
     for(int j=0;i<3;j++)
      {
      System.out.println(a[i][j]+"");
      }
     }
     for(int i=0;i<3;i++)
      {
      for(int j=0;i<3;j++)
       {
       sum=sum+a[i][j];
       }
      }
      System.out.println("sum of Matrix=" +sum);
    }
   }