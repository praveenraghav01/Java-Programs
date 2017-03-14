import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class DatabaseEvent extends JFrame implements ActionListener  {
JLabel name=new JLabel("Name");
    	JLabel reg= new JLabel("Reg. no");
    	JTextField nm=new JTextField(20);
    	JTextField rno=new JTextField(10);
    	JButton sub=new JButton("Submit");
    DatabaseEvent(){
    	add(name);
    	add(nm);
    	add(reg);
    	add(rno);
    	add(sub);
    	sub.addActionListener((ActionListener)this);
    	FlowLayout f=new FlowLayout(); 
    	setLayout(f);
  

    }
    public void actionPerformed (ActionEvent ae)
    	{
       try
        {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.print("Drivers Loaded Successfully\n");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","praveen@01");
        PreparedStatement s=c.prepareStatement("insert into info values(?,?)");
        s.setString(1,nm.getText());
        s.setInt(2,Integer.parseInt(rno.getText()));
        s.execute();
        System.out.print("Connection Created\n");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

    	}





	public static void main(String[] args) {
		DatabaseEvent de=new DatabaseEvent();
		de.setVisible(true);
		de.setSize(800,800);
		
	}

}


