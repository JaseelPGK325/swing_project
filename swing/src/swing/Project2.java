package swing;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class Project2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project2 window = new Project2();
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
	public Project2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Student Report");
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 739, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 32, 373, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentDetails = new JLabel("STUDENT DETAILS");
		lblStudentDetails.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblStudentDetails.setBounds(124, 11, 142, 25);
		panel.add(lblStudentDetails);
		
		JLabel lblStudentId = new JLabel("Student ID ");
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStudentId.setBounds(26, 47, 80, 14);
		panel.add(lblStudentId);
		
		JLabel lblNewLabel = new JLabel("First name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(26, 72, 61, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("surname");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(26, 103, 80, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Semester");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(26, 128, 80, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Total score");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(26, 175, 71, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Rank");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(26, 225, 61, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Average");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(26, 200, 71, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Maths");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_6.setBounds(220, 47, 46, 14);
		panel.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.setBounds(106, 44, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 69, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 100, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("English");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_7.setBounds(220, 72, 46, 14);
		panel.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(106, 172, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(106, 197, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(106, 222, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			
			@Override
			
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField_7.setBounds(277, 44, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField_8.setBounds(277, 69, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Biology");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_8.setBounds(220, 103, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Physics");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_9.setBounds(217, 128, 61, 14);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Computer");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_10.setBounds(205, 175, 61, 14);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Chemistry");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_11.setBounds(207, 153, 71, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Malayalam");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_12.setBounds(204, 200, 74, 14);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Tamil");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_13.setBounds(220, 225, 46, 14);
		panel.add(lblNewLabel_13);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField_9.setBounds(277, 100, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField_10.setBounds(277, 125, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField_11.setBounds(277, 147, 86, 20);
		panel.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField_12.setBounds(277, 172, 86, 20);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.addKeyListener(new KeyAdapter() {
			@Override

			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField_13.setBounds(277, 197, 86, 20);
		panel.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField_14.setBounds(277, 222, 86, 20);
		panel.add(textField_14);
		textField_14.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6", "7", "8"}));
		comboBox.setBounds(106, 125, 80, 20);
		panel.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(26, 153, 166, 4);
		panel.add(panel_2);
		
		table = new JTable();
		table.setBackground(Color.YELLOW);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Stud.ID", "semester", "Maths", "English", "Biology", "Physics", "Chemistry", "Computer", "Malayalam", "Tamil", "Total", "Avg", "Rank"},
				
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(27, 327, 686, 89);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("Add report");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField_7.getText());
				int b=Integer.parseInt(textField_8.getText());
				int c=Integer.parseInt(textField_9.getText());
				int d=Integer.parseInt(textField_10.getText());
				int e=Integer.parseInt(textField_11.getText());
				int f=Integer.parseInt(textField_12.getText());
				int g=Integer.parseInt(textField_13.getText());
				int h=Integer.parseInt(textField_14.getText());
				int i=Integer.parseInt(textField_7.getText());
				double t=a+b+c+d+e+f;
				double avg=t/8;
				String st=String.format("%.2f", t);
				textField_4.setText(st);
				String syt=String.format("%.2f", avg);
				textField_5.setText(syt);
				if(t>=650)
				{textField_6.setText("1");}
				if(t>=550&&t<650)
				{textField_6.setText("2");}
				if(t>=450&&t<550)
				{textField_6.setText("3");}
				if(t>=350&&t<450)
				{textField_6.setText("4");}
				if(t>=250&&t<350)
				{textField_6.setText("5");}
				if(t<250)
				{textField_6.setText("Failed");}
				
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				model.addRow(new String[] {
						textField.getText(),
						(String)comboBox.getSelectedItem(),
						textField_7.getText(),
						textField_8.getText(),
						textField_9.getText(),
						textField_10.getText(),
						textField_11.getText(),
						textField_12.getText(),
						textField_13.getText(),
						textField_14.getText(),
						textField_4.getText(),
						textField_5.getText(),
						textField_6.getText(),
				});
			}
		});
		
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(69, 427, 89, 23);
		frame.getContentPane().add(btnNewButton);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 0));
		panel_1.setBounds(393, 11, 320, 304);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 300, 265);
		panel_1.add(textArea);
		
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int row=table.getSelectedRow();
			DefaultTableModel model=(DefaultTableModel)table.getModel();
			model.removeRow(row);
			}
		});
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(186, 427, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Show report");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				textArea.append("STUDENT RECORD\n"
				+"Student name  :\t"+textField_1.getText()+textField_2.getText()
				+"\n=============================="
				+"\nMaths    :\t\t"+textField_7.getText()
				+"\nEnglish  :\t\t"+textField_8.getText()
				+"\nPhysics  :\t\t"+textField_9.getText()
				+"\nBiology  :\t\t"+textField_10.getText()
				+"\nChemistry:\t\t"+textField_11.getText()
				+"\nComputer :\t\t"+textField_12.getText()
				+"\nMalayalam:\t\t"+textField_13.getText()
				+"\nTamil    :\t\t"+textField_14.getText()
				+"\n==============================="
				+"\nTotal    :\t\t"+textField_4.getText()
				+"\nAverage  :\t\t"+textField_5.getText()
				+"\nRank     :\t\t"+textField_6.getText()
						
				);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.setForeground(Color.GREEN);
		btnNewButton_2.setBounds(305, 427, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(frame,"confirm","exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);}

			}
		});
		btnNewButton_3.setForeground(Color.RED);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(419, 427, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewBcutton = new JButton("Reset");
		btnNewBcutton.addActionListener(new ActionListener() {
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
				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);
			}
		});
		btnNewBcutton.setForeground(Color.BLACK);
		btnNewBcutton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewBcutton.setBounds(531, 427, 89, 23);
		frame.getContentPane().add(btnNewBcutton);
		
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBounds(113, 281, 89, 23);
		panel_1.add(btnClear);
		
	
	}
}
