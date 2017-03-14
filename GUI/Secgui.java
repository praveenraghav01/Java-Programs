import java.awt.*;
import javax.swing.*;
class Secgui extends JFrame
{
	Secgui()
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
		GridLayout f=new GridLayout();
		setLayout(f);
		setVisible(true);
		setSize(800,100);
	}
	public static void main(String[] args) 
	{
		Secgui o=new Secgui();
	}
}