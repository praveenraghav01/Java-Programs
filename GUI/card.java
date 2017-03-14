import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Card extends JFrame implements ActionListener
{
CardLayout c;
JButton b1,b2,b3;
JPanel p1,p2,p3,cardPanel,buttonPanel;
Card()
{
c=new CardLayout();
p1=new JPanel();
p2=new JPanel();
p3=new JPanel();
cardPanel =new JPanel();
buttonPanel=new JPanel();
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
p1.setBackground(Color.RED);
p2.setBackground(Color.GREEN);
p3.setBackground(Color.BLUE);
buttonPanel.add(b1);
buttonPanel.add(b2);
buttonPanel.add(b3);
cardPanel.setLayout(c);
cardPanel.add(p1,"First");
cardPanel.add(p2,"Second");
cardPanel.add(p3,"Third");
BorderLayout b=new BorderLayout();
setLayout(b);
add(cardPanel,BorderLayout.CENTER);
add(buttonPanel,BorderLayout.SOUTH);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
c.show(cardPanel,"First");
if(ae.getSource()==b2)
c.show(cardPanel,"Second");
if(ae.getSource()==b3)
c.show(cardPanel,"Third");
}

public static void main(String[]args)
{
Card s=new Card();
}

}

