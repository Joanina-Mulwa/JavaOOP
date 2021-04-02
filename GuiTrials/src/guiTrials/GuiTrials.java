package guiTrials;

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

import net.proteanit.sql.DbUtils;

import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;

public class GuiTrials {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel;
	
	private JComboBox comboBox;
	private String gender;
	
	JPasswordField passwordField;
	JTextField textField_1;
	JTextField textField_2;
	JTextField textField_20;
	JLabel lblNewLabel_1 ;
	JLabel lblNewLabel_2;
	private JTextField textField_3;
	/*public static javax.swing.JTextField textField_1;
	public static javax.swing.JTextField textField_2;
	public static javax.swing.JTextField textField_20;
	public static javax.swing.JPasswordField passwordField;*/
	
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
					GuiTrials window = new GuiTrials();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void fillComboBox() {
		
		try {
			
			
				for(int i=1;i<=50;i++)
				{
				comboBox.addItem(new Integer(i));
				}
			//}
			
		}
		catch(Exception e1) {
			System.out.println("Error"+e1.getMessage());
			
		}
		
	}

	/**
	 * Create the application.
	 */
	public GuiTrials() {
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
							HomePage obj = new HomePage();
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
				System.out.println(sql);
						ResultSet rs = pst.executeQuery();
				System.out.println(rs.next());
						if(rs.next()==true)
						{
							JOptionPane.showMessageDialog(null, "Already registered. Please login");
							frame.dispose();
							HomePage obj = new HomePage();
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
						    HomePage obj = new HomePage();
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
				/*HomePage objt = new HomePage();
				HomePage.textField_11.setText(GuiTrials.textField_1.getText());
				//HomePage.textField_12.setText(GuiTrials.textField_20.getText());
				HomePage.lblNewLabel.setText(GuiTrials.textField_20.getText());
				objt.setVisible(true);*/
				
			}
			catch(Exception e1) {
				System.out.print("Error"+e1.getMessage());
			}
			
			}
		});
		btnNewButton_4.setBounds(402, 245, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		textField_20 = new JTextField();
		textField_20.setBounds(394, 24, 86, 20);
		frame.getContentPane().add(textField_20);
		textField_20.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(383, 170, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(250, 113, 82, 38);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_5 = new JButton("show");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String Room_Number= (String)comboBox.getSelectedItem();
				String Room_Number = comboBox.getSelectedItem().toString();
				try 
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement stat = conn.createStatement();
					String select = "select * from bookings where Room_Number='"+Room_Number+"'";
				//System.out.println(select);
					ResultSet rs= stat.executeQuery(select);
				//System.out.println(rs.next());
				//System.out.println(comboBox.getSelectedItem().toString());
				if(rs.next()) 
					{
					JOptionPane.showMessageDialog(null, "OOPS! Room already booked. Please choose another room.");
					frame.dispose();
					HomePage lg = new HomePage();
					lg.setVisible(true);
						
					}
				else					
				{	
						lblNewLabel.setText(comboBox.getSelectedItem().toString());
						JOptionPane.showMessageDialog(null, "You have Booked");
						frame.dispose();
						HomePage lg1 = new HomePage();
						lg1.setVisible(true);
										
					}
				    
				}
				catch(Exception e1) 
				{
					System.out.println("Error: "+e1.getMessage());
				}
				
			}
		});
		btnNewButton_5.setBounds(250, 56, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(250, 219, 118, 38);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("1000");
		lblNewLabel_1.setBounds(57, 292, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(47, 327, 144, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("New button");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				
			    String text=textField_3.getText().toString();
			    lblNewLabel_2.setText(text);
			    
				}
				catch(Exception e1)
				{
					System.out.println("Error: "+e1.getMessage());
				}
			}
		});
		btnNewButton_6.setBounds(319, 329, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JLabel label = new JLabel("New label");
		label.setBounds(177, 199, 144, 14);
		frame.getContentPane().add(label);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(194, 292, 138, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton_7 = new JButton("check");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					String check =lblNewLabel_2.getText().toString();
				    System.out.println(check);
				   if(check == "1000")
				   {
					   System.out.println("you have fully paid");
					   
				   }
				   else
				   {
					   System.out.println("pay first)");
				   }
					
				}
				catch(Exception e1) {
					System.out.println("Error:"+e1.getMessage());
					
				}
			}
		});
		btnNewButton_7.setBounds(423, 326, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		fillComboBox();
	}
}


