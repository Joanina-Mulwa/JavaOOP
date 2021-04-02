package welcome;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import org.jdatepicker.impl.JDatePanelImpl;
//import org.jdatepicker.impl.JDatePickerImpl;
//import org.jdatepicker.impl.UtilDateModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JTabbedPane;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;

public class Booking extends JFrame {
	
    private JPanel contentPane;

	JTabbedPane tabbedPane;
	JTabbedPane tabbedPane_1;
	JTabbedPane tabbedPane_2;
	
	private JComboBox<Integer> comboBox;
	private JComboBox<Integer> comboBox_1;
	private JComboBox<Integer> comboBox_2;
	private JComboBox<Integer> comboBox_3;
	private JComboBox<Integer> comboBox_4;
	private JComboBox<Integer> comboBox_5;
	private JComboBox<Integer> comboBox_6;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_32;
	private JLabel lblNewLabel_30;
	private JLabel lblNewLabel_34;
	private JLabel lblNewLabel_36;
	private JLabel lblNewLabel_38;
	private JLabel lblNewLabel_40;
	private JDateChooser dateChooser;
	private JDateChooser dateChooser_1;
	private JDateChooser dateChooser_2;
	private JDateChooser dateChooser_3;
	private JDateChooser dateChooser_4;
	private JDateChooser dateChooser_5;
	private JDateChooser dateChooser_6;
	private JDateChooser dateChooser_7;
	private JDateChooser dateChooser_8;
	private JDateChooser dateChooser_9;
	private JDateChooser dateChooser_10;
	private JDateChooser dateChooser_11;
	private JDateChooser dateChooser_12;
	private JDateChooser dateChooser_13;
	
	
	JLabel label;
	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	JLabel label_4;
	JLabel lblNewLabel_4;
	JLabel lblNewLabel_3;
	JLabel lblNewLabel_5;
	JLabel lblNewLabel_6;
	JLabel lblNewLabel_11;
	JLabel lblNewLabel_12;
	JLabel label_17;
	JLabel label_19;
	JLabel label_21;
	JLabel label_23;
	JLabel label_25;
	JLabel label_27;
	JLabel lblApartment_3;
	JLabel Nlabel_30;
	JLabel label_33;
	JLabel label_35;
	JLabel label_37;
	JLabel label_44;
	JLabel label_46;
	JLabel label_48;
	JLabel label_50;
	JLabel label_52;
	JLabel label_54;
	JLabel Nlabel_57;
	JLabel label_60;
	JLabel label_62;
	JLabel label_64;
	JLabel label_71;
	JLabel label_73;
	JLabel label_75;
	JLabel label_77;
	JLabel label_79;
	JLabel label_81;
	JLabel lblApartment_5;
	JLabel lbl85;
	JLabel label_87;
	JLabel label_89;
	JLabel label_91;
	JLabel label_96;
	JLabel label_98;
	JLabel label_100;
	JLabel label_102;
	JLabel label_104;
	JLabel label_106;
	JLabel lblApartment;
	JLabel lblIndividualRooms;
	JLabel lblSharedQuarters;
	JLabel lblApartmentStyle;
	JLabel label_112;
	JLabel label_114;
	JLabel label_116;
	JLabel label_123;
	JLabel label_125;
	JLabel label_127;
	JLabel label_129;
	JLabel label_131;
	JLabel label_133;
	JLabel lblApartment_1;
	JLabel label_139;
	JLabel label_141;
	JLabel label_143;
	JLabel label_150;
	JLabel label_152;
	JLabel label_154;
	JLabel label_156;
	JLabel label_158;
	JLabel label_160;
	JLabel lblApartment_2;
	JLabel label_166;
	JLabel label_168;
	JLabel label_170;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	private JTextField textField_2;
	private JPasswordField passwordField_2;
	private JTextField textField_3;
	private JPasswordField passwordField_3;
	private JTextField textField_4;
	private JPasswordField passwordField_4;
	private JTextField textField_5;
	private JPasswordField passwordField_5;
	private JTextField textField_6;
	private JPasswordField passwordField_6;
	
	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking frame = new Booking();
					frame.setVisible(true);
					//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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
			comboBox_1.addItem(new Integer(i));
			comboBox_2.addItem(new Integer(i));
			comboBox_3.addItem(new Integer(i));
			comboBox_4.addItem(new Integer(i));
			comboBox_5.addItem(new Integer(i));
			comboBox_6.addItem(new Integer(i));
			}
		
		
	}
	catch(Exception e1) {
		System.out.println("Error"+e1.getMessage());
		
	}
	
}

/*public void fillComboBox_1() {
	
	try {
			for(int i=1;i<=50;i++)
			{
			comboBox_1.addItem(new Integer(i));
			comboBox_2.addItem(new Integer(i));
			}
		
		
	}
	catch(Exception e1) {
		System.out.println("Error"+e1.getMessage());
		
	}
	
}
public void fillComboBox_2() {
	
	try {
			for(int i=1;i<=50;i++)
			{
			comboBox_2.addItem(new Integer(i));
			}
		
		
	}
	catch(Exception e1) {
		System.out.println("Error"+e1.getMessage());
		
	}
	
}
public void fillComboBox_3() {
	
	try {
			for(int i=1;i<=50;i++)
			{
			comboBox_3.addItem(new Integer(i));
			}
		
		
	}
	catch(Exception e1) {
		System.out.println("Error"+e1.getMessage());
		
	}
	
}
public void fillComboBox_4() {
	
	try {
			for(int i=1;i<=50;i++)
			{
			comboBox_4.addItem(new Integer(i));
			}
		
		
	}
	catch(Exception e1) {
		System.out.println("Error"+e1.getMessage());
		
	}
	
}
public void fillComboBox_5() {
	
	try {
			for(int i=1;i<=50;i++)
			{
			comboBox_5.addItem(new Integer(i));
			}
		
		
	}
	catch(Exception e1) {
		System.out.println("Error"+e1.getMessage());
		
	}
	
}
public void fillComboBox_6() {
	
	try {
			for(int i=1;i<=50;i++)
			{
			comboBox_6.addItem(new Integer(i));
			}
		
		
	}
	catch(Exception e1) {
		System.out.println("Error"+e1.getMessage());
		
	}
	
}
*/


