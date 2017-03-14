import java.awt.*;
import javax.swing.*;
import java.io.*;
public class Sevgui extends JFrame
{
	Sevgui()
	{
		JMenuBar m=new JMenuBar();
		JMenu menu=new JMenu("File");
		
		JMenuItem m1=new JMenuItem("New");
		JMenuItem m2=new JMenuItem("Open");
		JMenuItem m3=new JMenuItem("Save");
		JMenuItem m4=new JMenuItem("Close");
		JMenu mem=new JMenu("NEW");
		JMenuItem m5=new JMenuItem("PDF");
		JMenuItem m6=new JMenuItem("WORD");
		
		menu.add(mem);
		menu.add(m2);
		menu.add(m3);
		menu.add(m4);
		m.add(menu);
		mem.add(m5);
		mem.add(m6);
		add(m);
		FlowLayout f=new FlowLayout();
		setSize(800,800);
		setVisible(true);
		setLayout(f);
	}
	public static void main(String[] args) 
	{
		Sevgui o=new Sevgui();
	}
}