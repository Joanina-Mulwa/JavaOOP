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

public class SharedQuarters extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SharedQuarters frame = new SharedQuarters();
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
	public SharedQuarters() {
		setTitle("Shared Quarters Assisted Living.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 711, 484);
		contentPane = new JPanel();
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
		btnNewButton.setBounds(0, 393, 109, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("About Shared Quarters Assisted Living.");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 0, 317, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>\r\nThe Assisted Living and Apartment Search offers shared quarters in which:<br /><br />\r\n=>Two or more seniors are allocated a single bedroom in a dorm-style detup. This arrangement means sharing a room with a roommate.<br /><br />\r\n=>This option is the most affordable living space and it's probably best suited for seniors who need a more affordable living option and where saving money could be a key priority.<br /><br />\r\n=>In addition, a shared room can provide more of a social aspect pr even a companion to the senior, so may be a good way to combat loniliness.  <br /><br />\r\n=>If you opt for a shared room, its important to work with the community at the assisted living community to make sure to find someone compatible in lifestyle and preferences.\r\n</html>");
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 25, 563, 269);
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
				obj.tabbedPane_2.setSelectedIndex(obj.tabbedPane_2.getTabCount()-2);
				selectedIndex1=obj.tabbedPane_2.getSelectedIndex();
				System.out.println("New Index:"+selectedIndex1);
				obj.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(535, 399, 100, 35);
		contentPane.add(btnNewButton_1);
	}

}
