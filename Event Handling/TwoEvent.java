import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TwoEvent extends JFrame implements ActionListener
{
	JButton b1;
	JButton b2;
	JTextField t;
	TwoEvent()
	{
		setLayout(new FlowLayout());
		t=new JTextField(40);
		t.setBounds(75,50,100,50);
		b1=new JButton("To Lower");
		b1.setBounds(50,200,50,50);
		b2=new JButton("To Upper");
		b2.setBounds(100,200,50,50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(t);
		add(b1);
		add(b2);
		

	}
	public void actionPerformed(ActionEvent obj)
	{
		String m;
		if(obj.getSource()==b1)
		{
			m=t.getText();
			m=m.toLowerCase();
			t.setText(m);
		}
		if(obj.getSource()==b2)
		{
			m=t.getText();
			m=m.toUpperCase();
			t.setText(m);
		}
	}
	public static void main(String[] args) {
		TwoEvent t=new TwoEvent();
		t.setSize(800,600);
		t.setVisible(true);
	}
}