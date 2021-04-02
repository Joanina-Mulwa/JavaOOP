package welcome;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Scrollbar;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class OneBedroom extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OneBedroom frame = new OneBedroom();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OneBedroom() {
		setBackground(Color.BLACK);
		setForeground(Color.BLACK);
		setTitle("One Bedroom Apartment.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 782, 615);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("BOOK");
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				dispose();
				Booking obj = new Booking();
						
				
				
				int selectedIndex=obj.tabbedPane.getSelectedIndex();
				System.out.println("Default Index:"+selectedIndex);			
				obj.tabbedPane.setSelectedIndex(obj.tabbedPane.getTabCount()-4);
				selectedIndex=obj.tabbedPane.getSelectedIndex();
				System.out.println("New Index:"+selectedIndex);
				
				obj.setVisible(true);
				}
				catch(Exception e1) {
					System.out.print("Error:"+e1.getMessage());
				}
			}
			
		});
		btnNewButton.setBounds(497, 531, 169, 32);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("About One Bedroom Apartment.");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBackground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(0, 0, 246, 32);
		contentPane.add(lblNewLabel_1);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		Image img1 = new ImageIcon(this.getClass().getResource("/Go-back-icon-smallest.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img1));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					Description obj = new Description();
					obj.setVisible(true);
					obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
					
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
		});
		btnNewButton_1.setBounds(0, 527, 123, 41);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("<html>In general, the one bedroom apartment is expected to contain four basic components:<br /><br />\r\n=>A bedroom<br /><br />\r\n=>One living room<br /><br />\r\n=>A kitchen<br /><br />\r\n=>Atleast one bathroom<br /><br />\r\nOther features may vary from the owners and place of view.<br /><br />\r\nHowever, the Assisted Livng and Apartment search provides a one bedroom apartments with :<br /><br />\r\n=>One bedroom completely furnished <br /><br />\r\n=>One living room.<br /><br />\r\n=>A kitchen with kitchen equipments<br /><br />\r\n=> Each bedroom has a bed and closet.<br /><br />\r\n=>One bathroom.<br /><br />\r\n</html>");
		lblNewLabel.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, -21, 532, 550);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(197, 538, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
