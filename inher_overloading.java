class student
 {
 String name;
 int age;

 void info(String name)
  {
  System.out.println("name");
  }
 void info(int age)
  {
  System.out.println("age");
  }
 void info(String name,int age)
  {
  System.out.println(name+""+age);
  }
 }

 public class inher_overloading
   {
   public static void main(String[] args)
    {
    student s=new student();
     s.info(s.name);
    }
   }