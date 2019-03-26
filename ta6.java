import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ta6 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private int a,b;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//	
//					ta6 window = new ta6();
//					window.frame.setVisible(true);
//	}

	public ta6(int i, int j) {
		a=i;
		b=j;
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 255, 47));
		frame.setBounds(100, 100, 496, 336);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterTheCredit = new JLabel("Enter the credit card number ");
		lblEnterTheCredit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterTheCredit.setBounds(35, 94, 265, 43);
		frame.getContentPane().add(lblEnterTheCredit);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(337, 104, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setBounds(337, 156, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEnterTheCvv = new JLabel("Enter the CVV number");
		lblEnterTheCvv.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterTheCvv.setBounds(35, 150, 224, 34);
		frame.getContentPane().add(lblEnterTheCvv);
		money m= new money();
		JLabel lblTheTotalAmount = new JLabel("The total amount is " +m.a[a][b]);
		lblTheTotalAmount.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblTheTotalAmount.setBounds(102, 23, 256, 44);
		frame.getContentPane().add(lblTheTotalAmount);
		
		JButton btnClickForYes = new JButton("click for YES!");
		btnClickForYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ta7 ta=new ta7();
			}
		});
		btnClickForYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClickForYes.setBounds(124, 229, 198, 25);
		frame.getContentPane().add(btnClickForYes);
	}
}
