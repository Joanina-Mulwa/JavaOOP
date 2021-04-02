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

public class ApartmentStyle extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApartmentStyle frame = new ApartmentStyle();
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
	public ApartmentStyle() {
		setTitle("Apartment Style Assisted Living.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 460);
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
		btnNewButton.setBounds(10, 372, 107, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("About Apartment Style Assisted Living.");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 0, 303, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("<html>\r\nIn the Assisted Living and Apartment Search, we offer Assisted Living rooms which are more of apartments and hence Apartment Style Living Room.<br /><br />\r\n->Residents live in their own units, which may include:<br /><br />\r\n=>The units are complrtrly furnished.<br /><br />\r\n=>A living quarter.<br /><br />\r\n=>Private bathroom.<br /><br />\r\n=>A small cooking area.<br /><br />\r\n- These private apartments typically cater to seniors who want and are able to live independently, but may require some assistance.<br /><br />\r\n\r\n</html>");
		lblNewLabel_1.setFont(new Font("Cambria", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 25, 480, 315);
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
				obj.tabbedPane_2.setSelectedIndex(obj.tabbedPane_2.getTabCount()-1);
				selectedIndex1=obj.tabbedPane_2.getSelectedIndex();
				System.out.println("New Index:"+selectedIndex1);
				obj.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(506, 372, 100, 38);
		contentPane.add(btnNewButton_1);
	}

}
