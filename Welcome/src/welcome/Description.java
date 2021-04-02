package welcome;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;

public class Description extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Description frame = new Description();
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
	public Description() {
		setForeground(Color.GREEN);
		setFont(new Font("Segoe Script", Font.BOLD, 20));
		setBackground(Color.LIGHT_GRAY);
		setTitle("DESCRIPTION OF THE TWO TYPES.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1214, 812);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Apartments");
		mnNewMenu.setForeground(Color.BLUE);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("One Bedroom");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					OneBedroom obj = new OneBedroom();
					obj.setVisible(true);
					
					
					
					
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Two Bedroom");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					TwoBedroom obj = new TwoBedroom();
					obj.setVisible(true);
				}
				catch(Exception e1){
					System.out.println(e1);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Three Bedroom");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					ThreeBedroom obj = new ThreeBedroom();
					obj.setVisible(true);
					
				}
				catch(Exception e1){
					System.out.println(e1);
				}
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Four Bedroom");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					FourBedroom obj = new FourBedroom();
					obj.setVisible(true);
				}
				catch(Exception e1){
					System.out.println(e1);
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_1 = new JMenu("Assisted Living");
		mnNewMenu_1.setForeground(Color.MAGENTA);
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Individual Rooms");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					IndividualRooms obj = new IndividualRooms();
					obj.setVisible(true);
				}
				catch(Exception e1){
					System.out.println(e1);
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Shared Quarters");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					SharedQuarters obj = new SharedQuarters();
					obj.setVisible(true);
				}
				catch(Exception e1){
					System.out.println(e1);
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Apartment Style");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					ApartmentStyle obj = new ApartmentStyle();
					obj.setVisible(true);
				}
				catch(Exception e1){
					System.out.println(e1);
				}
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_7);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APARTMENTS.");
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(10, 0, 145, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ASSISTED LIVING.");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 277, 145, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("<html>=>An apartment (American English), or flat (British English, Indian English), is a self-contained housing unit (a type of residential real estate) that occupies only part of a building, generally on a single storey. <br />-There are many names for these overall buildings.<br /> <br />\r\n=>An apartment (US English) or flat (British English) is a place to live that is only part of a larger building. <br />-Usually it is a group of rooms on one floor of a highrise building in a city, where land is too expensive for people to have separate houses. <br /><br />\r\n=>An apartment that people own is called a condominium or \"condo\". <br />-A proper apartment has an owner called a landlord who charges money (\"rent money\" or \"rent\") from the people who live there (\"tenants\"). <br /> <br />\r\n=>An apartment is a rented residential unit that is part of one (or several) residential buildings. There is typically one owner or management company for all the units who does all the maintenance and upkeep.\r\n</html>");
		lblNewLabel_2.setBackground(new Color(0, 255, 255));
		lblNewLabel_2.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 11, 743, 268);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<html>\r\n=>Assisted living is a type of housing designed for people who need various levels of medical and personal care.<br />- Living spaces can be individual rooms, apartments, or shared quarters. The facilities generally provide a home-like setting and are physically designed to promote the resident's independence. <br />-Services are offered to assist residents with daily living.<br /><br />\r\nThe services offered by assisted living communities vary from facility to facility. Services often include:\r\n    .One to three meals a day.<br><br />\r\n    .Monitoring of medication.<br /><br />\r\n    .Personal care, including dressing and bathing.<br /><br />\r\n    .Housekeeping and laundry.<br /><br />\r\n    .24-hour emergency care.<br /><br />\r\n    .Some medical services.<br /><br />\r\n    .Social and recreational activities.<br /><br />\r\n</html>");
		lblNewLabel_3.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(20, 283, 743, 381);
		contentPane.add(lblNewLabel_3);
		
		JButton button = new JButton("Click to load and view categories of Apartments.");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System","root","Kheriac");
					String sql = "Select * from Apartment_Types";
					PreparedStatement pst = con.prepareStatement(sql);
					
					ResultSet rs = pst.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
					
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
			}
		});
		button.setBounds(778, 23, 333, 23);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(778, 57, 277, 160);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBackground(Color.BLACK);
		separator.setBounds(766, 0, 2, 722);
		contentPane.add(separator);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(791, 350, 277, 160);
		contentPane.add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		JButton btnClickToLoad = new JButton("Click to load and view categories of Assisted Living Facilities.");
		btnClickToLoad.addActionListener(new ActionListener() {
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
		btnClickToLoad.setBounds(791, 316, 391, 23);
		contentPane.add(btnClickToLoad);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 277, 1227, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("Back");
		Image img = new ImageIcon(this.getClass().getResource("/arrow-back-icon.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					dispose();
					Welcome window = new Welcome();
					window.frmHomePage.setVisible(true);
					
				
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
				
			}
		});
		btnNewButton.setBounds(10, 635, 145, 54);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("<html>NB: To go to the specific category;<br /> click the category from the menu on the menu bar.</html>");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(769, 584, 413, 54);
		contentPane.add(lblNewLabel_5);
	}

	

	
}
