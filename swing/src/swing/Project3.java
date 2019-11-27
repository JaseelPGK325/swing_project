package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class Project3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;
int j=0,i=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project3 window = new Project3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Project3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(100, 100, 709, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(336, 71, 347, 329);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Name");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(22, 35, 63, 26);
		panel.add(label);
		
		textField_4 = new JTextField();
		textField_4.setBounds(92, 33, 180, 26);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_2.setBounds(226, 205, 87, 20);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFrom.setBackground(new Color(240, 240, 240));
		lblFrom.setBounds(22, 90, 46, 14);
		panel.add(lblFrom);
		
		textField_5 = new JTextField();
		textField_5.setBounds(63, 84, 103, 26);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTo.setBounds(22, 145, 46, 14);
		panel.add(lblTo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(63, 139, 103, 26);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDate.setBounds(22, 195, 46, 14);
		panel.add(lblDate);
		
		JRadioButton rdbtnAc = new JRadioButton("AC");
		rdbtnAc.setBounds(112, 165, 49, 23);
		frame.getContentPane().add(rdbtnAc);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTime.setBounds(22, 242, 46, 14);
		panel.add(lblTime);
		
		textField_7 = new JTextField();
		textField_7.setBounds(63, 192, 103, 26);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(63, 233, 103, 26);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String book=String.format("%d", j);
				j++;
				String v="";
				if(rdbtnAc.isSelected()) {
					v="Ac";
				
				}
				else {
					v="NonAc";
				}
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new String[]
						{
								textField.getText(),
								book,
								textField_5.getText(),
								textField_6.getText(),
								(String)comboBox_2.getSelectedItem(),
								textField_8.getText(),
								textField_7.getText(),
								v,
								textField_10.getText(),
								
						}
						);
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConfirm.setBounds(148, 295, 89, 23);
		panel.add(btnConfirm);
		
		JLabel lblPrice = new JLabel("Ticket Number");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrice.setBounds(218, 90, 86, 14);
		panel.add(lblPrice);
		
		textField_9 = new JTextField();
		textField_9.setBounds(218, 111, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblPrice_1 = new JLabel("Price");
		lblPrice_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrice_1.setBounds(238, 151, 46, 14);
		panel.add(lblPrice_1);
		
		textField_10 = new JTextField();
		textField_10.setBounds(218, 170, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRoute.setBounds(238, 222, 46, 14);
		panel.add(lblRoute);
		
		textField_11 = new JTextField();
		textField_11.setBounds(218, 239, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(26, 80, 63, 26);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(74, 81, 189, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(26, 126, 63, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setBounds(112, 126, 73, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setBounds(208, 126, 109, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		rdbtnFirstClass.setBounds(26, 165, 80, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		
		JRadioButton rdbtnSleeper = new JRadioButton("Sleeper");
		rdbtnSleeper.setBounds(175, 165, 73, 23);
		frame.getContentPane().add(rdbtnSleeper);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(257, 165, 63, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Andrapradesh", "Tamilnadu", "Kerala", "Maharashtra", "karnataka", "delhi", "rajasthajn", "pondichery", "kashmir", "up"}));
		comboBox.setBounds(26, 205, 80, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Andrapradesh", "Tamilnadu", "Kerala", "Maharashtra", "karnataka", "delhi", "rajasthajn", "pondichery", "kashmir", "up"}));
		comboBox_1.setBounds(126, 205, 80, 20);
		frame.getContentPane().add(comboBox_1);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(242, 11, 161, 36);
		frame.getContentPane().add(panel_1);
		
		JLabel lblTicketBooking = new JLabel("TICKET BOOKING");
		panel_1.add(lblTicketBooking);
		lblTicketBooking.setForeground(new Color(0, 0, 255));
		lblTicketBooking.setBackground(new Color(255, 0, 0));
		lblTicketBooking.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(51, 246, 266, 107);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblTax = new JLabel("TAX");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTax.setBounds(21, 11, 46, 14);
		panel_2.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubTotal.setBounds(21, 45, 76, 14);
		panel_2.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(21, 79, 46, 14);
		panel_2.add(lblTotal);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 11, 86, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(102, 42, 86, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(102, 76, 86, 20);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBounds(40, 364, 294, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(36, 233, 294, 2);
		frame.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("TOTAL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField_11.setText("Any");
				String book=String.format("%d", i);
				textField_9.setText(book);
				i++;
				double t=0;
				double m=0;
				double number=Double.parseDouble((String)comboBox_2.getSelectedItem());
				
				if(rdbtnSingleTicket.isSelected()) {t=t+500;}
				else {t=t+700;}
				if(rdbtnAc.isSelected()) {t=t+500;
				
				textField_1.setText("200");}
				else {t=t+300;
				
				textField_1.setText("100");}
				if(rdbtnSleeper.isSelected())
				{t=t+500;}
				else {t=t+300;}
				m=(m+t)*number;
				
				String r=String.format("%.2f", m);
				textField_2.setText(r);
				if(rdbtnAc.isSelected()) {
					String l=String.format("%.2f", m+200);
					textField_3.setText(l);
					textField_10.setText(l);
				}
				else {
					String l=String.format("%.2f", m+100);
					textField_3.setText(l);
					
				}
				String str=textField.getText();
				textField_4.setText(str);
				textField_5.setText(comboBox.getSelectedItem().toString());
				textField_6.setText(comboBox_1.getSelectedItem().toString());
				 Calendar timer=Calendar.getInstance();
	                timer.getTime();
	                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
	                textField_8.setText(tTime.format(timer.getTime()));
	       
	                SimpleDateFormat tdate= new SimpleDateFormat("dd-MM-yyyy");
	                textField_7.setText(tdate.format(timer.getTime()));
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(10, 377, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_5.setText(null);
				textField_4.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_3.setText(null);
				
				
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(112, 377, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setBounds(226, 377, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(36, 117, 298, 2);
		frame.getContentPane().add(separator_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking Number", "From", "To", "No.of Seats","Time", "Date","AC/NonAc", "Price"},
				
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBackground(Color.LIGHT_GRAY);
		table.setBounds(10, 410, 673, 97);
		frame.getContentPane().add(table);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(327, 97, 31, 282);
		frame.getContentPane().add(separator_3);
	}
}
