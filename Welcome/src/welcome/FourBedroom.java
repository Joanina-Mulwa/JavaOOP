package welcome;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class FourBedroom extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FourBedroom frame = new FourBedroom();
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
	public FourBedroom() {
		setTitle("Four Bedroom Apartment.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 578);
		contentPane = new JPanel();
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
					Description obj = new Description();
					obj.setVisible(true);
					dispose();
					obj.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
			}
		});
		btnNewButton.setBounds(10, 487, 116, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("About Four Bedroom Apartment.");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(0, 0, 259, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>A four Bedroom Apartment contains:<br /><br />\r\n=>Four bedroom each with one window.<br /><br />\r\n=>A living room.<br /><br />\r\n=>A dining room.<br /><br />\r\n=>Atleast one bathroom.<br /><br />\r\nHowever, the Assited Living and Apartment Search offres a four bedroom Aartment with the following qualities:<br /><br />\r\n=>Four bedrooms each with four bedrooms.<br /><br />\r\n=>One living room.<br /><br />\r\n=>One dining room.<br /><br />\r\n=>Each bedroom has a bed and a closet.<br /><br />\r\n=>Three bathrooms one which is en-suite(that can be accessed only in one of the rooms making it private. It is in the master bedroom.) <br /><br />\r\n</html>\r\n");
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 21, 652, 441);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("BOOK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Booking obj = new Booking();
						
				
				
				int selectedIndex=obj.tabbedPane.getSelectedIndex();
				System.out.println("Default Index:"+selectedIndex);			
				obj.tabbedPane.setSelectedIndex(obj.tabbedPane.getTabCount()-1);
				selectedIndex=obj.tabbedPane.getSelectedIndex();
				System.out.println("New Index:"+selectedIndex);
				
				obj.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(514, 492, 148, 36);
		contentPane.add(btnNewButton_1);
	}

}
