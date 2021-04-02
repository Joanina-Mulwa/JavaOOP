package welcome;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class ThreeBedroom extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThreeBedroom frame = new ThreeBedroom();
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
	public ThreeBedroom() {
		setTitle("Three Bedroom Apartment.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 768, 626);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		Image img1 = new ImageIcon(this.getClass().getResource("/Go-back-icon-smallest.png")).getImage();
		btnNewButton.setIcon(new ImageIcon(img1));
		btnNewButton.addActionListener(new ActionListener() {
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
		btnNewButton.setBounds(0, 535, 108, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("About Three Bedroom Apartment.");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 0, 282, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("BOOK");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					
					dispose();
					Booking obj = new Booking();
							
					
					
					int selectedIndex=obj.tabbedPane.getSelectedIndex();
					System.out.println("Default Index:"+selectedIndex);			
					obj.tabbedPane.setSelectedIndex(obj.tabbedPane.getTabCount()-2);
					selectedIndex=obj.tabbedPane.getSelectedIndex();
					System.out.println("New Index:"+selectedIndex);
					
					obj.setVisible(true);
					
					

							
				}
				catch(Exception e1) {
					
					System.out.print("Error:"+e1.getMessage());					
				}
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setBounds(594, 540, 148, 36);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("<html>A three bedroom apartment contains:<br /><br />\r\n=>Minimum of three bedrooms.<br /><br />\r\n=>Each bedroom has atleast one window.<br /><br />\r\n=>Atleast one livingroom.<br /><br />\r\n=>There can be or absence of a dining room.<br /><br />\r\n=>A kitchen.<br /><br />\r\n=>Atleast one bathroom.<br /><br />\r\nHowever, the Assisted Living and Apartment Search offers  three bedroom Apartment with:<br /><br />\r\n=>Three bedrooms each with one window.<br /><br />\r\n=>One living room.<br /><br />\r\n=>One dining room.<br /><br />\r\n=>A kitchen.<br /><br />\r\n=>Each bedroom has a closet and a bed.<br /><br />\r\n=>Three bathrooms one which is ensuite(can only be accesed when in the room making it private. it is placed in the master bedroom).<br /><br />\r\n</html>");
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 30, 687, 522);
		contentPane.add(lblNewLabel_1);
	}

	
}
