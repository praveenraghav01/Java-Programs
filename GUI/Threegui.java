import java.awt.*;
import javax.swing.*;
class Threegui extends JFrame
{
	Threegui()
	{
		JLabel l1=new JLabel("Email Id");
		JLabel l2=new JLabel("Password");
		JTextField t1=new JTextField(10);
		JPasswordField t2=new JPasswordField(10);
		JButton b1=new JButton("Submit");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		t2.setEchoChar('#');
		GridLayout f=new GridLayout();
		setLayout(f);
		setVisible(true);
		setSize(800,100);
	}
	public static void main(String[] args) 
	{
		Threegui o=new Threegui();
	}
}