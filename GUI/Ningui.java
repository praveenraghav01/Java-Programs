//<applet code="Ningui" width=800 height=800></applet>
import java.awt.*;
import javax.swing.*;
import java.io.*;
public class Ningui extends JApplet
{
	public void init()
	{
			
	}
	public void paint(Graphics g)
	{
		Font f=new Font("Constantia",Font.BOLD,20);
		g.setFont(f);
		g.setColor(Color.RED);
		g.drawString("My Name is Raghav",10,20);
		showStatus("This is applet");
		g.drawLine(12,30,255,30);

		//g.setColor(Color.BLUE);
		g.drawLine(112,70,255,70);
		g.drawLine(112,70,62,120);
		g.drawLine(255,70,305,120);
		g.drawLine(112,70,112,120);
		g.drawLine(255,70,255,120);
		/*int a[]={112,255,305,255,112,62};
		int b[]={70,70,120,120,120,120};
		int n=7;
		g.fillPolygon(a,b,n);*/
		g.drawOval(363,120,12,12);
		g.setColor(Color.YELLOW);
		g.fillOval(55,150,50,50);
		g.fillOval(290,150,50,50);
		g.setColor(Color.RED);
		g.fillRoundRect(12,120,370,50,25,25);
		g.setColor(Color.BLACK);
		g.drawLine(00,200,800,200);
		//g.drawLine(12,120,385,120);
		//g.drawLine(12,120,12,160);

	}
	
}