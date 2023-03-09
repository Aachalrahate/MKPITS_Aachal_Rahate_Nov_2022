class prac82
 {
 public static void main(String[] args)
  {
   int count=0;
   int a[]={6,3,5,2,4,9,1,6};
   for(int i=0;i<a.length;i++)
    {
     if(a[i]==a[i+1])
       {
        count++;
       }
    }
    System.out.println("repetation of 6 and 6 =" +count);
  }
 }