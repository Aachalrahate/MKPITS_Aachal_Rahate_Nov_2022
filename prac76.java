class prac76
  {
  public static void main(String[] args)
    {
    for(int i=1;i<=7;i=i+2)
      {
       for(int k=7-i;k>=1;k--)
        {
        System.out.print("  ");
        }
         for(int j=1;j<=i;j=j+2)
          {
           System.out.print(i);
          }
          System.out.println();
      }
    }
  }