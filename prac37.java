class prac37
  {
  public static void main(String[] args)
    {
    int a[]={1,2,3,4,5};
    int sum=0;
    System.out.println("Enter 5 Number");
    for(int i=0;i<5;i++)
     {
     if(a[i]%2==0)
      {
      System.out.println("Number is even");
      }
      sum=sum+a[i];
     }
    }
  }