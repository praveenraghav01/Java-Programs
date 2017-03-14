import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="ForEvent" width="400" height="500"></applet>*/
public class ForEvent extends JApplet implements KeyListener
{
String msg="b";
public void init()
{
	addKeyListener(this);
}
public void keyPressed(KeyEvent k)
{
	showStatus("Key Pressed");
	setBackground(Color.GREEN);
}
public void keyReleased(KeyEvent k)
{
	showStatus("Key Released");
	setBackground(Color.PINK);
}
public void keyTyped(KeyEvent k)
{
	msg=msg+k.getKeyChar();
}
public void paint(Graphics g)
{
	g.drawString(msg,20,40);
}
}