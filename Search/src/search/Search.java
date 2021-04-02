package search;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import net.proteanit.sql.DbUtils;

public class Search {

	private JFrame frmWelcomeToThe;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search window = new Search();
					window.frmWelcomeToThe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Search() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeToThe = new JFrame();
		frmWelcomeToThe.setTitle("WELCOME TO THE APARTMENT SEARCH");
		frmWelcomeToThe.setBackground(Color.CYAN);
		frmWelcomeToThe.setBounds(100, 100, 622, 300);
		frmWelcomeToThe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToThe.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("VIEW BOOKS");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver"); 
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_Booking_System","root","Kheriac");
					
					
					
					String sql="select * from Apartment_Types";
					PreparedStatement pst = con.prepareStatement(sql);
					ResultSet rs = pst.executeQuery();
					table.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception e1) {
					System.out.println(e1);
					
				}
	             

			}

			
		});
		btnNewButton.setBounds(10, 11, 147, 23);
		frmWelcomeToThe.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("VIEW USERS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*try{
					JFrame f = new JFrame("Users List");
                //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
                 
                Connection connection = connect();
                String sql="select * from users"; //retrieve all users
              
                    Statement stmt = connection.createStatement();
                     stmt.executeUpdate("USE LIBRARY"); //use database
                    stmt=connection.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    JTable book_list= new JTable();
                    //book_list.setModel(DbUtils.resultSetToTableModel(rs)); 
                    //mention scroll bar
                    JScrollPane scrollPane = new JScrollPane(book_list);
 
                    f.getContentPane().add(scrollPane); //add scrollpane
                    f.setSize(800, 400); //set size for frame
                    f.setVisible(true);
                    f.setLocationRelativeTo(null);
                } 
				catch (Exception e1) {
                    // TODO Auto-generated catch block
                     JOptionPane.showMessageDialog(null, e1);
                }  
                */

			}

			
		});
		btnNewButton_1.setBounds(10, 45, 147, 23);
		frmWelcomeToThe.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("VIEW ISSUED BOOKS");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               /* try {
                	JFrame f = new JFrame("Users List");
                
                //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 
                 
                Connection connection = connect();
                String sql="select * from issued";
               
                    Statement stmt = connection.createStatement();
                     stmt.executeUpdate("USE LIBRARY");
                    stmt=connection.createStatement();
                    ResultSet rs=stmt.executeQuery(sql);
                    JTable book_list= new JTable();
                    //book_list.setModel(DbUtils.resultSetToTableModel(rs)); 
                     
                    JScrollPane scrollPane = new JScrollPane(book_list);
 
                    f.getContentPane().add(scrollPane);
                    f.setSize(800, 400);
                    f.setVisible(true);
                    f.setLocationRelativeTo(null);
                
                } 
                catch (Exception e1) {
                    
                     JOptionPane.showMessageDialog(null, e1);
                }
                */
             }   
			
		});
		btnNewButton_2.setBounds(10, 88, 154, 23);
		frmWelcomeToThe.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ISSUE BOOKS");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*try {
                JFrame g = new JFrame("Enter Details");
                //g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //create labels
                JLabel l1,l2,l3,l4;  
                l1=new JLabel("Book ID(BID)");  // Label 1 for Book ID
                l1.setBounds(30,15, 100,30); 
                 
                 
                l2=new JLabel("User ID(UID)");  //Label 2 for user ID
                l2.setBounds(30,53, 100,30); 
                 
                l3=new JLabel("Period(days)");  //Label 3 for period
                l3.setBounds(30,90, 100,30); 
                 
                l4=new JLabel("Issued Date(DD-MM-YYYY)");  //Label 4 for issue date
                l4.setBounds(30,127, 150,30); 
                 
                JTextField F_bid = new JTextField();
                F_bid.setBounds(110, 15, 200, 30);
                 
                 
                JTextField F_uid=new JTextField();
                F_uid.setBounds(110, 53, 200, 30);
                 
                JTextField F_period=new JTextField();
                F_period.setBounds(110, 90, 200, 30);
                 
                JTextField F_issue=new JTextField();
                F_issue.setBounds(180, 130, 130, 30);   
				}
				
				catch(Exception e1){
					System.out.println(e1);
					
				}
				*/
 

			}
		});
		btnNewButton_3.setBounds(10, 132, 154, 23);
		frmWelcomeToThe.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("ADD USER");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
              /* try {
				JFrame g = new JFrame("Enter User Details"); //Frame to enter user details
                //g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //Create label 
                JLabel l1,l2;  
                l1=new JLabel("USERNAME");  //label 1 for username
                l1.setBounds(30,15, 100,30); 
                 
                 
                l2=new JLabel("PASSWORD");  //label 2 for password
                l2.setBounds(30,50, 100,30); 
                 
                //set text field for username 
                JTextField F_user = new JTextField();
                F_user.setBounds(110, 15, 200, 30);
                 
                //set text field for password
                JPasswordField F_pass=new JPasswordField();
                F_pass.setBounds(110, 50, 200, 30);
                //set radio button for admin
                JRadioButton a1 = new JRadioButton("Admin");
                a1.setBounds(55, 80, 200,30);
                //set radio button for user
                JRadioButton a2 = new JRadioButton("User");
                a2.setBounds(130, 80, 200,30);
                //add radio buttons
                ButtonGroup bg=new ButtonGroup();    
                bg.add(a1);bg.add(a2);  
               }
               catch(Exception e1) {
            	   System.out.print(e1);
            	   
               }
               */
                 

			}
		});
		btnNewButton_4.setBounds(231, 11, 159, 23);
		frmWelcomeToThe.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("ADD BOOK");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               /* try {
				JFrame g = new JFrame("Enter Book Details");
                //g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // set labels
                JLabel l1,l2,l3;  
                l1=new JLabel("Book Name");  //lebel 1 for book name
                l1.setBounds(30,15, 100,30); 
                 
                 
                l2=new JLabel("Genre");  //label 2 for genre
                l2.setBounds(30,53, 100,30); 
                 
                l3=new JLabel("Price");  //label 2 for price
                l3.setBounds(30,90, 100,30); 
                 
                //set text field for book name
                JTextField F_bname = new JTextField();
                F_bname.setBounds(110, 15, 200, 30);
                 
                //set text field for genre 
                JTextField F_genre=new JTextField();
                F_genre.setBounds(110, 53, 200, 30);
                //set text field for price
                JTextField F_price=new JTextField();
                F_price.setBounds(110, 90, 200, 30);
                }
                catch(Exception e1) {
                	System.out.print(e1);
                }
                */
                         

			}
		});
		btnNewButton_5.setBounds(231, 45, 159, 23);
		frmWelcomeToThe.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("RETURN BOOK");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
                JFrame g = new JFrame("Enter Details");
                //g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //set labels 
                JLabel l1,l2,l3,l4;  
                l1=new JLabel("Issue ID(IID)");  //Label 1 for Issue ID
                l1.setBounds(30,15, 100,30); 
                
                 
                l4=new JLabel("Return Date(DD-MM-YYYY)");  
                l4.setBounds(30,50, 150,30); 
                 
                JTextField F_iid = new JTextField();
                F_iid.setBounds(110, 15, 200, 30);
                 
                 
                JTextField F_return=new JTextField();
                F_return.setBounds(180, 50, 130, 30);
             
 
                JButton create_but=new JButton("Return");//creating instance of JButton to mention return date and calculcate fine
                create_but.setBounds(130,170,80,25);//x axis, y axis, width, height 
                create_but.addActionListener(new ActionListener() {
                     
                    public void actionPerformed(ActionEvent e){ 
                    	try {
                     
                    String iid = F_iid.getText();
                    String return_date = F_return.getText();
                     
                    Connection connection = connect();
                     
                    try {
                    Statement stmt = connection.createStatement();
                     stmt.executeUpdate("USE LIBRARY");
                     //Intialize date1 with NULL value
                     String date1=null;
                     String date2=return_date; //Intialize date2 with return date
                     
                     //select issue date
                     ResultSet rs = stmt.executeQuery("SELECT ISSUED_DATE FROM ISSUED WHERE IID="+iid);
                     while (rs.next()) {
                         date1 = rs.getString(1);
                          
                       }
                      
                     
                            Date date_1=(Date) new SimpleDateFormat("dd-MM-yyyy").parse(date1);
                            Date date_2=(Date) new SimpleDateFormat("dd-MM-yyyy").parse(date2);
                            //subtract the dates and store in diff
                            long diff = date_2.getTime() - date_1.getTime();
                            //Convert diff from milliseconds to days
                            ex.days=(int)(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
                             
                             
                        } catch (ParseException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                      
                     
                     //update return date
                     stmt.executeUpdate("UPDATE ISSUED SET RETURN_DATE='"+return_date+"' WHERE IID="+iid);
                     g.dispose();
                      
 
                     Connection connection1 = connect();
                     Statement stmt1 = connection1.createStatement();
                     stmt1.executeUpdate("USE LIBRARY");                
                    ResultSet rs1 = stmt1.executeQuery("SELECT PERIOD FROM ISSUED WHERE IID="+iid); //set period
                    String diff=null; 
                    while (rs1.next()) {
                         diff = rs1.getString(1);
                          
                       }
                    int diff_int = Integer.parseInt(diff);
                    
				    if(ex.days&amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;amp;gt;diff_int)
				    { //If number of days are more than the period then calculcate fine
                         
                        //System.out.println(ex.days);
                        int fine = (ex.days-diff_int)*10; //fine for every day after the period is Rs 10.
                        //update fine in the system
                        stmt1.executeUpdate("UPDATE ISSUED SET FINE="+fine+" WHERE IID="+iid);  
                        String fine_str = ("Fine: Rs. "+fine);
                        JOptionPane.showMessageDialog(null,fine_str);
                         
                    }
 
                     JOptionPane.showMessageDialog(null,"Book Returned!");
                      
                    }
                             
                     
                    catch (Exception e1) {
                        // TODO Auto-generated catch block
                         JOptionPane.showMessageDialog(null, e1);
                    }   
                     
                    }

					
                     
                }
                    	); 
                    	*/
                                 
    }
    });
     
  
		btnNewButton_6.setBounds(231, 88, 159, 23);
		frmWelcomeToThe.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("CREATE/RESET");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*try {
                String USERNAME = F_user.getText();
                String PASSWORD = F_pass.getText();
                Boolean admin = false;
                 
                if(a1.isSelected()) {
                    admin=true;
                }
                 
                Connection connection = connect();
                 
                
                Statement stmt = connection.createStatement();
                 stmt.executeUpdate("USE LIBRARY");
                 stmt.executeUpdate("INSERT INTO USERS(USERNAME,PASSWORD,ADMIN) VALUES ('"+USERNAME+"','"+PASSWORD+"',"+admin+")");
                 JOptionPane.showMessageDialog(null,"User added!");
                 ((Window) g).dispose();
                  
                }
                 
                catch (Exception e1) {
                     JOptionPane.showMessageDialog(null, e1);
                } 
                */  
                 
                }

			
                 
            });
		btnNewButton_7.setBounds(241, 132, 149, 23);
		frmWelcomeToThe.getContentPane().add(btnNewButton_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(439, 62, 157, 164);
		frmWelcomeToThe.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}

