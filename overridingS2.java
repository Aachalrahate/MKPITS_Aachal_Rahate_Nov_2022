class one1
{

   one1(int x, int y)
   {
     System.out.println(x+ " " +y);
   }
}

class two extends one1
{
   two()
   {
     super(13,8);
   }
}

class overridingS2
{
  public static void main(String[] args)
  {
    two t=new two();
    //t.two();
  }
}