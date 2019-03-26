import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ta4 {

	private JFrame frame;
	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
	}
public static void main(String[] args) {
					ta4 window = new ta4();
					window.frame.setVisible(true);
	}
	public ta4() {
		initialize();
		frame.setVisible(true);
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(127, 255, 212));
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYouAreTravelling = new JLabel("You are travelling from- to -");
		lblYouAreTravelling.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblYouAreTravelling.setBounds(93, 27, 311, 33);
		frame.getContentPane().add(lblYouAreTravelling);
		
		JLabel lblMeansOfTransport = new JLabel("Means of transport is \"TRAIN\".");
		lblMeansOfTransport.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMeansOfTransport.setBounds(86, 84, 247, 43);
		frame.getContentPane().add(lblMeansOfTransport);
		
		JButton btnClickHereTo = new JButton("Click here to confirm and go for payment");
		btnClickHereTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ta5 t5=new ta5();
			}
		});
		btnClickHereTo.setBackground(Color.YELLOW);
		btnClickHereTo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnClickHereTo.setBounds(12, 174, 420, 43);
		frame.getContentPane().add(btnClickHereTo);
	}

}
