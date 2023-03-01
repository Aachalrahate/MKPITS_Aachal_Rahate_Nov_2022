class demo
{
int i,squ,cub;

void set()
  {
  for(i=0;i<=20;i++)
     {
     squ=i*i;
     System.out.println("the square of "+i +"= " +squ);
     }
  }

  void dis()
    {
     cub=i*i*i;
     System.out.println("the cube of "+i +"= " +cub);
    }
  }

  class AssQ18_18Feb
    {
    public static void main(String[] args)
      {
      demo ob=new demo();
      ob.set();
      ob.dis();
      }
    }
