

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JButton;

public class TasksFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtFldTaskName;
	private JTextField txtFldStarting;
	private JTextField txtFldEnding;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TasksFrame frame = new TasksFrame();
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
	public TasksFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scheduler.exe");
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(124, 11, 172, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblTaskName = new JLabel("Task Name");
		lblTaskName.setFont(new Font("Constantia", Font.PLAIN, 14));
		lblTaskName.setBounds(44, 104, 70, 18);
		contentPane.add(lblTaskName);
		
		JLabel lblStarting = new JLabel("Starting Time");
		lblStarting.setFont(new Font("Constantia", Font.PLAIN, 12));
		lblStarting.setBounds(44, 133, 70, 18);
		contentPane.add(lblStarting);
		
		JLabel lblEnding = new JLabel("Ending Time");
		lblEnding.setFont(new Font("Constantia", Font.PLAIN, 12));
		lblEnding.setBounds(44, 162, 70, 14);
		contentPane.add(lblEnding);
		
		txtFldTaskName = new JTextField();
		txtFldTaskName.setBounds(124, 101, 208, 20);
		contentPane.add(txtFldTaskName);
		txtFldTaskName.setColumns(10);
		
		txtFldStarting = new JTextField();
		txtFldStarting.setBounds(124, 130, 86, 20);
		contentPane.add(txtFldStarting);
		txtFldStarting.setColumns(10);
		
		txtFldEnding = new JTextField();
		txtFldEnding.setBounds(124, 161, 86, 20);
		contentPane.add(txtFldEnding);
		txtFldEnding.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(87, 206, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(207, 206, 89, 23);
		contentPane.add(btnCancel);
		
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//JOptionPane.showMessageDialog(null, "Successfully Discarded Changes.");
				setVisible(false);
				MainFrame frame = new MainFrame();
				frame.setVisible(true);
			}
		});
		
	}
}
