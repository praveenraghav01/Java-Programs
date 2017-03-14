import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FirEvent extends JFrame implements ActionListener
{
	JTextField t;
	FirEvent()
	{
		JTextField t=new JTextField(40);
		t.setBounds(60,50,170,20);
		JButton b=new JButton("click me");
		b.setBounds(100,120,80,30);
		b.addActionListener(this);
		
		add(b);add(t);
		setSize(300,300);
		setVisible(true);
		FlowLayout f=new FlowLayout();
		setLayout(f);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			t.setText("Welcome");
		}
	}


public static void main(String[] args) {
	FirEvent e=new FirEvent();
}}