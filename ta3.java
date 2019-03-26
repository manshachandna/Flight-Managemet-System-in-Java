import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ta3{

	private JFrame frame;
	public static void main(String[] args, String String) {
		ta3 window = new ta3(String , String);
					window.frame.setVisible(true);
		}
	public ta3(String code, String code1) {
		initialize(code, code1);	
	frame.setVisible(true);
	}
	
	private void initialize(String code, String code1) {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 239, 213));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(108, 28, 56, 16);
		frame.getContentPane().add(label);
		
		JLabel lblYouW = new JLabel("You are travelling from " +code +" to " +code1 );
		lblYouW.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblYouW.setBounds(52, 28, 317, 49);
		frame.getContentPane().add(lblYouW);
		//for money calculation
		int i,j;
		if(code.compareTo("mumbai")==0)
		{
			i=0;
			if(code1.compareTo("mumbai")==0)
			{
				j=0;
			}
			else if(code1.compareTo("chennai")==0)
			{
				j=1;
			}
			else if(code1.compareTo("pune")==0)
			{
				j=2;
			}
			else j=3;
		}
		else if(code.compareTo("chennai")==0)
		{
			i=1;
			if(code1.compareTo("mumbai")==0)
			{
				j=0;
			}
			else if(code1.compareTo("chennai")==0)
			{
				j=1;
			}
			else if(code1.compareTo("pune")==0)
			{
				j=2;
			}
			else j=3;
		}
		else if(code.compareTo("pune")==0)
		{
			i=2;
			if(code1.compareTo("mumbai")==0)
			{
				j=0;
			}
			else if(code1.compareTo("chennai")==0)
			{
				j=1;
			}
			else if(code1.compareTo("pune")==0)
			{
				j=2;
			}
			else j=3;
		}
		else{
			i=3;
			if(code1.compareTo("mumbai")==0)
			{
				j=0;
			}
			else if(code1.compareTo("chennai")==0)
			{
				j=1;
			}
			else if(code1.compareTo("pune")==0)
			{
				j=2;
			}
			else j=3;
		}

		
		JLabel lblMeansOfTransportation = new JLabel("Means of transportation is \" AEROPLANE\".");
		lblMeansOfTransportation.setBackground(new Color(255, 248, 220));
		lblMeansOfTransportation.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMeansOfTransportation.setBounds(52, 111, 332, 31);
		frame.getContentPane().add(lblMeansOfTransportation);
		
		JButton btnClickToGo = new JButton("Click to confirm and go for payment");
		btnClickToGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				ta6 t6=new ta6(i,j);
			}
		});
		btnClickToGo.setBackground(Color.YELLOW);
		btnClickToGo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnClickToGo.setBounds(52, 168, 332, 49);
		frame.getContentPane().add(btnClickToGo);
	}

}
