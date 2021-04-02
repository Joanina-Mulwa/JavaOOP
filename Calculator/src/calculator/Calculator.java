package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Calculator {

	private JFrame frame;
	private JTextField txtNumber_1;
	private JTextField txtNumber_2;
	private JTextField txtAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 654, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnbuttonadd = new JButton("ADD");
		btnbuttonadd.setBounds(49, 144, 89, 23);
		btnbuttonadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0){
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(txtNumber_1.getText());
					num2=Integer.parseInt(txtNumber_2.getText());
					ans=num1+num2;
					txtAnswer.setText(Integer.toString(ans));
				}
				catch(Exception e)
				{
				JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
			}
		});
		frame.getContentPane().setLayout(null);
		btnbuttonadd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnbuttonadd.setBackground(Color.CYAN);
		frame.getContentPane().add(btnbuttonadd);
		
		JLabel lblAdittion = new JLabel("ADDITION OF THE NUMBERS.");
		lblAdittion.setBounds(64, 23, 313, 23);
		lblAdittion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdittion.setBackground(new Color(240, 240, 240));
		frame.getContentPane().add(lblAdittion);
		
		JLabel lblNUMBER_1 = new JLabel("ENTER FIRST NUMBER :");
		lblNUMBER_1.setBounds(10, 57, 159, 14);
		lblNUMBER_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblNUMBER_1);
		
		JLabel lblNUMBER_2 = new JLabel("ENTER SECOND NUMBER:");
		lblNUMBER_2.setBounds(10, 103, 159, 14);
		lblNUMBER_2.setBackground(Color.YELLOW);
		lblNUMBER_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(lblNUMBER_2);
		
		txtNumber_1 = new JTextField();
		txtNumber_1.setBounds(220, 57, 119, 20);
		frame.getContentPane().add(txtNumber_1);
		txtNumber_1.setColumns(10);
		
		txtNumber_2 = new JTextField();
		txtNumber_2.setBounds(219, 101, 120, 20);
		frame.getContentPane().add(txtNumber_2);
		txtNumber_2.setColumns(10);
		
		JButton btnbuttonminus = new JButton("SUBTRACT");
		btnbuttonminus.setBounds(227, 144, 112, 23);
		btnbuttonminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {
					num1=Integer.parseInt(txtNumber_1.getText());
					num2=Integer.parseInt(txtNumber_2.getText());
					ans=num1-num2;
					txtAnswer.setText(Integer.toString(ans));
				}
				catch(Exception e)
				{
				JOptionPane.showMessageDialog(null, "Enter a valid number");
				}
			}
		});
		btnbuttonminus.setBackground(Color.CYAN);
		btnbuttonminus.setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().add(btnbuttonminus);
		
		JLabel lblanswer = new JLabel("The Answer");
		lblanswer.setBounds(49, 214, 120, 23);
		lblanswer.setForeground(Color.CYAN);
		lblanswer.setBackground(Color.BLUE);
		lblanswer.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblanswer);
		
		txtAnswer = new JTextField();
		txtAnswer.setBounds(227, 188, 112, 49);
		frame.getContentPane().add(txtAnswer);
		txtAnswer.setColumns(10);
		
		JButton btnNewButton = new JButton("CLICK ME!");
		btnNewButton.setBounds(220, 289, 269, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Yees you have managed to coplete the calculation!");
			}
		});
		btnNewButton.setFont(new Font("Vivaldi", Font.BOLD, 30));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("To Message");
		btnNewButton_1.setBounds(138, 248, 382, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "shows message:calculation is done");
			}
		});
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Vivaldi", Font.BOLD, 30));
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}

