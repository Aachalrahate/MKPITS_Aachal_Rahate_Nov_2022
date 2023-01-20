class one1
{
one1()
{
}
   one1(int x, int y)
   {
     System.out.println(x+ " " +y);
   }

}

class two extends one1
{
   two()
   {
     new one1(13,8);
   }
}

class overridingS3
{
  public static void main(String[] args)
  {
    two ob=new two();

  }
}