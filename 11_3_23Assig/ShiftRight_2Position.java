class ShiftRight_2Position
{
  public static void main(String [] args)
 {
  int a1[]={1,2,3,4,5,6,7};

  int temp1=a1[a1.length-1];
  int temp2=a1[a1.length-2];

  int a2[]=new int[a1.length];

  for(int i=2; i<a1.length; i++)
  {
    a2[i]=a1[i-2];
  }

  a2[1]=temp1;
  a2[0]=temp2;

  for(int i=0; i<a2.length; i++)
  {
	 System.out.print(" "+a2[i]);
  }
 }
}
