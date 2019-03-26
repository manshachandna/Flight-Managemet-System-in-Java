import java.util.*;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

public class ta1 implements ActionListener {
	//setContentPane(new JLabel(new ImageIcon("C:\\Users\\Mansha\\Desktop\\downoad.jpg")));
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
					ta1 window = new ta1();
					window.frame.setVisible(true);
	}
	public ta1() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame("YOUR TRAVEL AGENCY ");
		frame.setBackground(new Color(240, 240, 240));
		frame.getContentPane().setBackground(new Color(255, 192, 203));
		frame.setBounds(100, 100, 443, 296);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\Mansha\\Desktop\\download.jpg"));
		//add(background);

		JLabel lblNewLabel = new JLabel("WELCOME TO YOUR TRAVEL AGENCY");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setBounds(54, 13, 378, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		//String name=JTextField.getText();
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(41, 54, 56, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		person p=new person();
		textField = new JTextField();
		textField.setBounds(158, 51, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		//int age=sc.nextInt();
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAge.setBounds(41, 89, 56, 22);
		frame.getContentPane().add(lblAge);
		
		textField_1 = new JTextField();
		
		textField_1.setBounds(158, 86, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGender.setBounds(41, 128, 56, 16);
		frame.getContentPane().add(lblGender);
		
		textField_2 = new JTextField();
		textField_2.setBounds(158, 122, 116, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("email ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(41, 157, 79, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(158, 157, 116, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPassword.setBounds(41, 186, 79, 22);
		frame.getContentPane().add(lblPassword);
		
		textField_4 = new JTextField();
		textField_4.setBounds(158, 192, 116, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnClickHereWhen = new JButton("Click here when you fill up all the details.");
		btnClickHereWhen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClickHereWhen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=textField.getText();
				p.name=s;
				try{
				String s1=textField_1.getText();
				int a = Integer.parseInt(s1);
				p.age=a;
				}
				catch(Exception e1)
				{
					System.out.println("Please enter valid age");
				}
				finally{
					
					frame.setVisible(false);
				}
				String s2=textField_2.getText();
				p.gender=s2;
				String s3=textField_3.getText();
				p.email=s3;
				frame.setVisible(false);
				ta2 t2=new ta2(p);
			}
			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnClickHereWhen.setBackground(Color.YELLOW);
		btnClickHereWhen.setBounds(41, 221, 336, 25);
		frame.getContentPane().add(btnClickHereWhen);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(402, 81, 21, 98);
		frame.getContentPane().add(scrollBar);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
