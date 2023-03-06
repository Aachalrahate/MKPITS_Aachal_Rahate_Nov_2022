class arraysum
 {
 public static void main(String args[])
  {
  int arr[][]={{1,2},{3,6}};
  int sum=0;
  System.out.println("Enter the 4 elements");
  for(int i=0;i<=1;i++)
   {
   for(int j=0;j<=1;j++)
    {
    System.out.println(arr[i][j]+"");
    }
   }
   for(int i=0;i<=1;i++)
    {
    for(int j=0;j<=1;j++)
     {
     sum=sum+arr[i][j];
     }
    }
    System.out.println("sum of matrix=" +sum);
  }
 }