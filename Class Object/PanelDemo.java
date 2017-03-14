import java.applet.Applet;  
import java.awt.*; 
import javax.swing.*; 
class PanelDemo extends JFrame
{
PanelDemo()
{
JPanel p1=new JPanel();
JPanel p2=new JPanel();
GridLayout g= new GridLayout(4,3);
p1.setLayout(g);
BorderLayout b=new BorderLayout();
p2.setLayout(b);
JButton b1=new JButton("1");
JButton b2=new JButton("2");
JButton b3=new JButton("3");
JButton b4=new JButton("4");
JButton b5=new JButton("5");
JButton b6=new JButton("6");
JButton b7=new JButton("7");
JButton b8=new JButton("8");
JButton b9=new JButton("9");
JButton b10=new JButton("0");
JButton b11=new JButton("start");
JButton b12=new JButton("stop");
p1.add(b1);
p1.add(b2);
p1.add(b3);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
p1.add(b8);
p1.add(b9);
p1.add(b10);
p1.add(b11);
p1.add(b12);
JTextField t=new JTextField("Time");
p2.add(t,BorderLayout.NORTH);
p2.add(p1,BorderLayout.CENTER);
add(p2);
setVisible(true);
}
public static void main(String []args)
{
PanelDemo p = new PanelDemo();
}
}