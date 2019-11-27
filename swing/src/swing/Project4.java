package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class Project4 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	double ind=15;
	double usa=50;
	double uk=40;
	double cb=50,chb=90,cm=75,ju=45,tea=10,cf=15,num1,result,num2;
	String op;
	
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project4 window = new Project4();
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
	public Project4() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 747, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHotelManagementSystem = new JLabel("Hotel Management System");
		lblHotelManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHotelManagementSystem.setBounds(230, 22, 296, 32);
		frame.getContentPane().add(lblHotelManagementSystem);
		
		JLabel lblChikenBurger = new JLabel("Chicken Burger");
		lblChikenBurger.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChikenBurger.setBounds(17, 101, 101, 14);
		frame.getContentPane().add(lblChikenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Chicken Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblChickenBurgerMeal.setBounds(17, 136, 115, 14);
		frame.getContentPane().add(lblChickenBurgerMeal);
		
		JLabel lblNewLabel = new JLabel("Cheese Burger");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(17, 168, 101, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField.setBounds(161, 98, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
			
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField_1.setBounds(161, 133, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.setForeground(Color.BLACK);
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField_2.setBounds(161, 165, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(17, 193, 231, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDrink.setBounds(27, 196, 46, 14);
		frame.getContentPane().add(lblDrink);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Tea", "Coffee", "Cola", "Juice"}));
		comboBox.setBounds(17, 218, 80, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQty.setBounds(171, 196, 46, 14);
		frame.getContentPane().add(lblQty);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
		});
		textField_3.setBounds(145, 218, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnHomeDelivery = new JRadioButton("Home Delivery");
		rdbtnHomeDelivery.setBounds(17, 245, 109, 23);
		frame.getContentPane().add(rdbtnHomeDelivery);
		
		JRadioButton rdbtnTax = new JRadioButton("Tax");
		rdbtnTax.setBounds(138, 245, 73, 23);
		frame.getContentPane().add(rdbtnTax);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 83, 252, 201);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 295, 252, 88);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCostOfDrinks = new JLabel("Cost of Drinks");
		lblCostOfDrinks.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfDrinks.setBounds(20, 11, 93, 14);
		panel_1.add(lblCostOfDrinks);
		
		JLabel lblCostOfMeal = new JLabel("Cost of Meal");
		lblCostOfMeal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfMeal.setBounds(20, 36, 93, 14);
		panel_1.add(lblCostOfMeal);
		
		JLabel lblCostOfDelivery = new JLabel("Cost of Delivery");
		lblCostOfDelivery.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCostOfDelivery.setBounds(20, 61, 93, 14);
		panel_1.add(lblCostOfDelivery);
		
		textField_6 = new JTextField();
		textField_6.setBounds(143, 8, 86, 20);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(143, 33, 86, 20);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(143, 58, 86, 20);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_2.setBounds(272, 83, 180, 201);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCurrencyConverter.setBounds(24, 11, 125, 14);
		panel_2.add(lblCurrencyConverter);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"India", "U.S.A", "U.K"}));
		comboBox_1.setBounds(24, 36, 125, 20);
		panel_2.add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
			@Override
			
				public void keyTyped(java.awt.event.KeyEvent evt) {
			
				char num=evt.getKeyChar();
				if(!(Character.isDigit(num))
						||(num==KeyEvent.VK_BACK_SPACE)
						||(num==KeyEvent.VK_DELETE)) {
			evt.consume();
			}}
			}
		);
		textField_4.setBounds(10, 67, 158, 31);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(20, 109, 148, 31);
		panel_2.add(lblNewLabel_1);
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				double bp=Double.parseDouble(textField_4.getText());
				
				if(comboBox_1.getSelectedItem().equals("India"))
				{
				String c=String.format("INR %.2f",bp*ind);
				lblNewLabel_1.setText(c);
				}
				if(comboBox_1.getSelectedItem().equals("U.S.A"))
				{
				String c=String.format("$ %.2f",bp*usa);
				lblNewLabel_1.setText(c);
				}
				if(comboBox_1.getSelectedItem().equals("U.K"))
				{
				String c=String.format("uk$ %.2f",bp*uk);
				lblNewLabel_1.setText(c);
				}
			}
		});
		btnConvert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnConvert.setBounds(10, 151, 77, 23);
		panel_2.add(btnConvert);
		
		JButton btnClose = new JButton("Clear");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_4.setText(null);
				lblNewLabel_1.setText(null);
			}
		});
		btnClose.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClose.setBounds(97, 151, 77, 23);
		panel_2.add(btnClose);
		
	
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.setBounds(272, 295, 180, 88);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTax.setBounds(10, 11, 46, 14);
		panel_3.add(lblTax);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSubTotal.setBounds(10, 39, 80, 14);
		panel_3.add(lblSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotal.setBounds(10, 63, 46, 14);
		panel_3.add(lblTotal);
		
		textField_9 = new JTextField();
		textField_9.setBounds(84, 8, 86, 20);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(84, 36, 86, 20);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(84, 64, 86, 20);
		panel_3.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(462, 83, 236, 300);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 216, 278);
		panel_4.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 211, 250);
		panel_6.add(textArea);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.LIGHT_GRAY));
		tabbedPane.addTab("calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 11, 164, 37);
		panel_7.add(textField_5);
		
		JButton btnC = new JButton("B");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField_5.getText().length()>0)
				{
				StringBuilder strB=new StringBuilder(textField_5.getText());
				strB.deleteCharAt(textField_5.getText().length()-1);
				b=strB.toString();
				textField_5.setText(b);

				}
			}
		});
		btnC.setBounds(8, 59, 44, 30);
		panel_7.add(btnC);
		
		JButton button = new JButton("C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setText(null);
			}
		});
		button.setBounds(54, 59, 48, 30);
		panel_7.add(button);
		
		JButton button_1 = new JButton("%");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_5.getText());
				textField_5.setText("");
				op="%";}
		});
		button_1.setBounds(105, 59, 44, 30);
		panel_7.add(button_1);
		
		JButton button_2 = new JButton("+");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_5.getText());
				textField_5.setText("");
				op="+";
			}
		});
		button_2.setBounds(157, 59, 42, 30);
		panel_7.add(button_2);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_3.getText();
				textField_5.setText(Number);
			}
		});
		button_3.setBounds(8, 91, 44, 30);
		panel_7.add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_4.getText();
				textField_5.setText(Number);
			}
		});
		button_4.setBounds(8, 126, 44, 30);
		panel_7.add(button_4);
		
		JButton button_5 = new JButton("1");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_5.getText();
				textField_5.setText(Number);
			}
		});
		button_5.setBounds(8, 159, 44, 30);
		panel_7.add(button_5);
		
		JButton button_6 = new JButton("0");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_6.getText();
				textField_5.setText(Number);
			}
		});
		button_6.setBounds(10, 195, 92, 30);
		panel_7.add(button_6);
		
		JButton button_7 = new JButton("8");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_7.getText();
				textField_5.setText(Number);
			}
		});
		button_7.setBounds(57, 91, 45, 30);
		panel_7.add(button_7);
		
		JButton button_8 = new JButton("9");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_8.getText();
				textField_5.setText(Number);
			}
		});
		button_8.setBounds(103, 91, 44, 30);
		panel_7.add(button_8);
		
		JButton button_9 = new JButton("-");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_5.getText());
				textField_5.setText("");
				op="-";
			}
		});
		button_9.setBounds(157, 91, 44, 30);
		panel_7.add(button_9);
		
		JButton button_10 = new JButton("5");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_10.getText();
				textField_5.setText(Number);
			}
		});
		button_10.setBounds(57, 126, 45, 30);
		panel_7.add(button_10);
		
		JButton button_11 = new JButton("6");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_11.getText();
				textField_5.setText(Number);
			}
		});
		button_11.setBounds(103, 126, 44, 30);
		panel_7.add(button_11);
		
		JButton button_12 = new JButton("*");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_5.getText());
				textField_5.setText("");
				op="*";
			}
		});
		button_12.setBounds(157, 126, 44, 30);
		panel_7.add(button_12);
		
		JButton button_13 = new JButton("2");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_13.getText();
				textField_5.setText(Number);
			}
		});
		button_13.setBounds(57, 159, 45, 30);
		panel_7.add(button_13);
		
		JButton button_14 = new JButton("3");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField_5.getText()+button_14.getText();
			textField_5.setText(Number);
			}
		});
		button_14.setBounds(103, 159, 44, 30);
		panel_7.add(button_14);
		
		JButton button_15 = new JButton("/");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_5.getText());
				textField_5.setText("");
				op="/";
			}
		});
		button_15.setBounds(157, 159, 44, 30);
		panel_7.add(button_15);
		
		JButton button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField_5.getText());
				textField_5.setText("");
				op="/";
				String Number=textField_5.getText()+button_16.getText();
				textField_5.setText(Number);
			}
		});
		button_16.setBounds(105, 195, 42, 30);
		panel_7.add(button_16);
		
		JButton button_18 = new JButton("=");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ans;
				num2=Double.parseDouble(textField_5.getText());
				if(op=="+") {
				result=num1 + num2;
				ans=String.format("%.2f",result);
				textField_5.setText(ans);
				}
				if(op=="-") {
				result=num1 - num2;
				ans=String.format("%.2f",result);
				textField_5.setText(ans);
				}
				if(op=="*") {
				result=num1 * num2;
				ans=String.format("%.2f",result);
				textField_5.setText(ans);
				}
				if(op=="/") {
				result=num1 / num2;
				ans=String.format("%.2f",result);
				textField_5.setText(ans);
				}
				if(op=="%") {
				result=num1 % num2;
				ans=String.format("%.2f",result);
				textField_5.setText(ans);
				
			}}
		});
		button_18.setBounds(157, 195, 44, 30);
		panel_7.add(button_18);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_5.setBounds(10, 394, 661, 37);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				cb=Double.parseDouble(textField.getText());
				chb=Double.parseDouble(textField_1.getText());
				cm=Double.parseDouble(textField_2.getText());
				ju=Double.parseDouble(textField_3.getText());
				r2=(cb*50)+(chb*75)+(cm*95);
				a2=String.format("%.2f",r2);
				t6.setText(a2);
				if(comboBox.getSelectedItem().equals("Tea"))
				{
				r1=d*9;
				a1=String.format("%.2f",r1);
				t5.setText(a1);
				}
				else
				{
				r1=d*13;
				a1=String.format("%.2f",r1);
				t5.setText(a1);
				}
				if (ch1.isSelected())
				{
				t7.setText("25");
				}
				else
				{
				t7.setText("0");
				}
				r4=Double.parseDouble(t7.getText());
				r3=r2+r1+r4;
				if (ch2.isSelected())
				{
				r5=r3*(0.18);
				r6=r3+r5;
				}
				else
				{
				r5=0;
				r6=r3;
				}


				l1.setText(String.valueOf(r5));
				l2.setText(String.valueOf(r3));
				l3.setText(String.valueOf(r6));

				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(57, 11, 89, 15);
		panel_5.add(btnNewButton);
		
		JButton btnReset = new JButton("Reciept");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.append("\n Restaurent Management System\n\n"
						+"\n Chicken burger :"+textField.getText()
						+"\n Chicken burger meal :"+textField_1.getText()
						+"\n Cheese burger :"+textField_2.getText()
						+"\n\n thanks for using job estimator"
			);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset.setBounds(208, 11, 89, 15);
		panel_5.add(btnReset);
		
		JButton btnReset_1 = new JButton("Reset");
		btnReset_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textArea.setText(null);
				
				
			}
		});
		btnReset_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReset_1.setBounds(366, 11, 89, 15);
		panel_5.add(btnReset_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	if(JOptionPane.showConfirmDialog(frame,"confirm","exit",JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
				{
					System.exit(0);}

			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnExit.setBounds(519, 11, 89, 15);
		panel_5.add(btnExit);
	}
}
