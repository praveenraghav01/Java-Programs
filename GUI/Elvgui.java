import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
public class Elvgui extends JFrame
{
	Elvgui()
	{
		/*BorderLayout f=new BorderLayout();
		setLayout(f);

		setVisible(true);
		setSize(800,100);*/
		ImageIcon i1=new ImageIcon("2016-02-18.jpg");
        ImageIcon i2=new ImageIcon("IMG_20160221_210932.jpg");
		JLabel l1=new JLabel("Email Id");
		JLabel l2=new JLabel("Password");
		JButton b1=new JButton(i1);
		b1.setPressedIcon(i2);
		//JList
		String []nm={"Praveen","Vrij","Suggu","Abhi"};
		JList a=new JList(nm);
		JComboBox b=new JComboBox(nm);
		JCheckBox c= new JCheckBox("B.Tech");
		JCheckBox c1= new JCheckBox("M.Tech");
		JRadioButton r1=new JRadioButton("Male");
		JRadioButton r2=new JRadioButton("Female");
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);

		/*for borderlayout
		add(a,BorderLayout.SOUTH);
		add(b,BorderLayout.CENTER);
		add(c,BorderLayout.WEST);
		add(l1,BorderLayout.EAST);
		add(l2,BorderLayout.EAST);
		add(b1,BorderLayout.NORTH);*/
		//add(t);
		add(l1);
		add(a);
		add(b);
		add(c);
		add(c1);
		add(r1);
		add(r2);
		add(b1);
		FlowLayout f=new FlowLayout();
		setSize(800,800);
		setVisible(true);
		setLayout(f);
	}
	public static void main(String[] args) 
	{
		Elvgui o=new Elvgui();
	}
}