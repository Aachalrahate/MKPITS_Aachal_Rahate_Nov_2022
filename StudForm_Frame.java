import javax.swing.*;
import java.awt.*;

class StudForm_Frame
{
public static void main(String[] args)
{
StudForm_Frame s=new StudForm_Frame();
}
JFrame f1;
JLabel l1,l2,l3;
JTextField t1,t2,t3;
JButton b1;
StudForm_Frame()
{
f1=new JFrame();
l1=new JLabel("enter your Name:");
l2=new JLabel("enter your aadress:");
l3=new JLabel("enter your Phone No:");
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();

b1=new JButton("Submit");

f1.setLayout(null);
l1.setBounds(100,100,50,50);
t1.setBounds(120,100,60,60);
l2.setBounds(140,100,50,50);
t2.setBounds(160,100,60,60);
l3.setBounds(180,100,50,50);
t3.setBounds(200,100,60,60);

f1.add(l1);
f1.add(t1);
f1.add(l2);
f1.add(t2);
f1.add(l3);
f1.add(t3);

f1.setSize(200,200);
f1.setVisible(true);
}
}



