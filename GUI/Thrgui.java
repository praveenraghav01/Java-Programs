/*JPanel P=new JPanel();
GridLayout g=new GridLayout(4,3);
p.setLayout(g);*/
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class Thrgui extends JFrame
{
	public Thrgui()
	{	
	JPanel p1=new JPanel();
    p1.setLayout(new GridLayout(5,4));
	p1.add(new JButton("CLR"));
	p1.add(new JButton("/"));
	p1.add(new JButton("*"));
	p1.add(new JButton("%"));
	p1.add(new JButton(""+9));
	p1.add(new JButton(""+8));
	p1.add(new JButton(""+7));
	p1.add(new JButton("-"));
	p1.add(new JButton(""+6));
	p1.add(new JButton(""+5));
	p1.add(new JButton(""+4));
	p1.add(new JButton("+"));
	p1.add(new JButton(""+3));
	p1.add(new JButton(""+2));
	p1.add(new JButton(""+1));
	p1.add(new JButton("="));
	p1.add(new JButton("DEL"));
	p1.add(new JButton(""+0));
	p1.add(new JButton("."));
	p1.add(new JButton("<-"));
	

	JPanel p2=new JPanel(new BorderLayout());
	JTextField t1=new JTextField(10);
	//t1.setBounds(0,0,140,140);
	p2.add(t1);
	p2.add(p1,BorderLayout.SOUTH);

	add(p2,BorderLayout.NORTH);
	/*add(new JButton("Food Place"),BorderLayout.CENTER);
*/
}

public static void main(String[] args)
{
	Thrgui t=new Thrgui();
	t.setSize(300,400);
	t.setVisible(true);
}
}