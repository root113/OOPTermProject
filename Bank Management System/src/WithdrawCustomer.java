import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class WithdrawCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private PreparedStatement ps;
	private ResultSet rs;
	DBConnect db = new DBConnect();
	private JTextField textField_2;

	//Launch the application
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithdrawCustomer frame = new WithdrawCustomer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame
	public WithdrawCustomer() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1224, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 0, 1205, 688);
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.DARK_GRAY);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 10, 245, 673);
		panel.add(panel_1);
		
		JButton button = new JButton("Back");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button.setBackground(Color.WHITE);
		button.setBounds(0, 529, 245, 39);
		panel_1.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerPage customerPage = new CustomerPage();
				customerPage.NewScreen();
				dispose();
			}
		});
		
		JButton button_1 = new JButton("My Account");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(0, 183, 245, 39);
		panel_1.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerPage customerPage = new CustomerPage();
				CustomerPage.NewScreen();
				dispose();
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setToolTipText("");
		panel_2.setBounds(0, 0, 245, 39);
		panel_1.add(panel_2);
		
		JLabel lblWithdraw = new JLabel("        Withdraw");
		lblWithdraw.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblWithdraw.setBounds(0, 0, 245, 39);
		panel_2.add(lblWithdraw);
		
		JButton button_2 = new JButton("Withdraw");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(0, 270, 245, 39);
		panel_1.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Click save to accept changes.");
			}
		});
		
		JButton button_3 = new JButton("Contact us");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(0, 353, 245, 39);
		panel_1.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactCustomer  contactPage = new ContactCustomer();
				contactPage.NewScreen();
				dispose();
			}
		});
		
		JButton button_4 = new JButton("Save");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ps = db.getCon().prepareStatement("UPDATE bank SET balance=(balance-?) WHERE username=? AND password=?;");
					ps.setInt(1, Integer.parseInt(textField_1.getText()));
					ps.setString(2, textField.getText());
					ps.setString(3, textField_2.getText());
					ps.execute();
					
					JOptionPane.showMessageDialog(null, "Withdrawal successfull.");
				}
				catch(SQLException sql) {
					sql.getCause().printStackTrace();
				}
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(0, 429, 245, 39);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("Deposit");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepositCustomer customerPage = new DepositCustomer();
				customerPage.NewScreen();
				dispose();
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(0, 94, 245, 39);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("Log Out");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menuPage = new Menu();
				menuPage.NewScreen();
				dispose();
			}
		});
		button_6.setForeground(Color.RED);
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(0, 608, 245, 39);
		panel_1.add(button_6);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\brkdn\\Desktop\\men\u00FC.jpg"));
		lblNewLabel_1.setBounds(0, 37, 245, 636);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(366, 33, 709, 84);
		panel.add(panel_3);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(Color.BLACK);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblUsername.setBounds(23, 26, 637, 31);
		panel_3.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(198, 26, 479, 31);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(366, 308, 709, 84);
		panel.add(panel_4);
		
		JLabel lblAmountOfWithdraw = new JLabel("Amount of withdraw :");
		lblAmountOfWithdraw.setForeground(Color.BLACK);
		lblAmountOfWithdraw.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAmountOfWithdraw.setBounds(23, 26, 637, 31);
		panel_4.add(lblAmountOfWithdraw);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(274, 26, 403, 31);
		panel_4.add(textField_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(Color.WHITE);
		panel_5.setBounds(366, 160, 709, 84);
		panel.add(panel_5);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblPassword.setBounds(23, 26, 637, 31);
		panel_5.add(lblPassword);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(198, 26, 479, 31);
		panel_5.add(textField_2);
	}
}
