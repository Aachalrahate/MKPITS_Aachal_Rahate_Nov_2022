import java.util.Scanner;

class AssQ26_1Feb
{
public static void main(String[] args)
{
int mntnum;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
mntnum=sc.nextInt();
switch(mntnum)
  {
     case 1:
           System.out.println("Jan");
           break;

      case 2:
           System.out.println("Feb");
           break;

      case 3:
	   System.out.println("march");
            break;

     case 4:
           System.out.println("april");
           break;

     case 5:
	   System.out.println("may");
           break;

     case 6:
           System.out.println("june");
           break;

     case 7:
           System.out.println("July");
           break;

     case 8:
           System.out.println("Aug");
           break;

     case 9:
           System.out.println("Sept");
           break;

     case 10:
           System.out.println("Oct");
           break;

     case 11:
           System.out.println("Nov");
           break;

     case 12:
           System.out.println("Dec");
           break;

        default:

           System.out.println("Invalid day number."+"Please try again ");
	       break;
          }
    }
}