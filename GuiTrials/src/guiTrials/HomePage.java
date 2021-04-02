package guiTrials;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class HomePage extends JFrame {

	private JPanel contentPane;
	
	public static javax.swing.JTextField textField_11;
	public static javax.swing.JTextField textField_12;
	public static javax.swing.JLabel lblNewLabel;
	//public static javax.swing.JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_11 = new JTextField();
		textField_11.setBounds(111, 56, 86, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(111, 157, 86, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(108, 207, 46, 14);
		contentPane.add(lblNewLabel);
		
		
	}
}

