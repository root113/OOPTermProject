import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class Withdraw extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdraw frame = new Withdraw();
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
	public Withdraw() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1224, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 1205, 688);
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
		
		JButton button_1 = new JButton("My Account");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(0, 183, 245, 39);
		panel_1.add(button_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setToolTipText("");
		panel_2.setBounds(0, 0, 245, 39);
		panel_1.add(panel_2);
		
		JLabel label = new JLabel("          Deposit");
		label.setFont(new Font("Tahoma", Font.BOLD, 25));
		label.setBounds(0, 0, 245, 39);
		panel_2.add(label);
		
		JButton button_2 = new JButton("Withdraw");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(0, 270, 245, 39);
		panel_1.add(button_2);
		
		JButton button_3 = new JButton("Contact us");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(0, 353, 245, 39);
		panel_1.add(button_3);
		
		JButton button_4 = new JButton("HomePage");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(0, 429, 245, 39);
		panel_1.add(button_4);
		
		JButton button_5 = new JButton("Deposit");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(0, 94, 245, 39);
		panel_1.add(button_5);
		
		JButton button_6 = new JButton("Log Out");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		JLabel label_1 = new JLabel("Total Balance :");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_1.setBounds(23, 26, 637, 31);
		panel_3.add(label_1);
		
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1205, 693);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\brkdn\\Desktop\\men\u00FC.jpg"));
	}
}
