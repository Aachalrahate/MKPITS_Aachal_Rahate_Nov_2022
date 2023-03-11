class Shif_tLeft2Position
{
  public static void main(String [] args)
 {
  int a[]={1,2,3,4,5,6,7,8,9};
  int temp1=a[0];
  int temp2=a[1];

  int a2[]=new int[a.length];

  for(int i=0; i<a.length-2; i++)
  {
    a2[i]=a[i+2];
  }

  a2[a2.length-2]=temp1;
  a2[a2.length-1]=temp2;

  for(int i=0; i<a2.length; i++)
  {
	 System.out.print(a2[i]+" ");
  }
 }
}