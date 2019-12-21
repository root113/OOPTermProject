import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Deposit extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	//Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit frame = new Deposit();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame.
	public Deposit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1224, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBounds(5, 5, 1254, 720);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBackground(Color.DARK_GRAY);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 10, 245, 673);
		panel.add(panel_1);
		
		JButton button = new JButton("Back");
		button.setForeground(Color.RED);
		button.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button.setBackground(Color.WHITE);
		button.setBounds(0, 427, 245, 39);
		panel_1.add(button);
		
		textField = new JTextField("Deposit");
		textField.setBounds(0, 0, 245, 39);
		panel_1.add(textField);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField.setColumns(10);
		textField.setBackground(new Color(255, 250, 250));
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 245, 39);
		panel_1.add(panel_2);
		
		JButton button_2 = new JButton("Withdraw");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(0, 221, 245, 39);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Contact us");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(0, 290, 245, 39);
		panel_1.add(button_3);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setForeground(Color.RED);
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnLogOut.setBackground(Color.WHITE);
		btnLogOut.setBounds(0, 536, 245, 39);
		panel_1.add(btnLogOut);
		
		JButton btnMyAccount = new JButton("My Account");
		btnMyAccount.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnMyAccount.setBackground(Color.WHITE);
		btnMyAccount.setBounds(0, 135, 245, 39);
		panel_1.add(btnMyAccount);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 245, 675);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\brkdn\\Desktop\\men\u00FC.jpg"));
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(366, 33, 709, 84);
		panel.add(panel_3);
		
		JLabel label = new JLabel("Total Balance :");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(21, 26, 637, 31);
		panel_3.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(202, 26, 456, 31);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(366, 318, 709, 84);
		panel.add(panel_4);
		
		JLabel lblAmountOfDeposit = new JLabel("Amount of Deposit :");
		lblAmountOfDeposit.setForeground(Color.BLACK);
		lblAmountOfDeposit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblAmountOfDeposit.setBounds(10, 20, 637, 31);
		panel_4.add(lblAmountOfDeposit);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(233, 26, 466, 31);
		panel_4.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\brkdn\\Desktop\\men\u00FC.jpg"));
		lblNewLabel.setBounds(0, 0, 1206, 691);
		panel.add(lblNewLabel);
	}

}
