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
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class TwoBedroom extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoBedroom frame = new TwoBedroom();
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
	public TwoBedroom() {
		setTitle("Two Bedroom Apartment.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 638);
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
		btnNewButton.setBounds(10, 547, 107, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("About two Bedroom apartment.");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 0, 255, 31);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>\r\nTwo bedroom apartments are probably the most desirable of all layouts.A two bedroom apartment must contain:<br /><br />\r\n=>Two separate bedrooms each with atleast two windows.<br /><br />\r\n=>Atleast one closet.<br /><br />\r\n=>Room enough for , at a minimum, a bed and a dresser.<br /><br />\r\n=>Sepatate living room<br /><br />\r\n=>Kitchen<br /><br />\r\n=>Atleast one bathroom.<br /><br />\r\nHowever, the Assisted Living and Apartment Search offers a two bedroom apartment with:<br /><br/>\r\n=>Two separate bedrooms each with two windows<br /><br />\r\n=>Each bedroom has a one bed, one closet and a dresser<br /><br />\r\n=>A kitchen.<br /><br />\r\n=>One living room.<br /><br />\r\n=>Two bathrooms of which one is ensuite(this one bathroom is only accessible through the bedroom and is a private bath which is placed in the master bedroom)<br /><br />\r\n</html>");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.CYAN);
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 25, 664, 499);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("BOOK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					dispose();
					Booking obj = new Booking();
							
					
					
					int selectedIndex=obj.tabbedPane.getSelectedIndex();
					System.out.println("Default Index:"+selectedIndex);			
					obj.tabbedPane.setSelectedIndex(obj.tabbedPane.getTabCount()-3);
					selectedIndex=obj.tabbedPane.getSelectedIndex();
					System.out.println("New Index:"+selectedIndex);
					
					obj.setVisible(true);
				
				}
				catch(Exception e1) {
					System.out.print("Error:"+e1.getMessage());
					
				}
			}
		});
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(585, 555, 158, 37);
		contentPane.add(btnNewButton_1);
	}

}
