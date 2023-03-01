class prac7
{
public static void main(String[] args)
  {
  String str="Aachal";
  char c[]=str.toCharArray();
  for(int i=0;i<c.length-1;i++)
   {
    for(int j=i+1;j<c.length;j++)
     {
     if(c[i]==c[j])
      {
      System.out.println(c[j]);
      }
     }
   }
  }
}