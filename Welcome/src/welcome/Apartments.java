package welcome;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane; 
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class Apartments extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Apartments frame = new Apartments();
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
	public Apartments() {
		setTitle("CATEGORIES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 426);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NB: Click on each of the type on the menu bar to see the categories.");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel.setBounds(44, 233, 452, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome!");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(306, 11, 134, 14);
		contentPane.add(lblNewLabel_1);
		
	
	
		JButton btnNewButton = new JButton("Click to load and view categories of Apartments.");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver"); 
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System","root","Kheriac");
					String sql="select * from Apartment_Types";
					PreparedStatement pst = con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e1) {
					System.out.println(e1);
					
				}
			}
		});
		btnNewButton.setBounds(10, 36, 277, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Click to load view categories of Assisted Living.");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System","root","Kheriac");
					String sql = "Select * from Assisted_Living_Types";
					PreparedStatement pst = con.prepareStatement(sql);
					
					ResultSet rs = pst.executeQuery();
					
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		btnNewButton_1.setBounds(401, 36, 282, 23);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 277, 160);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(401, 70, 282, 160);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
			}
		));
		table_2.setBounds(306, 170, 51, -57);
		contentPane.add(table_2);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(331, 36, 2, 194);
		contentPane.add(separator);
		
		JButton btnNewButton_2 = new JButton("View each category");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					Description obj=new Description();
					obj.setVisible(true);
					obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
				}
				catch(Exception e1) {
					System.out.print(e1);
				}
			}
		});
		btnNewButton_2.setBounds(284, 306, 184, 23);
		contentPane.add(btnNewButton_2);
	}
}
