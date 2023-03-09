class prac73
 {
 public static void main(String[] args)
  {
  int a[][]={ {92,80} ,{12,17} };
  int b[][]={ {78,45},{23,14} };
  int c[][]=new int[2][2];

  for(int i=0;i<2;i++)
   {
   for(int j=0;j<2;j++)
     {
     c[i][j]=a[i][j]*b[i][j];

     System.out.print(" "+c[i][j]);
     }
     System.out.println();
   }
  }
 }