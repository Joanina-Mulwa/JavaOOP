package apartment_Assisted_Living;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

//import net.proteanit.sql.DbUtils;

import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

public class Apartment_Assisted_Living {

	private JFrame frame;
	private JTextField textField;
	
	private String gender;
	
	public static javax.swing.JTextField textField_1;
	public static javax.swing.JTextField textField_2;
	public static javax.swing.JTextField textField_20;
	public static javax.swing.JPasswordField passwordField;
	
	/*public static javax.swing.JLabel label;
	public static javax.swing.JLabel label_1;
	public static javax.swing.JLabel label_2;
	public static javax.swing.JLabel label_3;
	public static javax.swing.JLabel label_5;*/
	
	/*public static javax.swing.JTextField textField;
	public static javax.swing.JTextField textField_1;
	public static javax.swing.JTextField textField_2;
	public static javax.swing.JTextField textField_3;
	public static String gender;*/
	
	/*Booking jt = new Booking();
	Booking.label.setText(Welcome.textField.getText());
	Booking.label_1.setText(Welcome.textField_1.getText());
	Booking.label_2.setText(Welcome.textField_2.getText());
	Booking.label_3.setText(Welcome.textField_3.getText());
	Booking.label_5.setText(Welcome.gender);
	jt.setVisible(true);*/


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apartment_Assisted_Living window = new Apartment_Assisted_Living();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Apartment_Assisted_Living() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 737, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Login.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*try {
					Class.forName("com.mysql.jdbc.Driver"); 
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rentals","root","Joaninahjeeyjeey1");
					String query="select * from ApartmentTypes";
					PreparedStatement pst1 = conn.prepareStatement(query);
					ResultSet rs2 = pst1.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs2));
					
					
					String username = textField.getText();
					String password = String.valueOf(passwordField.getPassword());
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","Joaninahjeeyjeey1");
					String sql = "select * from tester where username=? AND password=?";
					PreparedStatement pst = con.prepareStatement(sql);
					pst.setString(1, username);
					pst.setString(2, password);
					ResultSet rs = pst.executeQuery();						
						if (rs.next())
						{
							JOptionPane.showMessageDialog(null,"login successful");
							Welcome_Menu obj = new Welcome_Menu();
							obj.setVisible(true);
							frame.dispose();
						}
						else
							{
								JOptionPane.showMessageDialog(null, "Login Unsuccessful. Try Again");
								
							}
				}
					catch(Exception e1) {
						
						System.out.println(e1);
					}
			*/
				}
		});
		btnNewButton.setBounds(24, 199, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabelUsername = new JLabel("Username");
		lblNewLabelUsername.setBounds(10, 27, 99, 14);
		frame.getContentPane().add(lblNewLabelUsername);
		
		JLabel lblNewLabel_1Password = new JLabel("Password");
		lblNewLabel_1Password.setBounds(10, 77, 89, 14);
		frame.getContentPane().add(lblNewLabel_1Password);
		
		textField = new JTextField();
		textField.setBounds(105, 24, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(109, 74, 82, 20);
		frame.getContentPane().add(passwordField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("male");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			gender="male";
				
			}
		});
		rdbtnNewRadioButton.setBounds(24, 143, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("female");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gender="female";
			}
		});
		rdbtnNewRadioButton_1.setBounds(24, 169, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_1 = new JButton("save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*try {
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","Joaninahjeeyjeey1");
				String sql="insert into choose (choice) values (?)";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, gender);
				
				pst.execute();
				
				JOptionPane.showMessageDialog(null, "Your personal details have been saved.");
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
				*/
			}
		});
		btnNewButton_1.setBounds(127, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//Class.forName("com.mysql.jdbc.Driver");
					//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","Joaninahjeeyjeey1");
					//String sql ="insert into tester values (?,?)";
					//PreparedStatement pst = con.prepareStatement(sql);
					
					//pst.setString(1, getRow);
					
					//pst.execute();
					
					//table_1.setModel(DbUtils.resultSetToTableModel((ResultSet) pst));
					
					
					//pst.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setBounds(10, 233, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("go");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					//String username = textField.getText();
					//String password = passwordField.getText();
					
					try { 
						String Identity_Number = textField.getText();
						String Password = passwordField.getText();
						Class.forName("com.mysql.cj.jdbc.Driver"); 
						Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System","root","Kheriac");
						String sql="select * from login_details where Identity_Number=? AND Password=?";
						PreparedStatement pst = con.prepareStatement(sql);
						pst.setString(1, Identity_Number);
						pst.setString(2, Password);						
				//System.out.println(sql);
						ResultSet rs = pst.executeQuery();
				//System.out.println(rs.next());
						if(rs.next()==true)
						{
							JOptionPane.showMessageDialog(null, "Already registered. Please login");
							frame.dispose();
							Welcome_Menu obj = new Welcome_Menu();
							obj.setVisible(true);
						}
						else
						{
							Class.forName("com.mysql.cj.jdbc.Driver"); 
							Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System","root","Kheriac");
							String insert="insert into login_details (Identity_Number,Password) values (?,?)";
							PreparedStatement pst1 = conn.prepareStatement(insert);
							pst1.setString(1, Identity_Number);
							pst1.setString(2, Password);
							pst1.execute();
							JOptionPane.showMessageDialog(null, "Your personal details have been saved.");	
							frame.dispose();
						    Welcome_Menu obj = new Welcome_Menu();
							obj.setVisible(true);
							obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
							
						}
						con.close();
				}
				catch(Exception e1) {
					System.out.print("Error:"+e1.getMessage());
				}
			}
		});
		btnNewButton_3.setBounds(57, 113, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(426, 114, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Transfer");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			try {
				Welcome_Menu objt = new Welcome_Menu();
				//Welcome_Menu.textField_11.setText(Apartment_Assisted_Living.textField_1.getText());
				//Welcome_Menu.textField_12.setText(Apartment_Assisted_Living.textField_20.getText());
				Welcome_Menu.lblNewLabel.setText(Apartment_Assisted_Living.textField_1.getText());
				objt.setVisible(true);
				
			}
			catch(Exception e1) {
				System.out.print("Error"+e1.getMessage());
			}
			
			}
		});
		btnNewButton_4.setBounds(402, 245, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		
	}
}



