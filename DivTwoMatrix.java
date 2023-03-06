class DivTwoMatrix
 {
 public static void main(String args[])
  {
  int a[][]={ {1,2,3},{2,5,1},{6,4,2} };
  int b[][]={ {1,1,1},{5,3,2},{8,4,1} };
  int c[][]=new int [3][3];

  for(int i=0;i<3;i++)
   {
   for(int j=0;j<3;j++)
     {
     c[i][j]=a[i][j]/b[i][j];
     System.out.print(" "+c[i][j]);
     }
     System.out.println();
   }
  }
 }