public void clock() {
	
Thread clock = new Thread() {
	
	public void run() {
		try {
			while(true) {
			Calendar  cal = new GregorianCalendar();
			int second = cal.get(Calendar.SECOND);
			int minute = cal.get(Calendar.MINUTE);
			int hour= cal.get(Calendar.HOUR);
			
			lblNewLabel_14.setText("Time: "+hour+":"+minute+":"+second);
			lblNewLabel_18.setText("Time: "+hour+":"+minute+":"+second);
			lblNewLabel_21.setText("Time: "+hour+":"+minute+":"+second);
			lblNewLabel_27.setText("Time: "+hour+":"+minute+":"+second);
			lblNewLabel_30.setText("Time: "+hour+":"+minute+":"+second);
			lblNewLabel_34.setText("Time: "+hour+":"+minute+":"+second);
			lblNewLabel_38.setText("Time: "+hour+":"+minute+":"+second);

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

public void Remove_Details() 
{
	
		try {
			
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement state = conn.createStatement();
					String del = "delete from bookings where End_Date=CURDATE()";
					state.executeUpdate(del);
		
			
		   } 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
	
}



	/**
	 * Create the frame.
	 */
	public Booking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 902, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
		

		
		
		tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 886, 537);
		contentPane.add(tabbedPane_1);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.addTab("Apartments", null, tabbedPane, null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		tabbedPane.addTab("One Bedroom", null, panel, null);
		panel.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBox.setBounds(135, 30, 73, 50);
		panel.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Room Number.");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 30, 115, 50);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Arrival Date");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 118, 115, 31);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Departure Date");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 174, 115, 31);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(427, 242, 312, 36);
		panel.add(lblNewLabel_4);
		
		label_3 = new JLabel("New label");
		label_3.setBounds(427, 170, 286, 43);
		panel.add(label_3);
		
		label = new JLabel("New label");
		label.setBounds(427, 76, 219, 23);
		panel.add(label);
		
		label_1 = new JLabel("New label");
		label_1.setBounds(426, 107, 235, 27);
		panel.add(label_1);
		
		label_2 = new JLabel("New label");
		label_2.setBounds(427, 145, 202, 31);
		panel.add(label_2);
		
		label_4 = new JLabel("New label");
		label_4.setBounds(427, 216, 137, 31);
		panel.add(label_4);
		
		JButton btnNewButton_9 = new JButton("Back");
		btnNewButton_9.setBackground(Color.CYAN);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image imga = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btnNewButton_9.setIcon(new ImageIcon(imga));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				OneBedroom obj = new OneBedroom();
				obj.setVisible(true);
			}
		});
		btnNewButton_9.setBounds(10, 427, 137, 43);
		panel.add(btnNewButton_9);
		
		lblNewLabel_3 = new JLabel("Apartment");
		lblNewLabel_3.setBounds(427, 269, 111, 31);
		panel.add(lblNewLabel_3);
		
		JLabel label_6 = new JLabel("Full Name:");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_6.setBounds(285, 76, 81, 19);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Other Names:");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_7.setBounds(285, 112, 100, 19);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("Phone Number:");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_8.setBounds(285, 151, 111, 14);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("ID No:");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_9.setBounds(285, 182, 81, 14);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("Password");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_10.setBounds(285, 220, 100, 19);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Gender");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_11.setBounds(285, 247, 100, 23);
		panel.add(label_11);
		
		textField = new JTextField();
		textField.setBounds(134, 228, 141, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(135, 274, 140, 20);
		panel.add(passwordField);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCategory.setBounds(285, 271, 100, 23);
		panel.add(lblCategory);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblType.setBounds(285, 305, 100, 23);
		panel.add(lblType);
		
		JLabel lblRoomNumber = new JLabel("Room Number");
		lblRoomNumber.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRoomNumber.setBounds(285, 339, 111, 14);
		panel.add(lblRoomNumber);
		
		lblNewLabel_5 = new JLabel("One Bedroom");
		lblNewLabel_5.setBounds(427, 301, 123, 35);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setBounds(427, 341, 83, 14);
		panel.add(lblNewLabel_6);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(135, 113, 140, 36);
		panel.add(dateChooser);
		dateChooser .setDateFormatString("yyyy-MM-dd");
		
		dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(135, 174, 140, 31);
		panel.add(dateChooser_1);
		dateChooser_1.setDateFormatString("yyyy-MM-dd");
		
		JButton btnNewButton_16 = new JButton("Show Your Booking Details.");
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String selet ="select One_Bedroom from apartments where Description='Vacancy_Count' AND One_Bedroom >=1";
					PreparedStatement pst = cnn.prepareStatement(selet);
					ResultSet rs1 = pst.executeQuery();
					if(rs1.next()==true)
					{
						
					
					
					String Identity_Number = textField.getText();
					String Password=passwordField.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String sql = "select * from logins where Identity_Number='"+Identity_Number+"' AND Password='"+Password+"'";
					
					Statement stat = con.createStatement();
					
					ResultSet rs = stat.executeQuery(sql);
					if(rs.next()==true)
					{
						
						//System.out.println("Found");
						DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
						int Room_Number =  (int) comboBox.getSelectedItem();
						String Name = lblNewLabel_5.getText();
						//String Start_Dates = lblNewLabel_11.getText();
						String Start = df1.format(dateChooser.getDate());
						String End = df1.format(dateChooser_1.getDate());
						//String End_Dates = lblNewLabel_12.getText();
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
						String select ="select * from bookings where Room_Number='"+Room_Number+"' AND Type='"+Name+"' AND Start_Date>='"+Start+"' AND End_Date<='"+End+"'";
						Statement state = conn.createStatement();
						System.out.println(select);
						ResultSet rss =state.executeQuery(select);
						if(rss.next()==true) 
						{
						
							
							
							JOptionPane.showMessageDialog(null, "Oops room booked");
							
						}
						else 
						{
							
							DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
							System.out.println("You have booked room Number "+Room_Number);
							label.setText(rs.getString("Full_Name"));
							label_1.setText(rs.getString("Other_Names"));
							label_2.setText(rs.getString("Phone_Number"));
							label_3.setText(rs.getString("Identity_Number"));
							label_4.setText(rs.getString("Password"));
							lblNewLabel_4.setText(rs.getString("Gender"));
							lblNewLabel_6.setText(comboBox.getSelectedItem().toString());
							lblNewLabel_11.setText(df.format(dateChooser.getDate()));
							lblNewLabel_12.setText(df.format(dateChooser_1.getDate()));
							
							
							
							
						}
					}
					else 
					{
						
						JOptionPane.showMessageDialog(null, "Inorrect Identity Number and Password");
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "<html>OOPs no vacant One_Bedroom Apartment Rooms<br />Please choose anothertype</html>");
						Description obj = new Description();
						obj.setVisible(true);
						
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_16.setBounds(261, 11, 249, 23);
		panel.add(btnNewButton_16);
		
		JLabel lblNewLabel_7 = new JLabel("ID NO");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_7.setBounds(10, 231, 73, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Password");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.setBounds(10, 277, 115, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Start Date");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(285, 374, 81, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("End Date");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(285, 410, 81, 14);
		panel.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(427, 376, 184, 14);
		panel.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setBounds(427, 412, 184, 14);
		panel.add(lblNewLabel_12);
		
		JButton btnNewButton_8 = new JButton("Book");
		btnNewButton_8.setForeground(Color.RED);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image img1 = new ImageIcon(this.getClass().getResource("/Login-in-icon.png")).getImage();
		btnNewButton_8.setIcon(new ImageIcon(img1));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String check =lblNewLabel_6.getText().toString();
				try {
				
				if(check=="New label")
				{
					JOptionPane.showMessageDialog(null, "Please Book a room");
					
				}
				else
				{
					
					int Room_Number1 =  (int) comboBox.getSelectedItem();
					String Name = lblNewLabel_5.getText();
					String Start_Dates = lblNewLabel_11.getText().toString();
					String End_Dates = lblNewLabel_12.getText().toString();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String select ="select * from bookings where Room_Number='"+Room_Number1+"' AND Type='"+Name+"' AND Start_Date>='"+Start_Dates+"' AND End_Date<='"+End_Dates+"'";
					Statement state1 = conn1.createStatement();
					ResultSet rss =state1.executeQuery(select);
					System.out.println(select);
					if(rss.next()==true) 
					{
					
						JOptionPane.showMessageDialog(null, "Oops room booked");
						
					}
					else 
					{
						

					String Full_Name=label.getText();
					String Other_Names=label_1.getText();
					String Phone_Number=label_2.getText();
					String Identity_Number=label_3.getText();
					String Password=label_4.getText();
					String Gender=lblNewLabel_4.getText();
					String Category=lblNewLabel_3.getText();
					String Type = lblNewLabel_5.getText();
					String Room_Number=lblNewLabel_6.getText();
					String Start_Date=lblNewLabel_11.getText().toString();
					String End_Date=lblNewLabel_12.getText().toString();
	
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement stat = con.createStatement();
					String sql = "insert into bookings values ('"+Full_Name+"','"+Other_Names+"','"+Phone_Number+"','"+Identity_Number+"','"+Password+"','"+Gender+"','"+Category+"','"+Type+"','"+Room_Number+"','"+Start_Date+"','"+End_Date+"')";
					stat.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "You have made your booking.");
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement state = conn.createStatement();
					String upt = "update apartments set One_Bedroom=(One_Bedroom-1) where Description='Vacancy_Count'";
					state.executeUpdate(upt);
						
						}
					}
					
					
				}
				
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_8.setBounds(729, 407, 137, 63);
		panel.add(btnNewButton_8);
		
		JLabel lblNewLabel_13 = new JLabel("Time and Date");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_13.setBounds(283, 48, 113, 14);
		panel.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("Clock");
		lblNewLabel_14.setForeground(Color.BLUE);
		lblNewLabel_14.setBackground(Color.BLUE);
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_14.setBounds(427, 44, 111, 23);
		panel.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_15.setForeground(Color.BLUE);
		lblNewLabel_15.setBounds(604, 38, 174, 34);
		panel.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Date");
		lblNewLabel_16.setBounds(548, 46, 46, 19);
		panel.add(lblNewLabel_16);
		
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Two Bedroom", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_10 = new JButton("Back");
		btnNewButton_10.setBackground(Color.CYAN);
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image imgb = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btnNewButton_10.setIcon(new ImageIcon(imgb));

		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TwoBedroom obj = new TwoBedroom();
				obj.setVisible(true);
			}
		});
		btnNewButton_10.setBounds(10, 430, 130, 40);
		panel_1.add(btnNewButton_10);
		
		JLabel label_5 = new JLabel("Room Number.");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_5.setBounds(10, 28, 115, 50);
		panel_1.add(label_5);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		comboBox_1.setBounds(146, 30, 73, 50);
		panel_1.add(comboBox_1);
		
		JLabel label_12 = new JLabel("Arrival Date");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_12.setBounds(10, 118, 115, 31);
		panel_1.add(label_12);
		
		dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(146, 113, 140, 36);
		panel_1.add(dateChooser_2);
		dateChooser_2.setDateFormatString("yyyy-MM-dd");
		
		JLabel label_13 = new JLabel("Departure Date");
		label_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_13.setBounds(10, 174, 115, 31);
		panel_1.add(label_13);
		
		dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(146, 174, 140, 31);
		panel_1.add(dateChooser_3);
		dateChooser_3.setDateFormatString("yyyy-MM-dd");
		
		JLabel label_14 = new JLabel("ID NO");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_14.setBounds(10, 225, 89, 20);
		panel_1.add(label_14);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 228, 141, 20);
		panel_1.add(textField_1);
		
		JLabel label_15 = new JLabel("Password");
		label_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_15.setBounds(10, 274, 89, 17);
		panel_1.add(label_15);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(146, 274, 140, 20);
		panel_1.add(passwordField_1);
		
		JButton button = new JButton("Show Your Booking Details.");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String selet ="select Two_Bedroom from apartments where Description='Vacancy_Count' AND Two_Bedroom >=1";
					PreparedStatement pst = cnn.prepareStatement(selet);
					ResultSet rs1 = pst.executeQuery();
					if(rs1.next()==true)
					{
					String Identity_Number = textField_1.getText();
					String Password=passwordField_1.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String sql = "select * from login_details where Identity_Number='"+Identity_Number+"' AND Password='"+Password+"'";
					
					Statement stat = con.createStatement();
					
					ResultSet rs = stat.executeQuery(sql);
					if(rs.next()==true)
					{
						
						int Room_Number_1 =  (int) comboBox_1.getSelectedItem();
						String Name = Nlabel_30.getText();
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
						String select ="select * from bookings where Room_Number='"+Room_Number_1+"' AND Type='"+Name+"'";
						Statement state = conn.createStatement();
						ResultSet rss =state.executeQuery(select);
						if(rss.next()==true) 
						{
						
							JOptionPane.showMessageDialog(null, "Oops room booked");
							
						}
						else 
						{
							DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
							System.out.println("You have booked room Number "+Room_Number_1);
							label_17.setText(rs.getString("Full_Name"));
							label_19.setText(rs.getString("Other_Names"));
							label_21.setText(rs.getString("Phone_Number"));
							label_23.setText(rs.getString("Identity_Number"));
							label_25.setText(rs.getString("Password"));
							label_27.setText(rs.getString("Gender"));
							label_33.setText(comboBox_1.getSelectedItem().toString());
							label_35.setText(df.format(dateChooser_2.getDate()));
							label_37.setText(df.format(dateChooser_3.getDate()));
							
							
							
						}
					}
					else 
					{
						
						JOptionPane.showMessageDialog(null, "Inorrect Identity Number and Password");
					}			
				} 
					else
					{
						JOptionPane.showMessageDialog(null, "<html>OOps all rooms in two bedroom apartment has been booked.<br /> please choose another category.</html>");
						Description obj = new Description();
						obj.setVisible(true);
						
					}
					}
					catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(272, 9, 255, 23);
		panel_1.add(button);
		
		JLabel label_16 = new JLabel("Full Name:");
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_16.setBounds(296, 71, 81, 19);
		panel_1.add(label_16);
		
		label_17 = new JLabel("New label");
		label_17.setBounds(438, 64, 89, 37);
		panel_1.add(label_17);
		
		JLabel label_18 = new JLabel("Other Names:");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_18.setBounds(296, 102, 100, 19);
		panel_1.add(label_18);
		
		label_19 = new JLabel("New label");
		label_19.setBounds(438, 100, 235, 27);
		panel_1.add(label_19);
		
		JLabel label_20 = new JLabel("Phone Number:");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_20.setBounds(296, 135, 111, 14);
		panel_1.add(label_20);
		
		label_21 = new JLabel("New label");
		label_21.setBounds(438, 129, 202, 31);
		panel_1.add(label_21);
		
		JLabel label_22 = new JLabel("ID No:");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_22.setBounds(296, 174, 81, 14);
		panel_1.add(label_22);
		
		label_23 = new JLabel("New label");
		label_23.setBounds(438, 162, 286, 43);
		panel_1.add(label_23);
		
		JLabel label_24 = new JLabel("Password");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_24.setBounds(296, 207, 100, 19);
		panel_1.add(label_24);
		
		label_25 = new JLabel("New label");
		label_25.setBounds(438, 203, 137, 31);
		panel_1.add(label_25);
		
		JLabel label_26 = new JLabel("Gender");
		label_26.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_26.setBounds(296, 242, 100, 14);
		panel_1.add(label_26);
		
		label_27 = new JLabel("New label");
		label_27.setBounds(438, 233, 312, 36);
		panel_1.add(label_27);
		
		JLabel label_28 = new JLabel("Category");
		label_28.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_28.setBounds(296, 277, 100, 23);
		panel_1.add(label_28);
		
		lblApartment_3 = new JLabel("Apartment");
		lblApartment_3.setBounds(438, 275, 111, 31);
		panel_1.add(lblApartment_3);
		
		JLabel label_30 = new JLabel("Type");
		label_30.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_30.setBounds(296, 316, 100, 23);
		panel_1.add(label_30);
		
		Nlabel_30 = new JLabel("Two Bedroom");
		Nlabel_30.setBounds(438, 312, 123, 35);
		panel_1.add(Nlabel_30);
		
		JLabel label_32 = new JLabel("Room Number");
		label_32.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_32.setBounds(296, 358, 111, 14);
		panel_1.add(label_32);
		
		label_33 = new JLabel("New label");
		label_33.setBounds(438, 360, 70, 14);
		panel_1.add(label_33);
		
		JLabel label_34 = new JLabel("Start Date");
		label_34.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_34.setBounds(296, 394, 81, 14);
		panel_1.add(label_34);
		
		label_35 = new JLabel("New label");
		label_35.setBounds(438, 396, 184, 14);
		panel_1.add(label_35);
		
		JLabel label_36 = new JLabel("End Date");
		label_36.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_36.setBounds(296, 430, 81, 14);
		panel_1.add(label_36);
		
		label_37 = new JLabel("New label");
		label_37.setBounds(438, 432, 184, 14);
		panel_1.add(label_37);
		
		JButton button_2 = new JButton("Book");
		button_2.setForeground(Color.RED);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image img2 = new ImageIcon(this.getClass().getResource("/Login-in-icon.png")).getImage();
		button_2.setIcon(new ImageIcon(img2));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String check =label_33.getText().toString();
				try {
				
				if(check=="New label")
				{
					JOptionPane.showMessageDialog(null, "Please Book a room");
					
				}
				else
				{
					int Room_Number1 =  (int) comboBox_1.getSelectedItem();
					String Name =Nlabel_30.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String select ="select * from bookings where Room_Number='"+Room_Number1+"' AND Type ='"+Name+"'";
					Statement state1 = conn1.createStatement();
					ResultSet rss =state1.executeQuery(select);
					if(rss.next()==true) 
					{
					
						JOptionPane.showMessageDialog(null, "Oops room booked");
						
					}
					else 
					{
					String Full_Name=label_17.getText();
					String Other_Names=label_19.getText();
					String Phone_Number=label_21.getText();
					String Identity_Number=label_23.getText();
					String Password=label_25.getText();
					String Gender=label_27.getText();
					String Category=lblApartment_3.getText();
					String Type = Nlabel_30.getText();
					String Room_Number=label_33.getText();
					String Start_Date=label_35.getText().toString();
					String End_Date=label_37.getText().toString();
	
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement stat = con.createStatement();
					String sql = "insert into bookings values ('"+Full_Name+"','"+Other_Names+"','"+Phone_Number+"','"+Identity_Number+"','"+Password+"','"+Gender+"','"+Category+"','"+Type+"','"+Room_Number+"','"+Start_Date+"','"+End_Date+"')";
					stat.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "You have made your booking.");
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement state = conn.createStatement();
					String upt = "update apartments set Two_Bedroom=(Two_Bedroom-1) where Description='Vacancy_Count'";
					state.executeUpdate(upt);
					
					}
					
				}
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		button_2.setBounds(755, 420, 111, 50);
		panel_1.add(button_2);
		
		JLabel lblNewLabel_17 = new JLabel("Date");
		lblNewLabel_17.setBounds(553, 38, 46, 34);
		panel_1.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setForeground(Color.BLUE);
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_18.setBounds(438, 43, 86, 24);
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Time And Date");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_19.setBounds(296, 46, 111, 14);
		panel_1.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_20.setForeground(Color.BLUE);
		lblNewLabel_20.setBounds(609, 42, 100, 20);
		panel_1.add(lblNewLabel_20);
		
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Three Bedroom", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton_11 = new JButton("Back");
		btnNewButton_11.setBackground(Color.CYAN);
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image imgc = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btnNewButton_11.setIcon(new ImageIcon(imgc));

		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				ThreeBedroom obj = new ThreeBedroom();
				obj.setVisible(true);
			}
		});
		btnNewButton_11.setBounds(10, 431, 132, 39);
		panel_2.add(btnNewButton_11);
		
		JLabel label_38 = new JLabel("Room Number.");
		label_38.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_38.setBounds(10, 28, 115, 50);
		panel_2.add(label_38);
		
		comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox_2.setBounds(155, 30, 73, 50);
		panel_2.add(comboBox_2);
		
		JLabel label_39 = new JLabel("Arrival Date");
		label_39.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_39.setBounds(10, 118, 115, 31);
		panel_2.add(label_39);
		
		dateChooser_4 = new JDateChooser();
		dateChooser_4.setBounds(155, 113, 140, 36);
		panel_2.add(dateChooser_4);
		dateChooser_4.setDateFormatString("yyyy-MM-dd");
		
		JLabel label_40 = new JLabel("Departure Date");
		label_40.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_40.setBounds(10, 174, 115, 31);
		panel_2.add(label_40);
		
		dateChooser_5 = new JDateChooser();
		dateChooser_5.setBounds(155, 174, 140, 31);
		panel_2.add(dateChooser_5);
		dateChooser_5.setDateFormatString("yyyy-MM-dd");
		
		JLabel label_41 = new JLabel("ID NO");
		label_41.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_41.setBounds(10, 225, 100, 20);
		panel_2.add(label_41);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(154, 228, 141, 20);
		panel_2.add(textField_2);
		
		JLabel label_42 = new JLabel("Password");
		label_42.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_42.setBounds(10, 268, 115, 23);
		panel_2.add(label_42);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setBounds(155, 274, 140, 20);
		panel_2.add(passwordField_2);
		
		JButton button_3 = new JButton("Show Your Booking Details.");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {

					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String selet ="select Three_Bedroom from apartments where Description='Vacancy_Count' AND Three_Bedroom >=1";
					PreparedStatement pst = cnn.prepareStatement(selet);
					ResultSet rs1 = pst.executeQuery();
					if(rs1.next()==true)
					{
					String Identity_Number = textField_2.getText();
					String Password=passwordField_2.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String sql = "select * from login_details where Identity_Number='"+Identity_Number+"' AND Password='"+Password+"'";
					
					Statement stat = con.createStatement();
					
					ResultSet rs = stat.executeQuery(sql);
					if(rs.next()==true)
					{
						
						
						int Room_Number =  (int) comboBox_2.getSelectedItem();
						String Name =Nlabel_57.getText();
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
						String select ="select * from bookings where Room_Number='"+Room_Number+"' AND Type='"+Name+"'";
						Statement state = conn.createStatement();
						ResultSet rss =state.executeQuery(select);
						if(rss.next()==true) 
						{
						
							JOptionPane.showMessageDialog(null, "Oops room booked");
							
						}
						else 
						{
							DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
							System.out.println("You have booked room Number "+Room_Number);
							label_44.setText(rs.getString("Full_Name"));
							label_46.setText(rs.getString("Other_Names"));
							label_48.setText(rs.getString("Phone_Number"));
							label_50.setText(rs.getString("Identity_Number"));
							label_52.setText(rs.getString("Password"));
							label_54.setText(rs.getString("Gender"));
							label_60.setText(comboBox_2.getSelectedItem().toString());
							label_62.setText(df.format(dateChooser_4.getDate()));
							label_64.setText(df.format(dateChooser_5.getDate()));
							
							
							
						}
					}
					else 
					{
						
						JOptionPane.showMessageDialog(null, "Inorrect Identity Number and Password");
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "<html>OOps no vacancy all roomed bookes. choose antother category</html>");
						Description obj = new Description();
						obj.setVisible(true);
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_3.setBounds(291, 11, 267, 23);
		panel_2.add(button_3);
		
		JLabel label_43 = new JLabel("Full Name:");
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_43.setBounds(305, 74, 81, 19);
		panel_2.add(label_43);
		
		label_44 = new JLabel("New label");
		label_44.setBounds(447, 67, 219, 37);
		panel_2.add(label_44);
		
		JLabel label_45 = new JLabel("Other Names:");
		label_45.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_45.setBounds(305, 112, 100, 19);
		panel_2.add(label_45);
		
		label_46 = new JLabel("New label");
		label_46.setBounds(447, 110, 235, 27);
		panel_2.add(label_46);
		
		JLabel label_47 = new JLabel("Phone Number:");
		label_47.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_47.setBounds(305, 157, 111, 14);
		panel_2.add(label_47);
		
		label_48 = new JLabel("New label");
		label_48.setBounds(447, 151, 202, 31);
		panel_2.add(label_48);
		
		JLabel label_49 = new JLabel("ID No:");
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_49.setBounds(305, 196, 81, 14);
		panel_2.add(label_49);
		
		label_50 = new JLabel("New label");
		label_50.setBounds(447, 184, 286, 43);
		panel_2.add(label_50);
		
		JLabel label_51 = new JLabel("Password");
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_51.setBounds(305, 229, 100, 19);
		panel_2.add(label_51);
		
		label_52 = new JLabel("New label");
		label_52.setBounds(447, 222, 137, 31);
		panel_2.add(label_52);
		
		JLabel label_53 = new JLabel("Gender");
		label_53.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_53.setBounds(305, 268, 100, 14);
		panel_2.add(label_53);
		
		label_54 = new JLabel("New label");
		label_54.setBounds(447, 255, 312, 36);
		panel_2.add(label_54);
		
		JLabel label_55 = new JLabel("Category");
		label_55.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_55.setBounds(305, 295, 100, 23);
		panel_2.add(label_55);
		
		JLabel lblApartment_4 = new JLabel("Apartment");
		lblApartment_4.setBounds(447, 293, 111, 31);
		panel_2.add(lblApartment_4);
		
		JLabel label_57 = new JLabel("Type");
		label_57.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_57.setBounds(305, 329, 100, 23);
		panel_2.add(label_57);
		
		Nlabel_57 = new JLabel("Three Bedroom");
		Nlabel_57.setBounds(447, 325, 173, 35);
		panel_2.add(Nlabel_57);
		
		JLabel label_59 = new JLabel("Room Number");
		label_59.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_59.setBounds(306, 363, 132, 20);
		panel_2.add(label_59);
		
		label_60 = new JLabel("New label");
		label_60.setBounds(447, 368, 100, 14);
		panel_2.add(label_60);
		
		JLabel label_61 = new JLabel("Start Date");
		label_61.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_61.setBounds(305, 394, 81, 14);
		panel_2.add(label_61);
		
		label_62 = new JLabel("New label");
		label_62.setBounds(447, 396, 184, 14);
		panel_2.add(label_62);
		
		JLabel label_63 = new JLabel("End Date");
		label_63.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_63.setBounds(305, 431, 81, 14);
		panel_2.add(label_63);
		
		label_64 = new JLabel("New label");
		label_64.setBounds(447, 433, 184, 14);
		panel_2.add(label_64);
		
		JButton button_5 = new JButton("Book");
		button_5.setForeground(Color.RED);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image img3 = new ImageIcon(this.getClass().getResource("/Login-in-icon.png")).getImage();
		button_5.setIcon(new ImageIcon(img3));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String check =label_60.getText().toString();
				try {
				
				if(check=="New label")
				{
					JOptionPane.showMessageDialog(null, "Please Book a room");
					
				}
				else
				{
					int Room_Number1 =  (int) comboBox_2.getSelectedItem();
					String Name =Nlabel_57.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String select ="select * from bookings where Room_Number='"+Room_Number1+"' AND Type ='"+Name+"'";
					Statement state1 = conn1.createStatement();
					ResultSet rss =state1.executeQuery(select);
					if(rss.next()==true) 
					{
					
						JOptionPane.showMessageDialog(null, "Oops room booked");
						
					}
					else 
					{
					
					
					String Full_Name=label_44.getText();
					String Other_Names=label_46.getText();
					String Phone_Number=label_48.getText();
					String Identity_Number=label_50.getText();
					String Password=label_52.getText();
					String Gender=label_54.getText();
					String Category=lblApartment_4.getText();
					String Type = Nlabel_57.getText();
					String Room_Number=label_60.getText();
					String Start_Date=label_62.getText().toString();
					String End_Date=label_64.getText().toString();
	
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement stat = con.createStatement();
					String sql = "insert into bookings values ('"+Full_Name+"','"+Other_Names+"','"+Phone_Number+"','"+Identity_Number+"','"+Password+"','"+Gender+"','"+Category+"','"+Type+"','"+Room_Number+"','"+Start_Date+"','"+End_Date+"')";
					stat.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "You have made your booking.");
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement state = conn.createStatement();
					String upt = "update apartments set Three_Bedroom=(Three_Bedroom-1) where Description='Vacancy_Count'";
					state.executeUpdate(upt);
					
					}
					
				}
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		button_5.setBounds(743, 420, 123, 50);
		panel_2.add(button_5);
		
		lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setForeground(Color.BLUE);
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_21.setBounds(447, 28, 83, 40);
		panel_2.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Time AND Date");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_22.setBounds(305, 41, 133, 14);
		panel_2.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("Date");
		lblNewLabel_23.setBounds(533, 38, 46, 14);
		panel_2.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("New label");
		lblNewLabel_24.setForeground(Color.BLUE);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_24.setBounds(591, 28, 123, 28);
		panel_2.add(lblNewLabel_24);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Four Bedroom", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton_12 = new JButton("Back");
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_12.setBackground(Color.CYAN);
		Image imgd = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btnNewButton_12.setIcon(new ImageIcon(imgd));

		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				FourBedroom obj = new FourBedroom();
				obj.setVisible(true);
			}
		});
		btnNewButton_12.setBounds(10, 434, 128, 36);
		panel_3.add(btnNewButton_12);
		
		JLabel label_65 = new JLabel("Room Number.");
		label_65.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_65.setBounds(10, 28, 115, 50);
		panel_3.add(label_65);
		
		comboBox_3 = new JComboBox();
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		comboBox_3.setBounds(153, 30, 73, 50);
		panel_3.add(comboBox_3);
		
		JLabel label_66 = new JLabel("Arrival Date");
		label_66.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_66.setBounds(10, 118, 115, 31);
		panel_3.add(label_66);
		
		dateChooser_6 = new JDateChooser();
		dateChooser_6.setBounds(153, 113, 140, 36);
		panel_3.add(dateChooser_6);
		dateChooser_6.setDateFormatString("yyyy-MM-dd");
		
		JLabel label_67 = new JLabel("Departure Date");
		label_67.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_67.setBounds(10, 174, 115, 31);
		panel_3.add(label_67);
		
		dateChooser_7 = new JDateChooser();
		dateChooser_7.setBounds(153, 174, 140, 31);
		panel_3.add(dateChooser_7);
		dateChooser_7.setDateFormatString("yyyy-MM-dd");
		
		JLabel label_68 = new JLabel("ID NO");
		label_68.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_68.setBounds(10, 231, 115, 14);
		panel_3.add(label_68);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(152, 228, 141, 20);
		panel_3.add(textField_3);
		
		JLabel label_69 = new JLabel("Password");
		label_69.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_69.setBounds(10, 274, 89, 28);
		panel_3.add(label_69);
		
		passwordField_3 = new JPasswordField();
		passwordField_3.setBounds(153, 274, 140, 20);
		panel_3.add(passwordField_3);
		
		JButton button_6 = new JButton("Show Your Booking Details.");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String selet ="select Four_Bedroom from apartments where Description='Vacancy_Count' AND Four_Bedroom >=1";
					PreparedStatement pst = cnn.prepareStatement(selet);
					ResultSet rs1 = pst.executeQuery();
					if(rs1.next()==true)
					{
						
					
					String Identity_Number = textField_3.getText();
					String Password=passwordField_3.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String sql = "select * from login_details where Identity_Number='"+Identity_Number+"' AND Password='"+Password+"'";
					
					Statement stat = con.createStatement();
					
					ResultSet rs = stat.executeQuery(sql);
					if(rs.next()==true)
					{
						
						
						int Room_Number =  (int) comboBox_3.getSelectedItem();
						String Name =lbl85.getText();
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
						String select ="select * from bookings where Room_Number='"+Room_Number+"' AND Type='"+Name+"'";
						Statement state = conn.createStatement();
						ResultSet rss =state.executeQuery(select);
						if(rss.next()==true) 
						{
						
							JOptionPane.showMessageDialog(null, "<html>Oops room booked<br />Please choose another room</html>");
							
						}
						else 
						{
							DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
							System.out.println("You have booked room Number "+Room_Number);
							label_71.setText(rs.getString("Full_Name"));
							label_73.setText(rs.getString("Other_Names"));
							label_75.setText(rs.getString("Phone_Number"));
							label_77.setText(rs.getString("Identity_Number"));
							label_79.setText(rs.getString("Password"));
							label_81.setText(rs.getString("Gender"));
							label_87.setText(comboBox_3.getSelectedItem().toString());
							label_89.setText(df.format(dateChooser_6.getDate()));
							label_91.setText(df.format(dateChooser_7.getDate()));
							
							
							
						}
					}
					else 
					{
						
						JOptionPane.showMessageDialog(null, "Inorrect Identity Number and Password");
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "<html>OOps No vacancy.All rooms booked.<br />Please make a booking</html>");
						Description obj = new Description();
						obj.setVisible(true);
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button_6.setBounds(270, 11, 258, 23);
		panel_3.add(button_6);
		
		JLabel label_70 = new JLabel("Full Name:");
		label_70.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_70.setBounds(303, 76, 81, 19);
		panel_3.add(label_70);
		
		label_71 = new JLabel("New label");
		label_71.setBounds(429, 69, 219, 37);
		panel_3.add(label_71);
		
		JLabel label_72 = new JLabel("Other Names:");
		label_72.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_72.setBounds(303, 106, 100, 19);
		panel_3.add(label_72);
		
		label_73 = new JLabel("New label");
		label_73.setBounds(429, 104, 235, 27);
		panel_3.add(label_73);
		
		JLabel label_74 = new JLabel("Phone Number:");
		label_74.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_74.setBounds(303, 135, 111, 14);
		panel_3.add(label_74);
		
		label_75 = new JLabel("New label");
		label_75.setBounds(429, 129, 202, 31);
		panel_3.add(label_75);
		
		JLabel label_76 = new JLabel("ID No:");
		label_76.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_76.setBounds(303, 160, 81, 14);
		panel_3.add(label_76);
		
		label_77 = new JLabel("New label");
		label_77.setBounds(429, 148, 286, 43);
		panel_3.add(label_77);
		
		JLabel label_78 = new JLabel("Password");
		label_78.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_78.setBounds(303, 194, 100, 19);
		panel_3.add(label_78);
		
		label_79 = new JLabel("New label");
		label_79.setBounds(429, 190, 137, 31);
		panel_3.add(label_79);
		
		JLabel label_80 = new JLabel("Gender");
		label_80.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_80.setBounds(303, 229, 100, 14);
		panel_3.add(label_80);
		
		label_81 = new JLabel("New label");
		label_81.setBounds(429, 222, 312, 36);
		panel_3.add(label_81);
		
		JLabel label_82 = new JLabel("Category");
		label_82.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_82.setBounds(303, 267, 100, 23);
		panel_3.add(label_82);
		
		lblApartment_5 = new JLabel("Apartment");
		lblApartment_5.setBounds(429, 269, 111, 31);
		panel_3.add(lblApartment_5);
		
		JLabel label_84 = new JLabel("Type");
		label_84.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_84.setBounds(303, 307, 100, 23);
		panel_3.add(label_84);
		
		lbl85 = new JLabel("Four Bedroom");
		lbl85.setBounds(429, 303, 123, 35);
		panel_3.add(lbl85);
		
		JLabel label_86 = new JLabel("Room Number");
		label_86.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_86.setBounds(303, 344, 111, 14);
		panel_3.add(label_86);
		
		label_87 = new JLabel("New label");
		label_87.setBounds(429, 346, 83, 14);
		panel_3.add(label_87);
		
		JLabel label_88 = new JLabel("Start Date");
		label_88.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_88.setBounds(303, 383, 81, 14);
		panel_3.add(label_88);
		
		label_89 = new JLabel("New label");
		label_89.setBounds(429, 385, 184, 14);
		panel_3.add(label_89);
		
		JLabel label_90 = new JLabel("End Date");
		label_90.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_90.setBounds(303, 419, 81, 14);
		panel_3.add(label_90);
		
		label_91 = new JLabel("New label");
		label_91.setBounds(429, 421, 184, 14);
		panel_3.add(label_91);
		
		JButton button_8 = new JButton("Book");
		button_8.setForeground(Color.RED);
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image img4 = new ImageIcon(this.getClass().getResource("/Login-in-icon.png")).getImage();
		button_8.setIcon(new ImageIcon(img4));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String check =label_87.getText().toString();
				try {
				
				if(check=="New label")
				{
					JOptionPane.showMessageDialog(null, "Please Book a room");
					
				}
				else
				{
					
					
					int Room_Number1 =  (int) comboBox_3.getSelectedItem();
					String Name =lbl85.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String select ="select * from bookings where Room_Number='"+Room_Number1+"' AND Type ='"+Name+"'";
					Statement state1 = conn1.createStatement();
					ResultSet rss =state1.executeQuery(select);
					if(rss.next()==true) 
					{
					
						JOptionPane.showMessageDialog(null, "Oops room booked");
						
					}
					else 
					{
					
					
					String Full_Name=label_71.getText();
					String Other_Names=label_73.getText();
					String Phone_Number=label_75.getText();
					String Identity_Number=label_77.getText();
					String Password=label_79.getText();
					String Gender=label_81.getText();
					String Category=lblApartment_5.getText();
					String Type = lbl85.getText();
					String Room_Number=label_87.getText();
					String Start_Date=label_89.getText().toString();
					String End_Date=label_91.getText().toString();
	
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement stat = con.createStatement();
					String sql = "insert into bookings values ('"+Full_Name+"','"+Other_Names+"','"+Phone_Number+"','"+Identity_Number+"','"+Password+"','"+Gender+"','"+Category+"','"+Type+"','"+Room_Number+"','"+Start_Date+"','"+End_Date+"')";
					stat.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "You have made your booking.");
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement state = conn.createStatement();
					String upt = "update apartments set Four_Bedroom=(Four_Bedroom-1) where Description='Vacancy_Count'";
					state.executeUpdate(upt);
					
					}
					
				}
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		button_8.setBounds(751, 419, 115, 51);
		panel_3.add(button_8);
		
		JLabel lblNewLabel_25 = new JLabel("Date");
		lblNewLabel_25.setBounds(566, 48, 46, 14);
		panel_3.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("Time AND Date");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_26.setBounds(303, 48, 123, 14);
		panel_3.add(lblNewLabel_26);
		
		lblNewLabel_27 = new JLabel("New label");
		lblNewLabel_27.setForeground(Color.BLUE);
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_27.setBounds(429, 40, 111, 30);
		panel_3.add(lblNewLabel_27);
		
		lblNewLabel_28 = new JLabel("New label");
		lblNewLabel_28.setForeground(Color.BLUE);
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_28.setBounds(599, 39, 89, 32);
		panel_3.add(lblNewLabel_28);
		
		tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.addTab("Assisted Living Facility", null, tabbedPane_2, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_2.addTab("Individual Rooms", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnNewButton_13 = new JButton("Back");
		btnNewButton_13.setBackground(Color.MAGENTA);
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image imge = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btnNewButton_13.setIcon(new ImageIcon(imge));

		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				IndividualRooms obj = new IndividualRooms();
				obj.setVisible(true);
			}
		});
		btnNewButton_13.setBounds(10, 426, 128, 44);
		panel_4.add(btnNewButton_13);
		
		JLabel label_31 = new JLabel("Room Number.");
		label_31.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_31.setBounds(10, 30, 115, 50);
		panel_4.add(label_31);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setBounds(135, 30, 73, 50);
		panel_4.add(comboBox_4);
		
		JLabel label_58 = new JLabel("Arrival Date");
		label_58.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_58.setBounds(10, 118, 115, 31);
		panel_4.add(label_58);
		
		dateChooser_8 = new JDateChooser();
		dateChooser_8.setBounds(135, 113, 140, 36);
		panel_4.add(dateChooser_8);
		dateChooser_8.setDateFormatString("yyyy-MM-dd");
		
		JLabel label_92 = new JLabel("Departure Date");
		label_92.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_92.setBounds(10, 174, 115, 31);
		panel_4.add(label_92);
		
		dateChooser_9 = new JDateChooser();
		dateChooser_9.setBounds(135, 174, 140, 31);
		panel_4.add(dateChooser_9);
		
		JLabel label_93 = new JLabel("ID NO");
		label_93.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_93.setBounds(10, 222, 100, 23);
		panel_4.add(label_93);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(134, 228, 141, 20);
		panel_4.add(textField_4);
		
		JLabel label_94 = new JLabel("Password");
		label_94.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_94.setBounds(10, 274, 89, 17);
		panel_4.add(label_94);
		
		passwordField_4 = new JPasswordField();
		passwordField_4.setBounds(135, 274, 140, 20);
		panel_4.add(passwordField_4);
		
		JButton button_9 = new JButton("Show Your Booking Details.");
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String selet ="select Individual_Rooms from assisted_living where Description='Vacancy_Count' AND Individual_Rooms >=1";
					PreparedStatement pst = cnn.prepareStatement(selet);
					ResultSet rs1 = pst.executeQuery();
					if(rs1.next()==true)
					{
					
					String Identity_Number = textField_4.getText();
					String Password=passwordField_4.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String sql = "select * from login_details where Identity_Number='"+Identity_Number+"' AND Password='"+Password+"'";
					
					Statement stat = con.createStatement();
					
					ResultSet rs = stat.executeQuery(sql);
					if(rs.next()==true)
					{
						
						//System.out.println("Found");
						int Room_Number =  (int) comboBox_4.getSelectedItem();
						String Name =lblIndividualRooms.getText();
						
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
						String select ="select * from bookings where Room_Number='"+Room_Number+"' AND Type='"+Name+"'";
						Statement state = conn.createStatement();
						ResultSet rss =state.executeQuery(select);
						if(rss.next()==true) 
						{
						
							JOptionPane.showMessageDialog(null, "Oops room booked");
							
						}
						else 
						{
							DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
							System.out.println("You have booked room Number "+Room_Number);
							label_96.setText(rs.getString("Full_Name"));
							label_98.setText(rs.getString("Other_Names"));
							label_100.setText(rs.getString("Phone_Number"));
							label_102.setText(rs.getString("Identity_Number"));
							label_104.setText(rs.getString("Password"));
							label_106.setText(rs.getString("Gender"));
							label_112.setText(comboBox_4.getSelectedItem().toString());
							label_114.setText(df.format(dateChooser_8.getDate()));
							label_116.setText(df.format(dateChooser_9.getDate()));
							

							
						}
					}
					else 
					{
						
						JOptionPane.showMessageDialog(null, "Incorrect Identity Number and Password");
					}
					}
					else
					{
						JOptionPane.showMessageDialog(null, "<html>OOps no vacancy All Rooms booked.<br />Choose another category</html>");
						Description obj = new Description();
						obj.setVisible(true);
					}
					}
					
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		button_9.setBounds(259, 11, 279, 23);
		panel_4.add(button_9);
		
		JLabel label_95 = new JLabel("Full Name:");
		label_95.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_95.setBounds(285, 84, 81, 19);
		panel_4.add(label_95);
		
		label_96 = new JLabel("New label");
		label_96.setBounds(424, 77, 219, 37);
		panel_4.add(label_96);
		
		JLabel label_97 = new JLabel("Other Names:");
		label_97.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_97.setBounds(285, 118, 100, 19);
		panel_4.add(label_97);
		
		label_98 = new JLabel("New label");
		label_98.setBounds(424, 116, 235, 27);
		panel_4.add(label_98);
		
		JLabel label_99 = new JLabel("Phone Number:");
		label_99.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_99.setBounds(285, 153, 111, 23);
		panel_4.add(label_99);
		
		label_100 = new JLabel("New label");
		label_100.setBounds(424, 151, 202, 31);
		panel_4.add(label_100);
		
		JLabel label_101 = new JLabel("ID No:");
		label_101.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_101.setBounds(285, 192, 81, 23);
		panel_4.add(label_101);
		
		label_102 = new JLabel("New label");
		label_102.setBounds(427, 184, 286, 43);
		panel_4.add(label_102);
		
		JLabel label_103 = new JLabel("Password");
		label_103.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_103.setBounds(285, 229, 100, 19);
		panel_4.add(label_103);
		
		label_104 = new JLabel("New label");
		label_104.setBounds(427, 223, 137, 31);
		panel_4.add(label_104);
		
		JLabel label_105 = new JLabel("Gender");
		label_105.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_105.setBounds(285, 275, 100, 14);
		panel_4.add(label_105);
		
		label_106 = new JLabel("New label");
		label_106.setBounds(427, 266, 312, 36);
		panel_4.add(label_106);
		
		JLabel label_107 = new JLabel("Category");
		label_107.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_107.setBounds(285, 301, 100, 23);
		panel_4.add(label_107);
		
		lblApartment = new JLabel("Assisted Living");
		lblApartment.setBounds(427, 299, 111, 31);
		panel_4.add(lblApartment);
		
		JLabel label_109 = new JLabel("Type");
		label_109.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_109.setBounds(285, 335, 100, 23);
		panel_4.add(label_109);
		
		lblIndividualRooms = new JLabel("Individual Rooms");
		lblIndividualRooms.setBounds(427, 331, 123, 35);
		panel_4.add(lblIndividualRooms);
		
		JLabel label_111 = new JLabel("Room Number");
		label_111.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_111.setBounds(285, 369, 123, 14);
		panel_4.add(label_111);
		
		label_112 = new JLabel("New label");
		label_112.setBounds(427, 371, 83, 14);
		panel_4.add(label_112);
		
		JLabel label_113 = new JLabel("Start Date");
		label_113.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_113.setBounds(285, 396, 81, 14);
		panel_4.add(label_113);
		
		label_114 = new JLabel("New label");
		label_114.setBounds(427, 398, 184, 14);
		panel_4.add(label_114);
		
		JLabel label_115 = new JLabel("End Date");
		label_115.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_115.setBounds(285, 426, 81, 14);
		panel_4.add(label_115);
		
		label_116 = new JLabel("New label");
		label_116.setBounds(427, 428, 184, 14);
		panel_4.add(label_116);
		
		JButton button_11 = new JButton("Book");
		button_11.setForeground(Color.RED);
		button_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image img5 = new ImageIcon(this.getClass().getResource("/Login-in-icon.png")).getImage();
		button_11.setIcon(new ImageIcon(img5));
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String check =lblIndividualRooms.getText().toString();
				try {
				
				if(check=="New label")
				{
					JOptionPane.showMessageDialog(null, "Please Book a room");
					
				}
				else
				{
					
					int Room_Number1 =  (int) comboBox_4.getSelectedItem();
					String Name =lblIndividualRooms.getText();
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String select ="select * from bookings where Room_Number='"+Room_Number1+"' AND Type ='"+Name+"'";
					Statement state1 = conn1.createStatement();
					ResultSet rss =state1.executeQuery(select);
					if(rss.next()==true) 
					{
					
						JOptionPane.showMessageDialog(null, "Oops room booked");
						
					}
					else 
					{
					
					
					String Full_Name=label_96.getText();
					String Other_Names=label_98.getText();
					String Phone_Number=label_100.getText();
					String Identity_Number=label_102.getText();
					String Password=label_104.getText();
					String Gender=label_106.getText();
					String Category=lblApartment.getText();
					String Type = lblIndividualRooms.getText();
					String Room_Number=label_112.getText();
					String Start_Date=label_114.getText().toString();
					String End_Date=label_116.getText().toString();
	
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement stat = con.createStatement();
					String sql = "insert into bookings values ('"+Full_Name+"','"+Other_Names+"','"+Phone_Number+"','"+Identity_Number+"','"+Password+"','"+Gender+"','"+Category+"','"+Type+"','"+Room_Number+"','"+Start_Date+"','"+End_Date+"')";
					stat.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "You have made your booking.");
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement state = conn.createStatement();
					String upt = "update assisted_living set Individual_Rooms=(Individual_Rooms-1) where Description='Vacancy_Count'";
					state.executeUpdate(upt);
					
					}
				}
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		button_11.setBounds(751, 426, 115, 44);
		panel_4.add(button_11);
		
		JLabel lblNewLabel_29 = new JLabel("Time and Date:");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_29.setBounds(285, 45, 111, 19);
		panel_4.add(lblNewLabel_29);
		
		lblNewLabel_30 = new JLabel("New label");
		lblNewLabel_30.setForeground(Color.BLUE);
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_30.setBounds(424, 45, 107, 23);
		panel_4.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("Date:");
		lblNewLabel_31.setBounds(534, 50, 46, 14);
		panel_4.add(lblNewLabel_31);
		
		lblNewLabel_32 = new JLabel("New label");
		lblNewLabel_32.setForeground(Color.BLUE);
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_32.setBounds(578, 45, 100, 19);
		panel_4.add(lblNewLabel_32);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_2.addTab("Shared Quarters", null, panel_5, null);
		panel_5.setLayout(null);
		
		JButton btnNewButton_14 = new JButton("Back");
		btnNewButton_14.setBackground(Color.MAGENTA);
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image imgf = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btnNewButton_14.setIcon(new ImageIcon(imgf));

		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				SharedQuarters obj = new SharedQuarters();
				obj.setVisible(true);
			}
		});
		btnNewButton_14.setBounds(10, 420, 123, 50);
		panel_5.add(btnNewButton_14);
		
		JLabel label_117 = new JLabel("Room Number.");
		label_117.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_117.setBounds(10, 30, 115, 50);
		panel_5.add(label_117);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setBounds(135, 30, 73, 50);
		panel_5.add(comboBox_5);
		
		JLabel label_118 = new JLabel("Arrival Date");
		label_118.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_118.setBounds(10, 118, 115, 31);
		panel_5.add(label_118);
		
		dateChooser_10 = new JDateChooser();
		dateChooser_10.setBounds(135, 113, 140, 36);
		panel_5.add(dateChooser_10);
		dateChooser_10.setDateFormatString("yyyy-MM-dd");
		
		JLabel label_119 = new JLabel("Departure Date");
		label_119.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_119.setBounds(10, 174, 115, 31);
		panel_5.add(label_119);
		
		dateChooser_11 = new JDateChooser();
		dateChooser_11.setBounds(135, 174, 140, 31);
		panel_5.add(dateChooser_11);
		dateChooser_11.setDateFormatString("yyyy-MM-dd");
		
		JLabel label_120 = new JLabel("ID NO");
		label_120.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_120.setBounds(10, 225, 114, 23);
		panel_5.add(label_120);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(134, 228, 141, 20);
		panel_5.add(textField_5);
		
		JLabel label_121 = new JLabel("Password");
		label_121.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_121.setBounds(10, 274, 89, 17);
		panel_5.add(label_121);
		
		passwordField_5 = new JPasswordField();
		passwordField_5.setBounds(135, 274, 140, 20);
		panel_5.add(passwordField_5);
		
		JButton button_12 = new JButton("Show Your Booking Details.");
		button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String selet ="select Shared_Quarters from assisted_living where Description='Vacancy_Count' AND Shared_Quarters >=1";
					PreparedStatement pst = cnn.prepareStatement(selet);
					ResultSet rs1 = pst.executeQuery();
					if(rs1.next()==true)
					{
					
					String Identity_Number = textField_5.getText();
					String Password=passwordField_5.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String sql = "select * from login_details where Identity_Number='"+Identity_Number+"' AND Password='"+Password+"'";
					
					Statement stat = con.createStatement();
					
					ResultSet rs = stat.executeQuery(sql);
					if(rs.next()==true)
					{
						
						//System.out.println("Found");
						int Room_Number =  (int) comboBox_5.getSelectedItem();
						String Name =lblSharedQuarters.getText();
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
						String select ="select * from bookings where Room_Number='"+Room_Number+"' AND Type='"+Name+"'";
						Statement state = conn.createStatement();
						ResultSet rss =state.executeQuery(select);
						if(rss.next()==true) 
						{
						
							JOptionPane.showMessageDialog(null, "Oops room booked");
							
						}
						else 
						{
							
							DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
							System.out.println("You have booked room Number "+Room_Number);
							label_123.setText(rs.getString("Full_Name"));
							label_125.setText(rs.getString("Other_Names"));
							label_127.setText(rs.getString("Phone_Number"));
							label_129.setText(rs.getString("Identity_Number"));
							label_131.setText(rs.getString("Password"));
							label_133.setText(rs.getString("Gender"));
							label_139.setText(comboBox_5.getSelectedItem().toString());
							label_141.setText(df.format(dateChooser_10.getDate()));
							label_143.setText(df.format(dateChooser_11.getDate()));
							
							
							
						}
					}
					else 
					{
						
						JOptionPane.showMessageDialog(null, "Inorrect Identity Number and Password");
					}
					
				} 
					else
					{
						JOptionPane.showMessageDialog(null, "<html>OOps all rooms booked. No vacancy<br /> Please choose another category</html>");
						Description obj = new Description();
						obj.setVisible(true);
						
					}
					}
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button_12.setBounds(271, 11, 280, 23);
		panel_5.add(button_12);
		
		JLabel label_122 = new JLabel("Full Name:");
		label_122.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_122.setBounds(285, 90, 81, 19);
		panel_5.add(label_122);
		
		label_123 = new JLabel("New label");
		label_123.setBounds(428, 90, 219, 23);
		panel_5.add(label_123);
		
		JLabel label_124 = new JLabel("Other Names:");
		label_124.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_124.setBounds(285, 130, 100, 19);
		panel_5.add(label_124);
		
		label_125 = new JLabel("New label");
		label_125.setBounds(428, 128, 235, 27);
		panel_5.add(label_125);
		
		JLabel label_126 = new JLabel("Phone Number:");
		label_126.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_126.setBounds(285, 174, 111, 14);
		panel_5.add(label_126);
		
		label_127 = new JLabel("New label");
		label_127.setBounds(427, 168, 202, 31);
		panel_5.add(label_127);
		
		JLabel label_128 = new JLabel("ID No:");
		label_128.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_128.setBounds(285, 218, 81, 14);
		panel_5.add(label_128);
		
		label_129 = new JLabel("New label");
		label_129.setBounds(427, 206, 286, 43);
		panel_5.add(label_129);
		
		JLabel label_130 = new JLabel("Password");
		label_130.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_130.setBounds(285, 256, 100, 19);
		panel_5.add(label_130);
		
		label_131 = new JLabel("New label");
		label_131.setBounds(427, 252, 137, 31);
		panel_5.add(label_131);
		
		JLabel label_132 = new JLabel("Gender");
		label_132.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_132.setBounds(285, 291, 100, 14);
		panel_5.add(label_132);
		
		label_133 = new JLabel("New label");
		label_133.setBounds(427, 282, 312, 36);
		panel_5.add(label_133);
		
		JLabel label_134 = new JLabel("Category");
		label_134.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_134.setBounds(285, 316, 100, 23);
		panel_5.add(label_134);
		
		lblApartment_1 = new JLabel("Assisted Living");
		lblApartment_1.setBounds(427, 314, 111, 31);
		panel_5.add(lblApartment_1);
		
		JLabel label_136 = new JLabel("Type");
		label_136.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_136.setBounds(285, 347, 100, 23);
		panel_5.add(label_136);
		
		lblSharedQuarters = new JLabel("Shared Quarters");
		lblSharedQuarters.setBounds(428, 343, 123, 35);
		panel_5.add(lblSharedQuarters);
		
		JLabel label_138 = new JLabel("Room Number");
		label_138.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_138.setBounds(285, 381, 111, 14);
		panel_5.add(label_138);
		
		label_139 = new JLabel("New label");
		label_139.setBounds(427, 383, 83, 14);
		panel_5.add(label_139);
		
		JLabel label_140 = new JLabel("Start Date");
		label_140.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_140.setBounds(285, 417, 81, 14);
		panel_5.add(label_140);
		
		label_141 = new JLabel("New label");
		label_141.setBounds(427, 419, 184, 14);
		panel_5.add(label_141);
		
		JLabel label_142 = new JLabel("End Date");
		label_142.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_142.setBounds(285, 449, 81, 14);
		panel_5.add(label_142);
		
		label_143 = new JLabel("New label");
		label_143.setBounds(427, 451, 184, 14);
		panel_5.add(label_143);
		
		JButton button_14 = new JButton("Book");
		button_14.setForeground(Color.RED);
		button_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image img6 = new ImageIcon(this.getClass().getResource("/Login-in-icon.png")).getImage();
		button_14.setIcon(new ImageIcon(img6));
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String check =lblSharedQuarters.getText().toString();
				try {
				
				if(check=="New label")
				{
					JOptionPane.showMessageDialog(null, "Please Book a room");
					
				}
				else
				{
					
					int Room_Number1 =  (int) comboBox_5.getSelectedItem();
					String Name =lblSharedQuarters.getText();
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String select ="select * from bookings where Room_Number='"+Room_Number1+"' AND Type ='"+Name+"'";
					Statement state1 = conn1.createStatement();
					ResultSet rss =state1.executeQuery(select);
					if(rss.next()==true) 
					{
					
						JOptionPane.showMessageDialog(null, "Oops room booked");
						
					}
					else 
					{
					
					
					String Full_Name=label_123.getText();
					String Other_Names=label_125.getText();
					String Phone_Number=label_127.getText();
					String Identity_Number=label_129.getText();
					String Password=label_131.getText();
					String Gender=label_133.getText();
					String Category=lblApartment_1.getText();
					String Type = lblSharedQuarters.getText();
					String Room_Number=label_139.getText();
					String Start_Date=label_141.getText().toString();
					String End_Date=label_143.getText().toString();
	
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement stat = con.createStatement();
					String sql = "insert into bookings values ('"+Full_Name+"','"+Other_Names+"','"+Phone_Number+"','"+Identity_Number+"','"+Password+"','"+Gender+"','"+Category+"','"+Type+"','"+Room_Number+"','"+Start_Date+"','"+End_Date+"')";
					stat.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "You have made your booking.");
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement state = conn.createStatement();
					String upt = "update assisted_living set Shared_Quarters=(Shared_Quarters-1) where Description='Vacancy_Count'";
					state.executeUpdate(upt);
					
					}
				}
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		button_14.setBounds(731, 417, 111, 56);
		panel_5.add(button_14);
		
		JLabel lblNewLabel_33 = new JLabel("Time AND Date");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_33.setBounds(285, 50, 133, 14);
		panel_5.add(lblNewLabel_33);
		
		lblNewLabel_34 = new JLabel("New label");
		lblNewLabel_34.setForeground(Color.BLUE);
		lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_34.setBounds(428, 50, 105, 14);
		panel_5.add(lblNewLabel_34);
		
		JLabel lblNewLabel_35 = new JLabel("Date");
		lblNewLabel_35.setBounds(538, 50, 46, 14);
		panel_5.add(lblNewLabel_35);
		
		lblNewLabel_36 = new JLabel("New label");
		lblNewLabel_36.setForeground(Color.BLUE);
		lblNewLabel_36.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_36.setBounds(594, 50, 123, 14);
		panel_5.add(lblNewLabel_36);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_2.addTab("Apartment Style", null, panel_6, null);
		panel_6.setLayout(null);
		
		JButton btnNewButton_15 = new JButton("Back");
		btnNewButton_15.setBackground(Color.MAGENTA);
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image imgg = new ImageIcon(this.getClass().getResource("/back-icon.png")).getImage();
		btnNewButton_15.setIcon(new ImageIcon(imgg));

		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				ApartmentStyle obj = new ApartmentStyle();
				obj.setVisible(true);
			}
		});
		btnNewButton_15.setBounds(10, 427, 137, 43);
		panel_6.add(btnNewButton_15);
		
		JLabel label_144 = new JLabel("Room Number.");
		label_144.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_144.setBounds(10, 30, 115, 50);
		panel_6.add(label_144);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setBounds(135, 30, 73, 50);
		panel_6.add(comboBox_6);
		
		JLabel label_145 = new JLabel("Arrival Date");
		label_145.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_145.setBounds(10, 118, 115, 31);
		panel_6.add(label_145);
		
		dateChooser_12 = new JDateChooser();
		dateChooser_12.setBounds(135, 113, 140, 36);
		panel_6.add(dateChooser_12);
		dateChooser_12.setDateFormatString("yyyy-MM-dd");
		
		JLabel label_146 = new JLabel("Departure Date");
		label_146.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_146.setBounds(10, 174, 115, 31);
		panel_6.add(label_146);
		
		dateChooser_13 = new JDateChooser();
		dateChooser_13.setBounds(135, 174, 140, 31);
		panel_6.add(dateChooser_13);
		dateChooser_13.setDateFormatString("yyyy-MM-dd");
		
		JLabel label_147 = new JLabel("ID NO");
		label_147.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_147.setBounds(10, 231, 100, 23);
		panel_6.add(label_147);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(134, 228, 141, 20);
		panel_6.add(textField_6);
		
		JLabel label_148 = new JLabel("Password");
		label_148.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_148.setBounds(10, 277, 115, 23);
		panel_6.add(label_148);
		
		passwordField_6 = new JPasswordField();
		passwordField_6.setBounds(135, 274, 140, 20);
		panel_6.add(passwordField_6);
		
		JButton button_15 = new JButton("Show Your Booking Details.");
		button_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					

					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String selet ="select Apartment_Style from assisted_living where Description='Vacancy_Count' AND Apartment_Style >=1";
					PreparedStatement pst = cnn.prepareStatement(selet);
					ResultSet rs1 = pst.executeQuery();
					
					if(rs1.next()==true)
					{
					String Identity_Number = textField_6.getText();
					String Password=passwordField_6.getText();
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String sql = "select * from login_details where Identity_Number='"+Identity_Number+"' AND Password='"+Password+"'";
					
					Statement stat = con.createStatement();
					
					ResultSet rs = stat.executeQuery(sql);
					if(rs.next()==true)
					{
						
						
						int Room_Number =  (int) comboBox_6.getSelectedItem();
						String Name =lblApartmentStyle.getText();
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
						String select ="select * from bookings where Room_Number='"+Room_Number+"' AND Type='"+Name+"'";
						Statement state = conn.createStatement();
						ResultSet rss =state.executeQuery(select);
						if(rss.next()==true) 
						{
						
							JOptionPane.showMessageDialog(null, "Oops room booked");
							
						}
						else 
						{
							DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
							System.out.println("You have booked room Number "+Room_Number);
							label_150.setText(rs.getString("Full_Name"));
							label_152.setText(rs.getString("Other_Names"));
							label_154.setText(rs.getString("Phone_Number"));
							label_156.setText(rs.getString("Identity_Number"));
							label_158.setText(rs.getString("Password"));
							label_160.setText(rs.getString("Gender"));
							label_166.setText(comboBox_6.getSelectedItem().toString());
							label_168.setText(df.format(dateChooser_12.getDate()));
							label_170.setText(df.format(dateChooser_13.getDate()));
							
							
							
						}
					}
					else 
					{
						
						JOptionPane.showMessageDialog(null, "Inorrect Identity Number and Password");
					}
					
				}
					else 
					{
						JOptionPane.showMessageDialog(null, "<html>OOps all roomed booked. no vacancy.<br >choose another category</html>");
						Description obj = new Description();
						obj.setVisible(true);
						
					}
					}
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		button_15.setBounds(258, 11, 252, 23);
		panel_6.add(button_15);
		
		JLabel label_149 = new JLabel("Full Name:");
		label_149.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_149.setBounds(285, 89, 81, 19);
		panel_6.add(label_149);
		
		label_150 = new JLabel("New label");
		label_150.setBounds(419, 89, 219, 37);
		panel_6.add(label_150);
		
		JLabel label_151 = new JLabel("Other Names:");
		label_151.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_151.setBounds(285, 133, 100, 19);
		panel_6.add(label_151);
		
		label_152 = new JLabel("New label");
		label_152.setBounds(419, 131, 235, 27);
		panel_6.add(label_152);
		
		JLabel label_153 = new JLabel("Phone Number:");
		label_153.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_153.setBounds(285, 174, 111, 14);
		panel_6.add(label_153);
		
		label_154 = new JLabel("New label");
		label_154.setBounds(419, 168, 202, 31);
		panel_6.add(label_154);
		
		JLabel label_155 = new JLabel("ID No:");
		label_155.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_155.setBounds(285, 207, 81, 14);
		panel_6.add(label_155);
		
		label_156 = new JLabel("New label");
		label_156.setBounds(419, 195, 286, 43);
		panel_6.add(label_156);
		
		JLabel label_157 = new JLabel("Password");
		label_157.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_157.setBounds(285, 233, 100, 19);
		panel_6.add(label_157);
		
		label_158 = new JLabel("New label");
		label_158.setBounds(419, 229, 137, 31);
		panel_6.add(label_158);
		
		JLabel label_159 = new JLabel("Gender");
		label_159.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_159.setBounds(285, 263, 100, 14);
		panel_6.add(label_159);
		
		label_160 = new JLabel("New label");
		label_160.setBounds(419, 254, 312, 36);
		panel_6.add(label_160);
		
		JLabel label_161 = new JLabel("Category");
		label_161.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_161.setBounds(285, 288, 100, 23);
		panel_6.add(label_161);
		
		lblApartment_2 = new JLabel("Assisted Living");
		lblApartment_2.setBounds(419, 286, 111, 31);
		panel_6.add(lblApartment_2);
		
		JLabel label_163 = new JLabel("Type");
		label_163.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_163.setBounds(285, 322, 100, 23);
		panel_6.add(label_163);
		
		lblApartmentStyle = new JLabel("Apartment Style");
		lblApartmentStyle.setBounds(419, 318, 123, 35);
		panel_6.add(lblApartmentStyle);
		
		JLabel label_165 = new JLabel("Room Number");
		label_165.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_165.setBounds(285, 356, 113, 14);
		panel_6.add(label_165);
		
		label_166 = new JLabel("New label");
		label_166.setBounds(419, 358, 91, 14);
		panel_6.add(label_166);
		
		JLabel label_167 = new JLabel("Start Date");
		label_167.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_167.setBounds(285, 381, 81, 14);
		panel_6.add(label_167);
		
		label_168 = new JLabel("New label");
		label_168.setBounds(419, 383, 184, 14);
		panel_6.add(label_168);
		
		JLabel label_169 = new JLabel("End Date");
		label_169.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label_169.setBounds(285, 413, 81, 14);
		panel_6.add(label_169);
		
		label_170 = new JLabel("New label");
		label_170.setBounds(419, 415, 184, 14);
		panel_6.add(label_170);
		
		JButton button_17 = new JButton("Book");
		button_17.setForeground(Color.RED);
		button_17.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image img7 = new ImageIcon(this.getClass().getResource("/Login-in-icon.png")).getImage();
		button_17.setIcon(new ImageIcon(img7));
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String check =label_166.getText().toString();
				try {
				
				if(check=="New label")
				{
					JOptionPane.showMessageDialog(null, "Please Book a room");
					
				}
				else
				{
					
					int Room_Number1 =  (int) comboBox_6.getSelectedItem();
					String Name =lblApartmentStyle.getText();
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					String select ="select * from bookings where Room_Number='"+Room_Number1+"' AND Type ='"+Name+"'";
					Statement state1 = conn1.createStatement();
					ResultSet rss =state1.executeQuery(select);
					if(rss.next()==true) 
					{
					
						JOptionPane.showMessageDialog(null, "Oops room booked");
						
					}
					else 
					{
					
					
					String Full_Name=label_150.getText();
					String Other_Names=label_152.getText();
					String Phone_Number=label_154.getText();
					String Identity_Number=label_156.getText();
					String Password=label_158.getText();
					String Gender=label_160.getText();
					String Category=lblApartment_2.getText();
					String Type = lblApartmentStyle.getText();
					String Room_Number=label_166.getText();
					String Start_Date=label_168.getText().toString();
					String End_Date=label_170.getText().toString();
	
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement stat = con.createStatement();
					String sql = "insert into bookings values ('"+Full_Name+"','"+Other_Names+"','"+Phone_Number+"','"+Identity_Number+"','"+Password+"','"+Gender+"','"+Category+"','"+Type+"','"+Room_Number+"','"+Start_Date+"','"+End_Date+"')";
					stat.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "You have made your booking.");
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System", "root", "Kheriac");
					Statement state = conn.createStatement();
					String upt = "update assisted_living set Apartment_Style=(Apartment_Style-1) where Description='Vacancy_Count'";
					state.executeUpdate(upt);
					
					}
					
				}
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		button_17.setBounds(751, 415, 115, 55);
		panel_6.add(button_17);
		
		JLabel lblNewLabel_37 = new JLabel("Time AND Date");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_37.setBounds(285, 50, 111, 30);
		panel_6.add(lblNewLabel_37);
		
		lblNewLabel_38 = new JLabel("New label");
		lblNewLabel_38.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_38.setForeground(Color.BLUE);
		lblNewLabel_38.setBounds(422, 58, 98, 19);
		panel_6.add(lblNewLabel_38);
		
		JLabel lblNewLabel_39 = new JLabel("Date:");
		lblNewLabel_39.setBounds(530, 60, 46, 14);
		panel_6.add(lblNewLabel_39);
		
		lblNewLabel_40 = new JLabel("New label");
		lblNewLabel_40.setForeground(Color.BLUE);
		lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_40.setBounds(608, 50, 140, 34);
		panel_6.add(lblNewLabel_40);
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date newDate = new Date();
		lblNewLabel_15.setText(dateFormat.format(newDate));
		lblNewLabel_20.setText(dateFormat.format(newDate));
		lblNewLabel_24.setText(dateFormat.format(newDate));
		lblNewLabel_28.setText(dateFormat.format(newDate));
		lblNewLabel_32.setText(dateFormat.format(newDate));
		
		JLabel lblNewLabel_42 = new JLabel("");
		lblNewLabel_42.setBounds(424, 451, 86, 19);
		panel_4.add(lblNewLabel_42);
		lblNewLabel_36.setText(dateFormat.format(newDate));
		lblNewLabel_40.setText(dateFormat.format(newDate));
		
		
		fillComboBox();
		/*fillComboBox_1();
		fillComboBox_2();
		fillComboBox_3();
		fillComboBox_4();
		fillComboBox_5();
		fillComboBox_6();*/
		clock();
		Remove_Details();
	
			
}
}

