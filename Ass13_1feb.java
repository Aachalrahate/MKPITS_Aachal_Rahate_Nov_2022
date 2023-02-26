import java.util.Scanner;

class Ass13_1feb
{
public static void main(String[] args)
 {
 int math,phy,chem,sum=0,sub=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the marks");
  math=sc.nextInt();
  phy=sc.nextInt();
  chem=sc.nextInt();
  if(math>65 && math==65)
   {
    System.out.println("marks" +math);
   }
    if(phy>55 && phy==55)
     {
     System.out.println("marks" +phy);
     }
       if(chem>50 && chem==50)
        {
        System.out.println("marks" +chem);
        }

        sum=math+phy+chem;
        sub=phy+chem;

        if(sum>180 && sum==180 || math>140 && math==140 || sub>140 && sub==140)
          {
          System.out.println("eligibility of admission for professional courses");
          }
            else
                {
                  System.out.println("not eligibility of admission for professional courses");
                }

         }
       }