package welcome;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.SwingConstants;

import com.sun.net.httpserver.Authenticator.Result;




import javax.swing.JRadioButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import java.awt.image.*;
import java.util.*;
import java.util.Date;

public class Welcome {
	

	public JFrame frmHomePage;
	
	
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_14;
	
	JTextField textField;
	JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	JPasswordField passwordField;
	
	public String gender;	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frmHomePage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void clock() {
		
	Thread clock = new Thread() {
		
		public void run() {
			try {
				while(true) {
				Calendar  cal = new GregorianCalendar();
				int second = cal.get(Calendar.SECOND);
				int minute = cal.get(Calendar.MINUTE);
				int hour= cal.get(Calendar.HOUR);
				
				lblNewLabel_9.setText("Time: "+hour+":"+minute+":"+second);

				sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
		}
		
	};
	
	clock.start();
	
	}
	
	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
		 clock();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHomePage = new JFrame();
		frmHomePage.setTitle("WELCOME PAGE");
		frmHomePage.getContentPane().setBackground(Color.CYAN);
		frmHomePage.setBounds(0, -11, 752, 751);
		frmHomePage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHomePage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO THE ASSISTED LIVING AND APARTMENT SEARCH!.");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(100, 43, 555, 27);
		frmHomePage.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Full Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(11, 166, 81, 14);
		frmHomePage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone Number:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 297, 111, 14);
		frmHomePage.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ID No:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(11, 361, 81, 14);
		frmHomePage.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image img3 = new ImageIcon(this.getClass().getResource("/close-icon.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img3));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					JOptionPane.showMessageDialog(null, "Thank you for using the Assisted Living and Apartment search!");
				    frmHomePage.dispose();
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
				
			}
		});
		btnNewButton_1.setBounds(11, 642, 145, 59);
		frmHomePage.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(112, 159, 284, 32);
		frmHomePage.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 228, 284, 32);
		frmHomePage.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(112, 290, 284, 32);
		frmHomePage.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Other Names:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(11, 233, 100, 19);
		frmHomePage.getContentPane().add(lblNewLabel_4);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(28, 503, 708, 2);
		frmHomePage.getContentPane().add(separator);
		
		JLabel lblNewLabel_6 = new JLabel("Save Your Details to create account.");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_6.setBounds(199, 538, 256, 14);
		frmHomePage.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_5 = new JLabel("Password");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(11, 412, 100, 19);
		frmHomePage.getContentPane().add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(112, 354, 284, 32);
		frmHomePage.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image img4 = new ImageIcon(this.getClass().getResource("/Save-icon.png")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(img4));
		btnNewButton_2.addActionListener(new ActionListener() {
			//private String Gender;;

			public void actionPerformed(ActionEvent e) {
				/*Booking objt = new Booking();

				String inputText =textField.getText();
				objt.label.setText(inputText);
				
				String inputText1 =textField_1.getText();
				objt.label_1.setText(inputText1);
				
				String inputText2 =textField_2.getText();
				objt.label_2.setText(inputText2);
				
				String inputText3 =textField_3.getText();
				objt.label_3.setText(inputText3);
				
				String inputText4 =passwordField.getText();
				objt.label_4.setText(inputText4);
				
				String inputText5 =gender;
				objt.label_5.setText(inputText5);
				
				objt.setVisible(false);
				frmHomePage.dispose();	*/			
			
				try { 
					String Full_Name = textField.getText();
					String Other_Names = textField_1.getText();
					String Phone_Number = textField_2.getText();
					String Identity_Number = textField_3.getText();
					String Password = passwordField.getText();
					String Gender = gender;
				
					Class.forName("com.mysql.cj.jdbc.Driver"); 
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System","root","Kheriac");
					String select="select * from login_details where Identity_Number=?";
					PreparedStatement pst = con.prepareStatement(select);		
					pst.setString(1, Identity_Number);
				System.out.println(select);
					ResultSet rs = pst.executeQuery();
				System.out.println(rs.next());
					if(rs.next()==true)
					{
						JOptionPane.showMessageDialog(null, "Already registered. Please login");
						frmHomePage.dispose();
						
						Login obj = new Login();
						obj.setVisible(true);
						
					}
					else 
					{
						Class.forName("com.mysql.cj.jdbc.Driver"); 
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System","root","Kheriac");
						String sql="insert into logins  (Full_Name,Other_Names,Phone_Number,Identity_Number,Password,Gender) values (?,?,?,?,?,?)";
						PreparedStatement pst1 = conn.prepareStatement(sql);
						pst1.setString(1, Full_Name);
						pst1.setString(2, Other_Names);
						pst1.setString(3, Phone_Number);
						pst1.setString(4, Identity_Number);
						pst1.setString(5, Password);
						pst1.setString(6, Gender);
						pst1.execute();
						
						JOptionPane.showMessageDialog(null, "Your personal details have been saved.");	
						
						frmHomePage.dispose();
						Description obj = new Description();
						obj.setVisible(true);
						obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
						
						
					}
					
					
			
				}
				catch(Exception e1){
					System.out.println("ERROR:"+e1.getMessage());
				}
			}
		});
		btnNewButton_2.setBounds(448, 516, 123, 59);
		frmHomePage.getContentPane().add(btnNewButton_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(112, 408, 284, 31);
		frmHomePage.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_7 = new JLabel("Gender");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(11, 471, 100, 14);
		frmHomePage.getContentPane().add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender="Male";
			}
		});
		rdbtnNewRadioButton.setBounds(112, 464, 109, 32);
		frmHomePage.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender="female";
			}
		});
		rdbtnNewRadioButton_1.setBounds(285, 464, 109, 32);
		frmHomePage.getContentPane().add(rdbtnNewRadioButton_1);
	
	ButtonGroup btnGrp = new ButtonGroup();
	btnGrp.add(rdbtnNewRadioButton);
	btnGrp.add(rdbtnNewRadioButton_1);
	
	JLabel label = new JLabel("");
	Image img1 = new ImageIcon(this.getClass().getResource("/Household-Booking-icon.png")).getImage();
	label.setIcon(new ImageIcon(img1));
	label.setBounds(0, 0, 100, 121);
	frmHomePage.getContentPane().add(label);
	
	JLabel lblNewLabel_8 = new JLabel(" ");
	Image img2 = new ImageIcon(this.getClass().getResource("/Household-Apartment-icon.png")).getImage();
	lblNewLabel_8.setIcon(new ImageIcon(img2));
	lblNewLabel_8.setBounds(636, 0, 100, 111);
	frmHomePage.getContentPane().add(lblNewLabel_8);
	
	lblNewLabel_9 = new JLabel("Time:");
	lblNewLabel_9.setForeground(Color.BLUE);
	lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
	lblNewLabel_9.setBounds(410, 98, 123, 44);
	frmHomePage.getContentPane().add(lblNewLabel_9);
	
	JLabel lblNewLabel_10 = new JLabel("Create account:");
	lblNewLabel_10.setForeground(Color.GRAY);
	lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblNewLabel_10.setBounds(76, 128, 160, 14);
	frmHomePage.getContentPane().add(lblNewLabel_10);
	
	JLabel lblNewLabel_11 = new JLabel("Already having an account?");
	lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
	lblNewLabel_11.setBounds(199, 637, 228, 27);
	frmHomePage.getContentPane().add(lblNewLabel_11);
	
	JButton btnNewButton_3 = new JButton("Login");
	btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				frmHomePage.dispose();
				Login obj = new Login();
				obj.setVisible(true);
				
			}
			catch(Exception e1) {
				System.out.println(e1);
			}
			
		}
	});
	btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
	Image img12 = new ImageIcon(this.getClass().getResource("/Login-Old_Bigger-icon.png")).getImage();
	btnNewButton_3.setIcon(new ImageIcon(img12));
	btnNewButton_3.setBounds(448, 599, 203, 102);
	frmHomePage.getContentPane().add(btnNewButton_3);
	
	JLabel lblNewLabel_12 = new JLabel("");
	lblNewLabel_12.setBounds(239, 58, 135, 102);
	Image img13 = new ImageIcon(this.getClass().getResource("/Login-Registration-New-icon.png")).getImage();
	lblNewLabel_12.setIcon(new ImageIcon(img13));
	frmHomePage.getContentPane().add(lblNewLabel_12);
	
	JLabel lblNewLabel_13 = new JLabel("Date:");
	lblNewLabel_13.setForeground(Color.BLUE);
	lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 15));
	lblNewLabel_13.setBounds(541, 98, 46, 44);
	frmHomePage.getContentPane().add(lblNewLabel_13);
	
	lblNewLabel_14 = new JLabel("New label");
	lblNewLabel_14.setBounds(597, 110, 100, 19);
	frmHomePage.getContentPane().add(lblNewLabel_14);
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date newDate = new Date();
	System.out.println(dateFormat.format(newDate));
	lblNewLabel_14.setText(dateFormat.format(newDate));
	
	JLabel lblNewLabel_15 = new JLabel("A.A.S");
	lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 20));
	lblNewLabel_15.setBounds(285, 0, 111, 44);
	frmHomePage.getContentPane().add(lblNewLabel_15);
	
	}
}