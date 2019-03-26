import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ta7 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					ta7 window = new ta7();
					window.frame.setVisible(true);
		}
	public ta7() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().setBackground(new Color(102, 205, 170));
		frame.setBounds(100, 100, 563, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblThankYouFor = new JLabel("All the transactions are in process");
		lblThankYouFor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblThankYouFor.setBounds(108, 29, 352, 39);
		frame.getContentPane().add(lblThankYouFor);
		
		JLabel lblTheDesiredAmount = new JLabel("The desired amount will be cut from from your bank balance");
		lblTheDesiredAmount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTheDesiredAmount.setBounds(12, 103, 521, 25);
		frame.getContentPane().add(lblTheDesiredAmount);
		
		JButton btnClickToExit = new JButton("Click to exit");
		btnClickToExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnClickToExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnClickToExit.setBounds(150, 190, 216, 44);
		frame.getContentPane().add(btnClickToExit);
	}

}
