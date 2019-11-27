package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class interestcalculator {

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
	double p,n,r,t;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interestcalculator window = new interestcalculator();
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
	public interestcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Interest Calcs");
		frame.getContentPane().setFont(new Font("Vijaya", Font.PLAIN, 11));
		frame.setBounds(100, 100, 685, 417);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInterestCalcs = new JLabel("Interest Calcs");
		lblInterestCalcs.setFont(new Font("Vijaya", Font.BOLD, 44));
		lblInterestCalcs.setBounds(211, 11, 205, 56);
		frame.getContentPane().add(lblInterestCalcs);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(39, 64, 604, 290);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("SIMPLE INTEREST", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblPrincipleAmount = new JLabel("Principal Amount");
		lblPrincipleAmount.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPrincipleAmount.setBounds(22, 30, 176, 30);
		panel.add(lblPrincipleAmount);
		
		JLabel lblNewLabel = new JLabel("Rate of interest");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(22, 87, 176, 30);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(208, 31, 152, 29);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNoofYears = new JLabel("No.of Years");
		lblNoofYears.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNoofYears.setBounds(22, 147, 176, 30);
		panel.add(lblNoofYears);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(208, 91, 152, 29);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(208, 147, 152, 29);
		panel.add(textField_2);
		
		JLabel lblInterest = new JLabel("Interest   :");
		lblInterest.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblInterest.setBounds(141, 211, 129, 30);
		panel.add(lblInterest);
		
		textField_3 = new JTextField();
		textField_3.setBounds(294, 214, 194, 35);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
			}
		});
		btnClear.setBackground(Color.RED);
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnClear.setBounds(409, 49, 122, 43);
		panel.add(btnClear);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				p=Double.parseDouble(textField.getText());
				r=Double.parseDouble(textField_1.getText());
				n=Double.parseDouble(textField_2.getText());
				double i=(p*n*r)/100;
				String ans=String.format("%.2f", i);
				textField_3.setText(ans);
			}
		});
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnSubmit.setBackground(Color.GREEN);
		btnSubmit.setBounds(409, 137, 122, 43);
		panel.add(btnSubmit);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("COMPOUND INTEREST", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("Principal Amount");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(10, 33, 176, 30);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("Rate of interest");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_1.setBounds(10, 74, 176, 30);
		panel_1.add(label_1);
		
		JLabel label_3 = new JLabel("Interest   :");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label_3.setBounds(93, 206, 129, 30);
		panel_1.add(label_3);
		
		JButton button = new JButton("CLEAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				
			}
		});
		button.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button.setBackground(Color.RED);
		button.setBounds(441, 40, 122, 43);
		panel_1.add(button);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(253, 37, 152, 29);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(253, 78, 152, 29);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(253, 122, 152, 29);
		panel_1.add(textField_6);
		
		JButton button_1 = new JButton("SUBMIT");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p=Double.parseDouble(textField_4.getText());
				r=Double.parseDouble(textField_5.getText());
				n=Double.parseDouble(textField_6.getText());
				t=Double.parseDouble(textField_7.getText());
				double i=Math.pow((1+r/n), (n*t));
				double ii=p*i;
				String ans=String.format("%.2f", i);
				textField_3.setText(ans);
			}
		});
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(441, 115, 122, 43);
		panel_1.add(button_1);
		
		JLabel label_4 = new JLabel("No.of Years");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_4.setBounds(10, 122, 176, 30);
		panel_1.add(label_4);
		
		JLabel label_2 = new JLabel("No.of time periods elapsed");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_2.setBounds(10, 158, 233, 37);
		panel_1.add(label_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(253, 162, 152, 29);
		panel_1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(253, 201, 194, 35);
		panel_1.add(textField_8);
	}
}
