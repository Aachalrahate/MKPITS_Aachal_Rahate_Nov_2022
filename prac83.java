class prac83
 {
 public static void main(String[] args)
  {
   int count=0;
   int a[]={2,3,4,5,6,7};
   for(int i=0;i<a.length;i++)
    {
     if(a[i]==5)
      {
       count++;
      }
    }
    if(count==3)
     {
      System.out.println("it is a triple");
     }
     else
       {
        System.out.println("it is not triple");
       }
    }
 }