import java.util.Scanner;

class AssQ24_1feb
{
public static void main(String[] args)
  {
   int daynum;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number of day");
   daynum=sc.nextInt();
     switch(daynum)
       {
         case 1:
           System.out.println("Monday");
           break;

         case 2:
            System.out.println("Tuesday");
            break;

         case 3:
	    System.out.println("Wednesday");
            break;

          case 4:
            System.out.println("Thursday");
            break;

          case 5:
	    System.out.println("Friday");
            break;

          case 6:
            System.out.println("Saturday");
            break;

          case 7:
	    System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid day number "+"please try next again");
            break;
       }
  }
}