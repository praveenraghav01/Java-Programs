import java.awt.*;
import javax.swing.*;
public class Fivgui extends JFrame
{
	Fivgui()
	{
		/*JLabel l1=new JLabel("Email Id");
		JLabel l2=new JLabel("Password");
		JTextField t1=new JTextField(10);
		JPasswordField t2=new JPasswordField(10);
		JButton b1=new JButton("Submit");*/
		//JList
		String ab[]={"1","2","3","4"};
		JList a=new JList(ab);
		
		add(a);
		/*add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(t);
		add(b1);
		t2.setEchoChar('#');*/
		//add(t);
		GridLayout f=new GridLayout();
		setLayout(f);
		setVisible(true);
		setSize(800,100);
	}
	public static void main(String[] args) 
	{
		Fivgui o=new Fivgui();
	}
}