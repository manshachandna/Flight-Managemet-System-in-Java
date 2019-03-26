import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

	public class example extends JFrame implements ActionListener{
		
		JTextField t3= new JTextField(10);
		public void setComponents() 
		{
			JLabel l1=new JLabel("WELCOME TO ''YOUR TRAVEL AGENCY''  ");
			JLabel l2=new JLabel("Please enter your details and your choices below :- ");
			JLabel l3=new JLabel("Name");
			JLabel l4=new JLabel("Mobile Number");
			JLabel l5=new JLabel("e-mail ID");
			JLabel l6=new JLabel("Enter your password");
			JTextField t4= new JTextField(10);
			JTextField t5= new JTextField(10);
			JTextField t6= new JTextField(10);
			JButton b1= new JButton("Click here when you fill up alll the Details");
			String ch1[]={"mumbai","pune","chennai","hyderabad"};
			String ch2[]={"mumbai","pune","chennai","hyderabad"};
			setLayout(new FlowLayout());
			JComboBox cb2=new JComboBox(ch2);
			JComboBox cb1=new JComboBox(ch1);
//			l1.setLayout(null);
//			l2.setLayout(null);
//			t3.setLocale(null);
//			l1.setBounds(100,50,200,20);
//			l2.setBounds(100,90,200,20);
//			l3.setBounds(50,130,100,20);
//			l4.setBounds(50,170,100,20);
//			l5.setBounds(50,210,5100,20);
//			l6.setBounds(50,250,100,20);
//			t3.setBounds(200,290,100,20);
//			t4.setBounds(200,310,100,20);
//			t5.setBounds(200,360,100,20);
//			t6.setBounds(200,410,100,20);
//			b1.setBounds(150,450,100,20);
//			cb1.setBounds(100,490,100,20);
//			cb2.setBounds(300,530,100,20);
			add(l1);
			add(l2);
			add(l3);
			add(t3);
			add(l4);
			add(t4);
			add(l5);
			add(t5);
			add(l6);
			add(t6);
			add(cb1);
			add(cb2);
			add(b1);
			b1.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e){
			setVisible(false);
			ssum a = new ssum();
			
		}
		public example()
		{ }
		public example(String string) {
			super(string);
		}
public static void main(String[] args) {
	example jf= new example("Your Travel Agency");
	jf.setComponents( );
	jf.setSize(500,500);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
}
}

