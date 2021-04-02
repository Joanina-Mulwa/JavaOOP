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
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class IndividualRooms extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IndividualRooms frame = new IndividualRooms();
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
	public IndividualRooms() {
		setTitle("Individual Rooms Assisted Living.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 627, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(Color.BLACK);
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
		btnNewButton.setBounds(10, 346, 107, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("About Individual Rooms Assisted Living.");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 0, 356, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>\r\nIn the Asisted Living and Apartment Search, we offer individual rooms in which:<br /><br />\r\n=>Seniors have fully furnished private bedroom which may or may not include a private bathrooom.\"The option of private catres for senior fpr wnom privacy is important\".<br /><br />\r\n=> The other living spaces such as a sitting room or kitchen would be shared with other residents.<br /><br />\r\n=>All the rooms offered are fully furnished.<br /><br />\r\n=>A private room is typically  more expensive than a shared room, so the option caters to the senior who is willing to spend more money in exchange for more privacy<br /><br />\r\n  </html>");
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 25, 455, 303);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("BOOK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Booking obj = new Booking();
				
				int selectedIndex=obj.tabbedPane_1.getSelectedIndex();
				System.out.println("Default Index:"+selectedIndex);
				obj.tabbedPane_1.setSelectedIndex(obj.tabbedPane_1.getTabCount()-1);
				selectedIndex=obj.tabbedPane_1.getSelectedIndex();
				System.out.println("New Index:"+selectedIndex);
				
				int selectedIndex1=obj.tabbedPane_2.getSelectedIndex();
				System.out.println("Default Index:"+selectedIndex1);
				obj.tabbedPane_2.setSelectedIndex(obj.tabbedPane_2.getTabCount()-3);
				selectedIndex1=obj.tabbedPane_2.getSelectedIndex();
				System.out.println("New Index:"+selectedIndex1);
				obj.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(444, 353, 107, 34);
		contentPane.add(btnNewButton_1);
	}
}
