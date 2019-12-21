import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class RegisterPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JButton btnNewButton;
	private JLabel label_4;
	private JButton button;
	private JTextField textField_4;

	//Launch the application
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterPage frame = new RegisterPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame
	public RegisterPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1218, 744);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(587, 211, 216, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setColumns(10);
		textField_1.setBounds(587, 280, 216, 37);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_2.setColumns(10);
		textField_2.setBounds(587, 355, 216, 37);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_3.setColumns(10);
		textField_3.setBounds(587, 427, 216, 37);
		contentPane.add(textField_3);
		
		label = new JLabel("Password :");
		label.setBackground(Color.BLACK);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label.setBounds(290, 430, 146, 31);
		contentPane.add(label);
		
		label_1 = new JLabel("Name Surname :");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_1.setBounds(290, 214, 188, 31);
		contentPane.add(label_1);
		
		label_2 = new JLabel("Nationality Number :");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_2.setBounds(290, 283, 230, 31);
		contentPane.add(label_2);
		
		label_3 = new JLabel("E-Mail :");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_3.setBounds(290, 358, 131, 31);
		contentPane.add(label_3);
		
		JButton btnRegister = new JButton("Submit");
		btnRegister.setForeground(Color.DARK_GRAY);
		btnRegister.setBackground(SystemColor.infoText);
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnRegister.setBackground(Color.red);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRegister.setBackground(Color.ORANGE);
			}
			
		});
		
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRegister.setBounds(473, 573, 99, 31);
		contentPane.add(btnRegister);
		
		label_4 = new JLabel("Register Page");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Tahoma Bold", Font.PLAIN, 35));
		label_4.setBounds(314, 70, 246, 43);
		contentPane.add(label_4);
		
		button = new JButton("Back");
		button.setForeground(Color.DARK_GRAY);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(Color.BLACK);
		button.setBounds(617, 573, 99, 31);
		contentPane.add(button);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_4.setColumns(10);
		textField_4.setBounds(587, 497, 216, 37);
		contentPane.add(textField_4);
		
		JLabel label_5 = new JLabel("Phone Number :");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 25));
		label_5.setBackground(Color.BLACK);
		label_5.setBounds(290, 500, 190, 31);
		contentPane.add(label_5);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/img/manzara3.jpeg"));
		lblNewLabel.setBounds(0, 0, 1204, 717);
		contentPane.add(lblNewLabel);
	}
}
