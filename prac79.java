import java.util.Scanner;   //not uploaded

class prac79
 {
 public static void main(String[] args)
 {
 int upr=0,lwr=0,dg=0,sc=0,sp=0;
 //Scanner sc=new Scanner(System.in);
 //System.out.println("Enter the string");

 String s="rahate aachal 13@gmail.com";
  char c[]=s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i]>='A' && c[i]<'Z'){
                upr++;
            } else if (c[i]>='a' && c[i]<='z') {
                lwr++;
            } else if (c[i]>='0' && c[i]<='9') {
                dg++;
            } else if (c[i]==' ') {
                sp++;
            }
            else{
                sc++;
            }
        }
   System.out.println(upr);
   System.out.println(lwr);
   System.out.println(dg);
   System.out.println(sp);
   System.out.println(sc);


}
}