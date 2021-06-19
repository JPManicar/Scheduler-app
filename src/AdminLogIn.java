

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class AdminLogIn extends JFrame {

	private JPanel contentPane;
	private JTextField txtFldUser;
	private JTextField txtFldPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogIn frame = new AdminLogIn();
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
	public AdminLogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAppName = new JLabel("Scheduler.exe");
		lblAppName.setBounds(5, 5, 424, 34);
		lblAppName.setFont(new Font("Constantia", Font.BOLD, 16));
		lblAppName.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblAppName);
		
		JPanel panel = new JPanel();
		panel.setBounds(70, 50, 300, 165);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblUser.setBounds(55, 44, 36, 20);
		panel.add(lblUser);
		
		txtFldUser = new JTextField();
		txtFldUser.setBounds(101, 42, 116, 20);
		panel.add(txtFldUser);
		txtFldUser.setColumns(10);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblPass.setBounds(33, 75, 58, 20);
		panel.add(lblPass);
		
		txtFldPass = new JPasswordField();
		txtFldPass.setBounds(101, 73, 116, 20);
		panel.add(txtFldPass);
		 txtFldPass.setColumns(10);
		
		JButton btnLogin = new JButton("Sign In");
		
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username = txtFldUser.getText();
				String password = txtFldPass.getText();
				
				try {
					if(username.equals("admin") && password.equals("admin")) {
						setVisible(false);
						MainFrame frame = new MainFrame();
						frame.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Wrong username and password. Try Again.");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnLogin.setBounds(114, 115, 89, 23);
		panel.add(btnLogin);
	}

}
