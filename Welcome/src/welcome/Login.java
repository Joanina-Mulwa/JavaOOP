package welcome;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Password");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(21, 130, 144, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Identity Number(ID)");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(21, 63, 169, 33);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(200, 65, 228, 33);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Identity_Number = textField_1.getText();
				String Password = passwordField.getText();
				try {					
					
					Class.forName("com.mysql.cj.jdbc.Driver"); 
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System","root","Kheriac");
					Statement stat = con.createStatement();
					String sql ="select * from logins where Identity_Number='"+Identity_Number+"' and Password='"+Password+"'";
					//pst.setString(1, Identity_Number);
					//pst.setString(2, Password);
					System.out.println(sql);
					ResultSet rs = stat.executeQuery(sql);
					System.out.println(rs.next());
					if(rs.next()==true)
					{
						dispose();
						JOptionPane.showMessageDialog(null, "Login successfull.WELCOME!.");
						Description  obj = new Description();
						obj.setVisible(true);
						obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
					}
					else 
					{
						JOptionPane.showMessageDialog(null, "<html>Access denied. <br />Please input and save details to create account.</html>");
						dispose();
						
						
						Welcome window = new Welcome();
						window.frmHomePage.setVisible(true);
						
					}
					
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image img4 = new ImageIcon(this.getClass().getResource("/symbol-check-icon.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img4));
		btnNewButton.setBounds(86, 199, 159, 40);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(200, 128, 228, 33);
		contentPane.add(passwordField);
	}
}
