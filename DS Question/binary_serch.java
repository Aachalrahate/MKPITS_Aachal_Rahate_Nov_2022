import java.util.Scanner;

class binary_serch
  {
   public static void main(String[] args)
    {
     int a={2,4,5,6,9,10,23,34};
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter search Number");
     int searchno=sc.nextInt();

     int start=0;
     int end=a.length-1;
     int mid=0;

     for(int i=0;i<a.length;i++)
       {
        mid=(start+end)/2;

        if(searchno==a[mid])
         {
          System.out.println("It is found");
          break;
         }
         else if(s>a[mid])
          {
           start=mid+1;
          }
           else if(s<a[mid])
            {
             end=mid-1;
            }
          else
             {
               System.out.println("not found");
             }
       }
    }
  }