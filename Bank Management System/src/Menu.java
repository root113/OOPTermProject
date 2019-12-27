import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.event.InputMethodListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.InputMethodEvent;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private PreparedStatement ps;
	private ResultSet rs;
	DBConnectFactorySingleton db = new DBConnectFactorySingleton();
	private int id;

	//Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//Create the frame
	public Menu() {
		setBackground(SystemColor.activeCaptionBorder);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1147, 744);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setForeground(UIManager.getColor("RadioButtonMenuItem.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPassword.setBounds(321, 367, 182, 31);
		contentPane.add(lblPassword);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblUsername.setBounds(321, 305, 188, 31);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(525, 302, 243, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setBounds(525, 364, 243, 37);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnRegister.setBounds(659, 430, 109, 31);
		contentPane.add(btnRegister);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegisterPage registerPage = new RegisterPage();
				registerPage.NewScreen();
				dispose();
			}
		});
		
		JButton button = new JButton("Log in");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(db.checkUser(textField.getText(),textField_1.getText())) {
					switch(db.accountType(textField.getText(),textField_1.getText())) {
						case "Admin   ":
							AdminPage adminPage = new AdminPage();
							adminPage.NewScreen();
							dispose();
							break;
						case "Customer":
							CustomerPage customerPage = new CustomerPage();
							customerPage.NewScreen();
							dispose();
							break;
						default:
							JOptionPane.showMessageDialog(null, "Invalid credentials!");
					}
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid username or password.");
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBounds(525, 430, 99, 31);
		contentPane.add(button);
		
		JLabel label = new JLabel("AydinBank");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 35));
		label.setBounds(537, 228, 322, 43);
		contentPane.add(label);
		//Image img = new ImageIcon(this.getClass().getResource("C:\\Users\\brkdn\\Desktop\\ia.jpg")).getImage();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/root113/eclipse-workspace/Project1/img/2.jpeg"));
		lblNewLabel.setBounds(0, 0, 1140, 707);
		contentPane.add(lblNewLabel);
	}
	
}