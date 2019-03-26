import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class ta1_1 {

	private JFrame frame;
	public person p;
//	public static void main(String[] args) {
//					ta1_1 window = new ta1_1(p );
//					window.frame.setVisible(true);
//	}
	public ta1_1(person p) {
		//System.out.println("Object ta1 called");
//		try{
//		initialize();
//		}
//		catch(Exception e){
//			//e.printStackTrace();
//			System.out.println(e);
//		}
//		frame.setVisible(true);
	//	System.out.println("The details of the person are: ");
		this.p=p;
		//System.out.println("name: " + p.name);
		//System.out.println("age is: "+ p.age);
		
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNameIs = new JLabel("Customer name :");
		lblNameIs.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNameIs.setBounds(31, 33, 118, 46);
		frame.getContentPane().add(lblNameIs);
		
		JLabel lblNewLabel = new JLabel(p.name);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(191, 42, 103, 29);
		frame.getContentPane().add(lblNewLabel);
		frame.setVisible(true);
	}
}
