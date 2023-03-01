class demo
  {
  char c;
  void value()
   {
   System.out.println("small a to z");
   for(c='a';c<='z';c++)
   System.out.println(c);
   }
   void value1()
    {
    System.out.println("capital A to Z");
    for(c='A';c<='Z';c++)
    System.out.println("c");
    }

    class AssQ16_18feb
    {
   public static void main(String[] args)
      {
       demo ob=new demo();
       ob.value();
       ob.value1();

}
  }
}