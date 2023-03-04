class one{
public static void main(int x, int y)
  {
  int temp=x;
  x=y;
  y=temp;

  System.out.println("x="+x);
    System.out.println("y="+y);
  }
}

public class Swap extends one
  {
  public static void main(String[] args){
  int a=13;
  int b=8;
  swap(a,b);
  }
  }