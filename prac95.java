class one
 {
  int b;
  void set(int b)
   {
    this.b=b;
   }

   void dis()
    {
     System.out.println(b);
    }
 }

 class prac95
  {
   public static void main(String[] args)
    {
     one ob1=new one();
     one ob2=new one();

     ob1.set(13);
     ob2.dis();
    }
  }