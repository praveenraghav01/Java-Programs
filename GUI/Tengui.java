/*JPanel P=new JPanel();
GridLayout g=new GridLayout(4,3);
p.setLayout(g);*/
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class Tengui extends JFrame
{
	public Tengui()
	{
	//BorderLayout f=new BorderLayout();
		
		//setLayout(f);	
	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(4,3));
	for(int i=1;i<10;i++)
	{
		p1.add(new JButton(""+i));
	}
	p1.add(new JButton(""+0));
	p1.add(new JButton("start"));
	p1.add(new JButton("stop"));

	JPanel p2=new JPanel(new BorderLayout());
	p2.add(new JTextField("Text Area"),BorderLayout.NORTH);
	p2.add(p1,BorderLayout.CENTER);

	add(p2,BorderLayout.EAST);
	add(new JButton("Food Place"),BorderLayout.CENTER);

}

public static void main(String[] args)
{
	Tengui t=new Tengui();
	t.setSize(800,800);
	t.setVisible(true);
}
}