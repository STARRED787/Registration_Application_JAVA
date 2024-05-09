import java.awt.EventQueue;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.JToggleButton;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class New_User_Registration_sign_Up extends JFrame {

	private JPanel contentPane;
	private JTextField tf_add1;
	private JTextField tf_nation;
	private JTextField tf_email;
	private JTextField tf_city;
	private JTextField tf_mno;
	private JTextField tf_add2;
	private JTextField tf_pin;
	private JTextField tf_pno;
	private JTextField tf_answer;
	private JTextField tf_uname;
	private JTextField tf_name;
	private JTextField tf_sname;
	private JPasswordField pf_password;
	private JPasswordField pf_conpassword;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					New_User_Registration_sign_Up frame = new New_User_Registration_sign_Up();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public New_User_Registration_sign_Up() {
		setBackground(new Color(240, 255, 255));
		setTitle("Registration Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 941, 672);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("");
		lblNewLabel_3_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\question-mark-310100_1280m.jpg"));
		lblNewLabel_3_1_1.setBounds(185, 355, 28, 33);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\question-mark-310100_1280m.jpg"));
		lblNewLabel_3_1_1_1.setBounds(235, 425, 32, 33);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\question-mark-310100_1280m.jpg"));
		lblNewLabel_3_1.setBounds(255, 248, 28, 33);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel = new JLabel("New User Registration Sign Up");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 287, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\question-mark-310100_1280m.jpg"));
		lblNewLabel_3.setBounds(131, 47, 26, 33);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Genral Details");
		lblNewLabel_1.setIconTextGap(5);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\images1.png"));
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBackground(new Color(176, 224, 230));
		lblNewLabel_1.setBounds(10, 47, 904, 33);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tittle");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(20, 91, 55, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox cb_title = new JComboBox();
		cb_title.setForeground(new Color(0, 0, 0));
		cb_title.setBackground(new Color(255, 255, 255));
		cb_title.setModel(new DefaultComboBoxModel(new String[] {"-SELECT-", "Mr.", "Ms.", "Mrs."}));
		cb_title.setFont(new Font("Calibri", Font.PLAIN, 12));
		cb_title.setBounds(118, 91, 149, 22);
		contentPane.add(cb_title);
		
		JLabel lblNewLabel_2_1 = new JLabel("Address Line 1");
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(18, 127, 90, 14);
		contentPane.add(lblNewLabel_2_1);
		
		tf_add1 = new JTextField();
		tf_add1.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_add1.setBounds(118, 124, 149, 20);
		contentPane.add(tf_add1);
		tf_add1.setColumns(10);
		
		JLabel lblNewLabel_2_2 = new JLabel("Country");
		lblNewLabel_2_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(20, 162, 55, 14);
		contentPane.add(lblNewLabel_2_2);
		
		JComboBox cb_contry = new JComboBox();
		cb_contry.setModel(new DefaultComboBoxModel(new String[] {"-SELECT-", "Sri Lanka", "France", "Germany", "Canada", "Australia", "Finland", "China", "Italy", "United Kingdom", "Russia", "Malaysia"}));
		cb_contry.setFont(new Font("Calibri", Font.PLAIN, 12));
		cb_contry.setBounds(118, 154, 149, 22);
		contentPane.add(cb_contry);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nationality");
		lblNewLabel_2_1_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_1_1.setBounds(20, 192, 90, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		tf_nation = new JTextField();
		tf_nation.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_nation.setColumns(10);
		tf_nation.setBounds(118, 187, 149, 20);
		contentPane.add(tf_nation);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Email ID");
		lblNewLabel_2_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1.setBounds(20, 222, 90, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		tf_email = new JTextField();
		tf_email.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_email.setColumns(10);
		tf_email.setBounds(118, 217, 149, 20);
		contentPane.add(tf_email);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Surname");
		lblNewLabel_2_3_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_3_1.setBounds(628, 90, 55, 14);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("City");
		lblNewLabel_2_1_2_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_1_2_1.setBounds(628, 128, 90, 14);
		contentPane.add(lblNewLabel_2_1_2_1);
		
		tf_city = new JTextField();
		tf_city.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_city.setColumns(10);
		tf_city.setBounds(726, 123, 149, 20);
		contentPane.add(tf_city);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("Mobile No.");
		lblNewLabel_2_1_1_2_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_1_1_2_1.setBounds(628, 221, 90, 14);
		contentPane.add(lblNewLabel_2_1_1_2_1);
		
		tf_mno = new JTextField();
		tf_mno.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_mno.setColumns(10);
		tf_mno.setBounds(726, 216, 149, 20);
		contentPane.add(tf_mno);
		
		JLabel lblNewLabel_2_3 = new JLabel("Name");
		lblNewLabel_2_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(319, 91, 55, 14);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Address Line 2");
		lblNewLabel_2_1_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_1_2.setBounds(319, 129, 90, 14);
		contentPane.add(lblNewLabel_2_1_2);
		
		tf_add2 = new JTextField();
		tf_add2.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_add2.setColumns(10);
		tf_add2.setBounds(417, 124, 149, 20);
		contentPane.add(tf_add2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("State");
		lblNewLabel_2_2_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_2_1.setBounds(319, 162, 55, 14);
		contentPane.add(lblNewLabel_2_2_1);
		
		JComboBox cb_state = new JComboBox();
		cb_state.setModel(new DefaultComboBoxModel(new String[] {"-SELECT-", "Western Province", "Southern Province", "Berry", "Normandy", "Bavaria", "Hesse", "Alberta", "British Columbia", "New South Wales", "Queensland", "Finnish", "Swedish", "CN-AH", "CN-FJ", "Bergamo", "Antrim", "Berkshire", "Eastern Europe ", "Baltic Region ", "Johor", "Kedah"}));
		cb_state.setFont(new Font("Calibri", Font.PLAIN, 12));
		cb_state.setBounds(417, 154, 149, 22);
		contentPane.add(cb_state);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Pin Code");
		lblNewLabel_2_1_1_2.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_1_1_2.setBounds(319, 192, 90, 14);
		contentPane.add(lblNewLabel_2_1_1_2);
		
		tf_pin = new JTextField();
		tf_pin.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_pin.setColumns(10);
		tf_pin.setBounds(417, 187, 149, 20);
		contentPane.add(tf_pin);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Phone No.");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_1_1_1_1.setBounds(319, 222, 90, 14);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		tf_pno = new JTextField();
		tf_pno.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_pno.setColumns(10);
		tf_pno.setBounds(417, 217, 149, 20);
		contentPane.add(tf_pno);
		
		JLabel lblNewLabel_2_4 = new JLabel("Questions ");
		lblNewLabel_2_4.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_4.setBounds(20, 299, 88, 14);
		contentPane.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Choose Your Question And Answer");
		lblNewLabel_1_1.setIconTextGap(5);
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\images1.png"));
		lblNewLabel_1_1.setToolTipText("");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_1.setBackground(new Color(176, 224, 230));
		lblNewLabel_1_1.setBounds(10, 247, 904, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JComboBox cb_question = new JComboBox();
		cb_question.setModel(new DefaultComboBoxModel(new String[] {"-SELECT-", "How did you hear about this event?", "What are your social media handles?", "What is your emergency contact information?", "Which sessions would you like to sign up for?", "Permission to add you to our email list?"}));
		cb_question.setFont(new Font("Calibri", Font.PLAIN, 12));
		cb_question.setBounds(118, 291, 326, 22);
		contentPane.add(cb_question);
		
		tf_answer = new JTextField();
		tf_answer.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_answer.setColumns(10);
		tf_answer.setBounds(118, 324, 326, 20);
		contentPane.add(tf_answer);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Answer");
		lblNewLabel_2_1_3.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_1_3.setBounds(20, 329, 90, 14);
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Choose Your User Type");
		lblNewLabel_1_2.setIconTextGap(5);
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\images1.png"));
		lblNewLabel_1_2.setToolTipText("");
		lblNewLabel_1_2.setOpaque(true);
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_2.setBackground(new Color(176, 224, 230));
		lblNewLabel_1_2.setBounds(10, 355, 904, 33);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_6 = new JLabel("User ID");
		lblNewLabel_2_6.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_6.setBounds(20, 477, 55, 14);
		contentPane.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_1_3 = new JLabel("Choose Your  ID And Password");
		lblNewLabel_1_3.setIconTextGap(5);
		lblNewLabel_1_3.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\images1.png"));
		lblNewLabel_1_3.setToolTipText("");
		lblNewLabel_1_3.setOpaque(true);
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1_3.setBackground(new Color(176, 224, 230));
		lblNewLabel_1_3.setBounds(10, 425, 904, 33);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Password");
		lblNewLabel_2_1_5.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_1_5.setBounds(20, 507, 90, 14);
		contentPane.add(lblNewLabel_2_1_5);
		
		tf_uname = new JTextField();
		tf_uname.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_uname.setColumns(10);
		tf_uname.setBounds(148, 474, 149, 20);
		contentPane.add(tf_uname);
		
		JLabel lblNewLabel_2_1_5_1 = new JLabel("Confirm Password");
		lblNewLabel_2_1_5_1.setFont(new Font("Calibri", Font.PLAIN, 12));
		lblNewLabel_2_1_5_1.setBounds(20, 538, 118, 14);
		contentPane.add(lblNewLabel_2_1_5_1);
		
		JButton bt_register_1_1 = new JButton("EXIT");
		bt_register_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame =new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame,"Are You Want To Exit","Exit Registration Form" , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);	
				}
			}
		});
		bt_register_1_1.setFont(new Font("Calibri", Font.BOLD, 13));
		bt_register_1_1.setBounds(591, 580, 109, 42);
		contentPane.add(bt_register_1_1);
		
		tf_name = new JTextField();
		tf_name.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_name.setColumns(10);
		tf_name.setBounds(417, 91, 149, 20);
		contentPane.add(tf_name);
		
		tf_sname = new JTextField();
		tf_sname.setFont(new Font("Calibri", Font.PLAIN, 12));
		tf_sname.setColumns(10);
		tf_sname.setBounds(726, 86, 149, 20);
		contentPane.add(tf_sname);
		
		pf_password = new JPasswordField();
		pf_password.setFont(new Font("Calibri", Font.PLAIN, 12));
		pf_password.setEchoChar('*');
		pf_password.setBounds(148, 502, 149, 20);
		contentPane.add(pf_password);
		
		pf_conpassword = new JPasswordField();
		pf_conpassword.setFont(new Font("Calibri", Font.PLAIN, 12));
		pf_conpassword.setEchoChar('*');
		pf_conpassword.setBounds(148, 533, 149, 20);
		contentPane.add(pf_conpassword);
		
		JRadioButton rb_genral = new JRadioButton("Genral User");
		buttonGroup.add(rb_genral);
		rb_genral.setFont(new Font("Calibri", Font.PLAIN, 12));
		rb_genral.setBounds(20, 395, 96, 23);
		contentPane.add(rb_genral);
		
		JRadioButton rb_society = new JRadioButton("Scoiety User");
		buttonGroup.add(rb_society);
		rb_society.setFont(new Font("Calibri", Font.PLAIN, 12));
		rb_society.setBounds(158, 395, 96, 23);
		contentPane.add(rb_society);
		
		JButton bt_register = new JButton("REGISTRATION");
		bt_register.setFont(new Font("Calibri", Font.BOLD, 13));
		bt_register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pass = new String (pf_password.getPassword());
				String conpass = new String (pf_conpassword.getPassword());
				if (!pass.equals(conpass)){
					JOptionPane.showMessageDialog (bt_register, " Your Confirm password is wrong, please try again");
					return;
				}
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					
					Connection sqlcon = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers","root","Malitha@567");
					
					String query = "insert into users values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
					
					PreparedStatement insert =sqlcon.prepareStatement(query);
					
			//GENRAL DETAILS*
					String ValueTitle =cb_title.getSelectedItem().toString();
					insert.setString(1,ValueTitle);
					
					insert.setString(2,tf_name.getText());
					insert.setString(3,tf_sname.getText());
					insert.setString(4,tf_add1.getText());
					insert.setString(5,tf_add2.getText());
					insert.setString(6,tf_city.getText());
					
					String ValueContry =cb_contry.getSelectedItem().toString();
					insert.setString(7,ValueContry);
					
					String ValueState =cb_state.getSelectedItem().toString();
					insert.setString(8,ValueState);
					
					insert.setString(9,tf_nation.getText());
					insert.setInt(10,Integer.parseInt(tf_pin.getText()));
					insert.setString(11,tf_email.getText());
					insert.setString(12,tf_pno.getText());
					insert.setString(13,tf_mno.getText());
					
			//CHOOSE YOUR QUESTION AND ANSWER*
					String ValueQuestion =cb_question.getSelectedItem().toString();
					insert.setString(14,ValueQuestion);
					
					insert.setString(15,tf_answer.getText());
					
			//CHOOSE YOUR USER TYPE*
					if (rb_genral.isSelected())
						insert.setString(16,rb_genral.getText());
					else
						insert.setString(16,rb_society.getText());
					
			//CHOOSE YOURSER AND ID*
					insert.setString(17,tf_uname.getText());
					insert.setString(18,pf_password.getText());
					insert.setString(19,pf_conpassword.getText());
					
					int i =insert.executeUpdate();
					JOptionPane.showMessageDialog (bt_register, "Your Registration is Successful, Thank You For Join With Us!"); 
					
					insert.close();
					sqlcon.close();

				} catch (Exception e2) {
					{e2.printStackTrace();}
				}				
			}
		});
		bt_register.setBounds(285, 580, 118, 42);
		contentPane.add(bt_register);
		
		JButton btnNewButton = new JButton("RE-SET");
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		//GENRAL DETAILS*
				cb_title.setSelectedIndex(0);
				tf_name.setText("");
				tf_sname.setText("");
				tf_add1.setText("");
				tf_add2.setText("");
				tf_city.setText("");
				cb_contry.setSelectedIndex(0);
				cb_state.setSelectedIndex(0);
				tf_nation.setText("");
				tf_pin.setText("");
				tf_email.setText("");
				tf_pno.setText("");
				tf_mno.setText("");
				
		//CHOOSE YOUR QUESTION AND ANSWER*	
				cb_question.setSelectedIndex(0);		
				tf_answer.setText("");
				
		//CHOOSE YOUR USER TYPE*
				rb_genral.setSelectedIcon(null);
				rb_society.setSelectedIcon(null);;
			
		//CHOOSE YOURSER AND ID
				tf_uname.setText("");
				pf_password.setText("");
				pf_conpassword.setText("");
			}
		});
		btnNewButton.setBounds(428, 578, 118, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("");
		lblNewLabel_3_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\question-mark-310100_1280m.jpg"));
		lblNewLabel_3_1_1_1_1.setBounds(307, 469, 28, 22);
		contentPane.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_3 = new JLabel("");
		lblNewLabel_3_1_1_1_3.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\question-mark-310100_1280m.jpg"));
		lblNewLabel_3_1_1_1_3.setBounds(307, 499, 28, 25);
		contentPane.add(lblNewLabel_3_1_1_1_3);
		
		JLabel lblNewLabel_3_1_1_1_2 = new JLabel("");
		lblNewLabel_3_1_1_1_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\question-mark-310100_1280m.jpg"));
		lblNewLabel_3_1_1_1_2.setBounds(307, 533, 28, 25);
		contentPane.add(lblNewLabel_3_1_1_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("E:\\Programming\\Eclipse\\Final_Project_MIT_22053_JCT\\sdssd.jpg"));
		lblNewLabel_4.setForeground(Color.BLUE);
		lblNewLabel_4.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_4.setBounds(682, 11, 233, 14);
		contentPane.add(lblNewLabel_4);
	}
}
