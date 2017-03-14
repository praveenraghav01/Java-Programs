import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="Twegui" width=400 height=500></applet>*/
public class Twegui extends JApplet
implements ItemListener
{
	JTextField jtf;
	public void init()
	{
		//Get content pane
		Container contentPane=getContentPane();
		contentPane.setLayout(new FlowLayout());
		//Create icon
		ImageIcon normal=new ImageIcon("IMG_20160221_210932.jpg");
		ImageIcon rollover=new ImageIcon("2016-02-18.jpg");
		ImageIcon selected=new ImageIcon("Katy.jpg");
		//Add checkbox
		JCheckBox cb=new JCheckBox("C",normal);
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);
		cb.addItemListener(this);
		contentPane.add(cb);
		cb=new JCheckBox("C++");
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);
		cb.addItemListener(this);
		contentPane.add(cb);
		cb=new JCheckBox("Java");
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);cb.setMnemonic('j');
		cb.addItemListener(this);
		contentPane.add(cb);
		cb=new JCheckBox("Perl");
		cb.setRolloverIcon(rollover);
		cb.setSelectedIcon(selected);
		cb.addItemListener(this);
		contentPane.add(cb);
		//Add textfield
		jtf=new JTextField(15);
		contentPane.add(jtf);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		JCheckBox cb=(JCheckBox)ie.getItem();
		jtf.setText(cb.getText());
	}
}