import java.util.Scanner;

class AssQ25_1feb
{
 public static void main(String[] args)
 {
   int dignum;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter any digit");
   dignum=sc.nextInt();
   
   switch(dignum)
        {
        case 1:
               System.out.println("Zero");
               break;
               
         case 2:
                System.out.println("One");
                break;
               
         case 3:
                System.out.println("Two");
                break;
                
         case 4:
                System.out.println("Three");
                break;
                
         case 5:
                System.out.println("Four");
                break;
                
          case 6:
                 System.out.println("Five");
                 break;
                 
          case 7:
                  System.out.println("Six");
                  break;
                  
           case 8:
                  System.out.println("Seven");
                  break;
                  
           case 9:
                  System.out.println("Eight");
                  break;
                  
            case 10:
                   System.out.println("Zero");
                   break;
                   default:
                      
                      System.out.println("Invalid Digit "+"try again");
                      break;
        }
 }
}