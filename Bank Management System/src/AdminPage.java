import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AdminPage extends JFrame {

    private JPanel contentPane;
    private JTable table;
    private JButton button;
    private JButton button_1;
    private JButton button_2;
    private JButton button_3;
    private JLabel lblNewLabel;

    //Launch the application
    public static void NewScreen() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminPage frame = new AdminPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    //Create the frame
    public AdminPage() {
        setTitle("Truncate");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setBounds(100, 100, 1222, 719);
        contentPane = new JPanel();
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(28, 28, 1155, 171);
        contentPane.add(scrollPane);
        
        table = new JTable();
        table.setBackground(new Color(255, 250, 240));
        table.setColumnSelectionAllowed(true);
        table.setCellSelectionEnabled(true);
        scrollPane.setViewportView(table);
        
        //Comboboxta oldugu gibi burda da bir model olusturuyoruz.
        //Fakat comboboxtan farkli olarak 2 adet dizi aliyor.
        //ilk dizi 1 boyutlu dizi bu dizi Tablein sutun adlari
        //ikinci dizi 2 boyutlu olacak bu dizi Tablein satirlarini alicaktir.
        
        String []ilkdizi=new String[7];
        ilkdizi[0]="No";
        ilkdizi[1]="Isim";
        ilkdizi[2]="Soyisim" ;
        ilkdizi[3]="Numara";
        ilkdizi[5]="E-mail";
        ilkdizi[6]="Tc Kimlik";

        
        String [][]ikincidizi=new String[4][3];
        ikincidizi[0][0]="10";
        ikincidizi[0][1]="R�dvan";
        ikincidizi[0][2]="�ak�r";
        
        ikincidizi[1][0]="20";
        ikincidizi[1][1]="Aykut";
        ikincidizi[1][2]="Y�lmaz";
        
        ikincidizi[2][0]="55";
        ikincidizi[2][1]="Ethem";
        ikincidizi[2][2]="�anver";
        
        ikincidizi[3][0]="30";
        ikincidizi[3][1]="Ahmet";
        ikincidizi[3][2]="Akp�nar";
        
        //Dizileri model kismina aktariyoruz.
        TableModel tablemodel=new DefaultTableModel(ikincidizi,ilkdizi);
        
        //Modelide Table aktariyoruz.
        table.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        		{null, null, null, null, null, null, null},
        	},
        	new String[] {
        		"Name", "Surname", "Account Type", "E-mail", "Phone Number", "Username", "Balance"
        	}
        ));
        
        button = new JButton("Withdraw");
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Withdraw withdrawPage = new Withdraw();
        		withdrawPage.NewScreen();
        		dispose();
        	}
        });
        button.setFont(new Font("Tahoma", Font.PLAIN, 25));
        button.setBackground(Color.WHITE);
        button.setBounds(628, 226, 245, 39);
        contentPane.add(button);
        
        button_1 = new JButton("Deposit");
        button_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
        button_1.setBackground(Color.WHITE);
        button_1.setBounds(30, 226, 245, 39);
        contentPane.add(button_1);
        button_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Deposit depositPage = new Deposit();
        		depositPage.NewScreen();
        		dispose();
        	}
        });
        
        button_2 = new JButton("Exit");
        button_2.setForeground(Color.RED);
        button_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Menu menuPage = new Menu();
        		menuPage.NewScreen();
        		dispose();
        	}
        });
        button_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
        button_2.setBackground(Color.WHITE);
        button_2.setBounds(919, 226, 245, 39);
        contentPane.add(button_2);
        
        button_3 = new JButton("Contact");
        button_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		Contact contactPage = new Contact();
        		contactPage.NewScreen();
        		dispose();
        	}
        });
        button_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
        button_3.setBackground(Color.WHITE);
        button_3.setBounds(323, 226, 245, 39);
        contentPane.add(button_3);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\brkdn\\Desktop\\men\u00FC.jpg"));
        lblNewLabel.setBounds(0, 0, 1284, 682);
        contentPane.add(lblNewLabel);
        //��
    }
}