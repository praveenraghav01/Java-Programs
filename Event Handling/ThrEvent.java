import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ThrEvent extends JFrame implements ItemListener
{
	JComboBox c;
	JLabel l;
	ThrEvent()
	{
		String []c1={"Praveen","Vicky","Vriju","Raghav","Suggu"};
		setTitle("Choice with ItemListener Demo");
		setLayout(new FlowLayout());
		c=new JComboBox(c1);
		l=new JLabel();
		l.setBounds(200,100,200,80);
		c.setBounds(100,100,200,80);
		add(c);
		add(l);
		c.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		l.setText("You selected \t"+c.getSelectedItem());

	}
	public static void main(String[] args) {
		ThrEvent t=new ThrEvent();
		t.setVisible(true);
		t.setSize(800,600);
	}
}