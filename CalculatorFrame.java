import javax.swing.*;
import java.awt.*;
class Frame1
{
JFrame f1;
JTextField t1;
//JLabel l1;
JPanel p1,p2,p3;

Frame1()
{
//create frame 1 step

JFrame.setDefaultLookAndFeelDecorated(true);
f1=new JFrame();
Container c = f1.getContentPane();
f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//init of object 2 step
//l1=new JLabel(" ");
t1=new JTextField(80);
p1=new JPanel();
p1.setLayout(new GridLayout(4,1));
p1.setBackground(Color.BLUE);
//p1.setSize(20,20);
p1.add(new JButton("C"));
p1.add(new JButton("="));
p1.add(new JButton("-"));
p1.add(new JButton("+"));


/////////////////////
p2=new JPanel();
p2.setBackground(Color.PINK);
p2.add(t1);

////////////////////
p3=new JPanel();
p3.setBackground(Color.ORANGE);
p3.setLayout(new GridLayout(4,3));
for(int i=0;i<=9;i++)
{
	p3.add(new JButton(""+i));
}
p3.add(new JButton("*"));
p3.add(new JButton("%"));

//seting layout 3 step
//c.setLayout(new FlowLayout(FlowLayout.LEFT));

//ass to container
//c.add(l1);
//c.add(t1);
c.add(p1,BorderLayout.EAST);
c.add(p2,BorderLayout.NORTH);
c.add(p3,BorderLayout.CENTER);

//visible and size of jframe
f1.setSize(300,300);
f1.setVisible(true);
}
}

public class CalculatorFrame
{
public static void main(String[] args)
{
new Frame1();
}
}