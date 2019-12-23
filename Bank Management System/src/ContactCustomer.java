import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContactCustomer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactCustomer frame = new ContactCustomer();
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
	public ContactCustomer() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1201, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("E-mail");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "grunge@grunge.com");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(631, 226, 133, 45);
		contentPane.add(btnNewButton);
		
		JButton btnPhonenumber = new JButton("Phone");
		btnPhonenumber.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnPhonenumber.setBounds(158, 113, 211, 39);
		contentPane.add(btnPhonenumber);
		btnPhonenumber.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "0212 444 44 44");
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Dialog", Font.BOLD, 25));
		btnBack.setBounds(268, 297, 133, 45);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerPage customerPage = new CustomerPage();
				CustomerPage.NewScreen();
				dispose();
			}
		});
	}
}
