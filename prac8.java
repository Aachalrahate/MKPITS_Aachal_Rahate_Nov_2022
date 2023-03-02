import java.util.Arrays;
class prac8
{
public static void main(String[] args)
  {
  int a[]={23,13,43,22};
  int largest=a[0];
  Arrays.sort(a);

  for(int i=0;i<a.length;i++)
    {
    if(a[i]>largest)
      {
      largest=a[i];
      }
   }
      System.out.println("The array of largest nu=" +largest);

  }
}