

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JCheckBox;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTable tblSchedule;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlNav = new JPanel();
		pnlNav.setBounds(5, 36, 137, 428);
		contentPane.add(pnlNav);
		pnlNav.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Categories");
		lblNewLabel_1.setBounds(10, 11, 108, 19);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		pnlNav.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Baskerville Old Face", Font.BOLD, 14));
		
		JCheckBox chckbxStudies = new JCheckBox("Studies");
		chckbxStudies.setBounds(10, 37, 97, 23);
		pnlNav.add(chckbxStudies);
		
		JCheckBox chckbxGames = new JCheckBox("Games");
		chckbxGames.setBounds(10, 74, 97, 23);
		pnlNav.add(chckbxGames);
		
		JCheckBox chckbxWorkout = new JCheckBox("Workout");
		chckbxWorkout.setBounds(10, 110, 97, 23);
		pnlNav.add(chckbxWorkout);
		
		JPanel pnlHeader = new JPanel();
		pnlHeader.setBounds(5, 5, 738, 31);
		contentPane.add(pnlHeader);
		
		JLabel lblNewLabel = new JLabel("SCHEDULER.EXE");
		pnlHeader.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel pnlTable = new JPanel();
		pnlTable.setBounds(146, 36, 597, 428);
		contentPane.add(pnlTable);
		pnlTable.setLayout(null);

		
		
		tblSchedule = new JTable();
		tblSchedule.setFont(new Font("Constantia", Font.PLAIN, 12));
		tblSchedule.setBounds(5, 5, 582, 375);
		pnlTable.add(tblSchedule);
		
		//show schedule
		String[] columnNames = {"Time", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
		tableModel.addRow(columnNames);
		
		tblSchedule.setModel(tableModel);
		
		JButton btnAdd = new JButton("Add Task");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAdd.setBounds(15, 391, 108, 23);
		pnlTable.add(btnAdd);
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				TasksFrame frame = new TasksFrame();
				frame.setVisible(true);
			}
		});
		
		JButton btnEdit = new JButton("Edit Task");
		btnEdit.setBounds(251, 391, 108, 23);
		pnlTable.add(btnEdit);
		
		JButton btnRemove = new JButton("Remove Task");
		btnRemove.setBounds(133, 391, 108, 23);
		pnlTable.add(btnRemove);
		
		
	}
}
