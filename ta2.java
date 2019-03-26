
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ta2<item, item1> {
	private JFrame frame;
	person p;
	String code, code1;
 void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
//	public static void main(String[] args, person p) {
//		ta2 window = new ta2(p);
//					window.frame.setVisible(true);
//	}
					public ta2(person p)
					{
						this.p = p;
						initialize();
					}
		private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(221, 160, 221));
		frame.setBounds(100, 100, 450, 300);
frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
//		comboBox.setToolTipText("");
		String ch1[]={"mumbai","pune","chennai","hyderabad"};
	//	setSelectedItem(ch1);
		JComboBox comboBox = new JComboBox(ch1);
		comboBox.setSelectedItem(4);
		//	comboBox.addActionListener((ActionListener) this);
		String s1=comboBox.getSelectedItem().toString();
		System.out.println(s1);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox) e.getSource();
				item i=(item)cb.getSelectedItem();
				code=(String)cb.getSelectedItem();
				System.out.println(code);
			}
		});
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setBounds(98, 27, 88, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTo.setBounds(64, 30, 32, 16);
		frame.getContentPane().add(lblTo);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFrom.setBounds(231, 30, 56, 16);
		frame.getContentPane().add(lblFrom);
		
		String ch2[]={"mumbai","pune","chennai","hyderabad"};
		//setSelectedItem(ch2);
		JComboBox comboBox_1 = new JComboBox(ch2);
		comboBox_1.setSelectedItem(4);
		String s2=comboBox_1.getSelectedItem().toString();
		System.out.println(s2);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				JComboBox cb1 = (JComboBox) e1.getSource();
				item1 i1=(item1)cb1.getSelectedItem();
				code1=(String)cb1.getSelectedItem();
				System.out.println(code1);
			}
		});
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setBounds(275, 27, 105, 22);
		frame.getContentPane().add(comboBox_1);
		
		JRadioButton rdbtnAeroplane = new JRadioButton("Aeroplane");
		rdbtnAeroplane.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//System.out.println(p.name);
				a ra=new a();
				frame.setVisible(false);
			    ta3 t3=new ta3(code, code1);
				System.out.println("name is:  " +p.name);
				System.out.println("age is:  " +p.age);
				System.out.println("gender is:  " +p.gender);
				System.out.println("email is:  " +p.email);
				new ta1_1(p);
			}
		});
		rdbtnAeroplane.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnAeroplane.setBounds(64, 98, 127, 25);
		frame.getContentPane().add(rdbtnAeroplane);
		
		JRadioButton rdbtnTrain = new JRadioButton("Train");
		rdbtnTrain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			ta4 t4=new ta4();
//			ta1_1 q=new ta1_1(p);
					//q.setVisible(true);
			}
		});
		rdbtnTrain.setFont(new Font("Tahoma", Font.PLAIN, 16));
		rdbtnTrain.setBounds(64, 128, 127, 25);
		frame.getContentPane().add(rdbtnTrain);
		
		JLabel lblChooseAMeans = new JLabel("Choose a means of transport");
		lblChooseAMeans.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblChooseAMeans.setBounds(64, 62, 208, 27);
		frame.getContentPane().add(lblChooseAMeans);
//		JButton btnClick = new JButton("click!");
//		btnClick.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e1) {
//				setVisible(false);
//				ta3 t=new ta3();
//			}
//		});
//		btnClick.setBounds(163, 181, 97, 25);
//		frame.getContentPane().add(btnClick);
}
		private void setSelectedItem(String[] ch1) {
			// TODO Auto-generated method stub
		}}