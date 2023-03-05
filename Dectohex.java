// Convert Decimal To Hexadecimal

import java.util.Scanner;

 class Dectohex
  {
  public static void main(String[] args)
   {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter Decimal Number");
   int n=sc.nextInt();
   String hex="";
   while(n>0)
   {
   int r=n%16;
   n=n/16;

   switch(r)
    {
   case 1:
        hex='A'+hex;
        break;

   case 2:
        hex='B'+hex;
        break;

    case 3:
        hex='C'+hex;
        break;

    case 4:
        hex='D'+hex;
        break;

    case 5:
        hex='E'+hex;
        break;

    case 6:
        hex='F'+hex;
        break;

        default:
        hex=r+hex;
        break;

      System.out.println("Hexadecimal=" +hex);
    }
   }
   }
  }