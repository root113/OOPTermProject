import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerPage extends JFrame {

	private JPanel contentPane;
	private PreparedStatement ps;
	private ResultSet rs;
	DBConnectFactorySingleton db = new DBConnectFactorySingleton();
	private JTextField textField_1;
	private JTextField textField_2;

	//Launch the application
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerPage frame = new CustomerPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame
	public CustomerPage() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1224, 730);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 245, 673);
		panel.setBackground(Color.WHITE);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Click log out to go back.");
			}
		});
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DepositCustomer customerPage = new DepositCustomer();
				customerPage.NewScreen();
				dispose();
			}
		});
		btnDeposit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnDeposit.setBackground(Color.WHITE);
		btnDeposit.setBounds(0, 227, 245, 39);
		panel.add(btnDeposit);
		
		JLabel lblNewLabel_1 = new JLabel("       My Account");
		lblNewLabel_1.setBounds(0, 0, 245, 39);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setLabelFor(this);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("");
		panel_2.setBounds(0, 0, 245, 39);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton button = new JButton("Withdraw");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WithdrawCustomer withdrawPage = new WithdrawCustomer();
				withdrawPage.NewScreen();
				dispose();
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button.setBackground(Color.WHITE);
		button.setBounds(0, 308, 245, 39);
		panel.add(button);
		
		JButton button_6 = new JButton("Contact us");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(0, 387, 245, 39);
		panel.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContactCustomer contactCustomerPage = new ContactCustomer();
				contactCustomerPage.NewScreen();
				dispose();
			}
		});
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setForeground(Color.RED);
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnLogOut.setBackground(Color.WHITE);
		btnLogOut.setBounds(0, 593, 245, 39);
		panel.add(btnLogOut);
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu menuPage = new Menu();
				menuPage.NewScreen();
				dispose();
			}
		});
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.setForeground(Color.RED);
		btnBack_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(0, 509, 245, 39);
		panel.add(btnBack_1);
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Click log out to go back.");
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(-12, -30, 1222, 733);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("/home/root113/eclipse-workspace/Project1/img/1.jpeg"));
		
		JButton btnSeeBalance = new JButton("See Balance");
		btnSeeBalance.setFont(new Font("Dialog", Font.PLAIN, 25));
		btnSeeBalance.setBackground(Color.WHITE);
		btnSeeBalance.setBounds(0, 141, 245, 39);
		panel.add(btnSeeBalance);
		btnSeeBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int balance = 0;
					ps = db.getCon().prepareStatement("SELECT balance FROM bank WHERE username=? AND password=?");
					ps.setString(1, textField_2.getText());
					ps.setString(2, textField_1.getText());
					rs = ps.executeQuery();
					
					while(rs.next()) {
						balance = rs.getInt("balance");
					}
					JOptionPane.showMessageDialog(null, "Balance is: " + balance);
					
				}
				catch(SQLException sql) {
					sql.getCause().printStackTrace();
				}
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(366, 219, 709, 84);
		contentPane.add(panel_3);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Dialog", Font.PLAIN, 25));
		lblPassword.setBounds(21, 26, 637, 31);
		panel_3.add(lblPassword);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(199, 32, 472, 25);
		panel_3.add(textField_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(366, 367, 709, 84);
		contentPane.add(panel_4);
		
		JLabel label = new JLabel("Username :");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Dialog", Font.PLAIN, 25));
		label.setBounds(21, 26, 637, 31);
		panel_4.add(label);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(199, 32, 472, 25);
		panel_4.add(textField_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(0, 0, 1222, 703);
		panel_4.add(label_3);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("/home/root113/eclipse-workspace/Project1/img/2.jpeg"));
		label_1.setBounds(0, -16, 1212, 709);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("/home/root113/eclipse-workspace/Project1/img/1.jpeg"));
		label_2.setBounds(366, 207, 709, 84);
		contentPane.add(label_2);
	}
}
