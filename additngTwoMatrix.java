class additngTwoMatrix
 {
 public static void main(String args[])
  {
  int a[][]={ {8,1,3},{3,5,4},{6,2,3} };
  int b[][]={ {1,3,2},{5,3,1},{1,7,0} };
  int c[][]=new int[3][3];

  for(int i=0;i<3;i++)
   {
   for(int j=0;j<3;j++)
    {
    c[i][j]=a[i][j]+b[i][j];

   System.out.print(" " +c[i][j]);
    }
    System.out.println();
   }
  }
 }