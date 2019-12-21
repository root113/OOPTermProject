import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
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

public class CustomerPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
			}
		});
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setForeground(Color.RED);
		btnLogOut.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnLogOut.setBackground(Color.WHITE);
		btnLogOut.setBounds(0, 593, 245, 39);
		panel.add(btnLogOut);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.setForeground(Color.RED);
		btnBack_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBack_1.setBackground(Color.WHITE);
		btnBack_1.setBounds(0, 509, 245, 39);
		panel.add(btnBack_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 1222, 703);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\brkdn\\Desktop\\men\u00FC.jpg"));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(366, 33, 709, 84);
		panel_1.setBackground(Color.WHITE);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Total Balance :");
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(21, 26, 637, 31);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(199, 32, 472, 25);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\brkdn\\Desktop\\men\u00FC.jpg"));
		label_1.setBounds(0, 0, 1222, 703);
		panel_1.add(label_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\brkdn\\Desktop\\men\u00FC.jpg"));
		lblNewLabel_3.setBounds(0, 0, 1210, 693);
		contentPane.add(lblNewLabel_3);
	}
}
