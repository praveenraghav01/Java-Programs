import java.awt.*;
import javax.swing.*;
class Firstgui extends JFrame
{
	Firstgui()
	{
		JLabel l1=new JLabel("Name");
		JLabel l2=new JLabel("Reg ID");
		JTextField t1=new JTextField(10);
		JTextField t2=new JTextField(10);
		JButton b1=new JButton("Submit");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		t1.setBackground(Color.BLUE);
		t1.setForeground(Color.WHITE);
		t2.setBackground(Color.BLUE);
		t2.setForeground(Color.WHITE);
		l1.setForeground(Color.RED);
		l2.setForeground(Color.RED);
		l1.setBounds(100,100,50,30);
		t1.setBounds(150,100,140,25);
		l2.setBounds(100,150,50,30);
		t2.setBounds(150,150,140,25);
		b1.setBounds(130,200,90,30);
		FlowLayout f=new FlowLayout();
		setLayout(null);
		setVisible(true);
		setSize(400,400);
	}
	public static void main(String[] args) 
	{
		Firstgui o=new Firstgui();
	}
}