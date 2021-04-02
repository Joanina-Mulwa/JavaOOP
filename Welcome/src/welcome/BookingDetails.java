package welcome;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.Font;

public class BookingDetails extends JFrame {

	private JPanel contentPane;
	
	JTabbedPane tabbedPane;
	JTabbedPane tabbedPane_1;
	JTabbedPane tabbedPane_2;
	private JPanel panel_4;
	
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingDetails frame = new BookingDetails();
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
	public BookingDetails() {
		setTitle("Description");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 781, 658);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 765, 629);
		contentPane.add(tabbedPane_1);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.addTab("Apartments", null, tabbedPane, null);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("One Bedroom", null, panel, null);
		panel.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel_9.setBackground(Color.CYAN);
		panel_9.setBounds(0, 0, 766, 576);
		panel.add(panel_9);
		
		JButton button = new JButton("BOOK");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.setBackground(Color.BLUE);
		button.setBounds(497, 531, 169, 32);
		panel_9.add(button);
		
		JLabel label = new JLabel("About One Bedroom Apartment.");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBackground(Color.BLUE);
		label.setBounds(0, 0, 246, 32);
		panel_9.add(label);
		
		JButton button_1 = new JButton("Back");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setBounds(0, 527, 123, 41);
		panel_9.add(button_1);
		
		JLabel label_1 = new JLabel("<html>In general, the one bedroom apartment is expected to contain four basic components:<br /><br />\r\n=>A bedroom<br /><br />\r\n=>One living room<br /><br />\r\n=>A kitchen<br /><br />\r\n=>Atleast one bathroom<br /><br />\r\nOther features may vary from the owners and place of view.<br /><br />\r\nHowever, the Assisted Livng and Apartment search provides a one bedroom apartments with :<br /><br />\r\n=>One bedroom completely furnished <br /><br />\r\n=>One living room.<br /><br />\r\n=>A kitchen with kitchen equipments<br /><br />\r\n=> Each bedroom has a bed and closet.<br /><br />\r\n=>One bathroom.<br /><br />\r\n</html>");
		label_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		label_1.setBounds(10, 0, 532, 529);
		panel_9.add(label_1);
		
		JButton button_2 = new JButton("New button");
		button_2.setBounds(197, 538, 89, 23);
		panel_9.add(button_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Two Bedroom", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Three Bedroom", null, panel_2, null);
		
		panel_4 = new JPanel();
		tabbedPane.addTab("Four bedroom", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_5, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Assisted", null, panel_3, null);
		panel_3.setLayout(null);
		
		tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 882, 450);
		panel_3.add(tabbedPane_2);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("Individual Rooms", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_2.addTab("Shared Quarters", null, panel_7, null);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_2.addTab("Apartment tyle", null, panel_8, null);
	}
}
