package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class scientificcalcs {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	double result;
	String op;
	String ans;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientificcalcs window = new scientificcalcs();
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
	public scientificcalcs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblView = new JLabel("View");
		lblView.setBounds(41, 11, 46, 14);
		frame.getContentPane().add(lblView);
		
		JLabel lblNewLabel = new JLabel("Help");
		lblNewLabel.setBounds(81, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 33, 398, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblScientific = new JLabel("Scientific");
		lblScientific.setBounds(10, 66, 148, 14);
		frame.getContentPane().add(lblScientific);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setBounds(244, 66, 123, 14);
		frame.getContentPane().add(lblStandard);
		
		JButton btnSqrt = new JButton("Sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSqrt.setBounds(10, 84, 77, 23);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnx = new JButton("1/x");
		btnx.setBounds(95, 84, 63, 23);
		frame.getContentPane().add(btnx);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnSin.setBounds(168, 84, 63, 23);
		frame.getContentPane().add(btnSin);
		
		JButton button = new JButton("%");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		button.setBounds(10, 114, 77, 23);
		frame.getContentPane().add(button);
		
		JButton btnExp = new JButton("Exp");
		btnExp.setBounds(95, 114, 63, 23);
		frame.getContentPane().add(btnExp);
		
		JButton btnCos = new JButton("cos");
		btnCos.setBounds(168, 114, 63, 23);
		frame.getContentPane().add(btnCos);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXy.setBounds(10, 148, 77, 23);
		frame.getContentPane().add(btnXy);
		
		JButton btnLn = new JButton("ln");
		btnLn.setBounds(95, 148, 63, 23);
		frame.getContentPane().add(btnLn);
		
		JButton btnTan = new JButton("tan");
		btnTan.setBounds(168, 148, 63, 23);
		frame.getContentPane().add(btnTan);
		
		JButton btnX = new JButton("x^2");
		btnX.setBounds(10, 182, 77, 23);
		frame.getContentPane().add(btnX);
		
		JButton btnN = new JButton("n!");
		btnN.setBounds(95, 182, 63, 23);
		frame.getContentPane().add(btnN);
		
		JButton btnSec = new JButton("sec");
		btnSec.setBounds(168, 182, 63, 23);
		frame.getContentPane().add(btnSec);
		
		JButton button_1 = new JButton("7");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_1.getText();
				textField.setText(Number);
			}
		});
		button_1.setBounds(244, 84, 46, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("8");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_2.getText();
				textField.setText(Number);
			}
		});
		button_2.setBounds(290, 84, 46, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("9");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_3.getText();
				textField.setText(Number);
			}
		});
		button_3.setBounds(337, 84, 46, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("/");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			
			}
		});
		button_4.setBounds(386, 84, 48, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("4");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_5.getText();
				textField.setText(Number);
			}
		});
		button_5.setBounds(241, 114, 49, 23);
		frame.getContentPane().add(button_5);
		
		JButton btnNewButton = new JButton("5");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+btnNewButton.getText();
				textField.setText(Number);
			}
		});
		btnNewButton.setBounds(290, 114, 46, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_6.getText();
				textField.setText(Number);
			}
		});
		button_6.setBounds(337, 114, 46, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("*");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			
			}
		});
		button_7.setBounds(386, 114, 48, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("1");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_8.getText();
				textField.setText(Number);
			}
		});
		button_8.setBounds(241, 148, 49, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("2");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_9.getText();
				textField.setText(Number);
			}
		});
		button_9.setBounds(290, 148, 46, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("3");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_10.getText();
				textField.setText(Number);
			}
		});
		button_10.setBounds(337, 148, 46, 23);
		frame.getContentPane().add(button_10);
		
		JButton button_11 = new JButton("-");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		button_11.setBounds(386, 148, 48, 23);
		frame.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("0");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Number=textField.getText()+button_12.getText();
				textField.setText(Number);
			}
		});
		button_12.setBounds(241, 182, 49, 23);
		frame.getContentPane().add(button_12);
		
		JButton button_13 = new JButton(".");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Number=textField.getText()+button_13.getText();
				textField.setText(Number);
			}
		});
		button_13.setBounds(290, 182, 46, 23);
		frame.getContentPane().add(button_13);
		
		JButton button_14 = new JButton("=");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String ans;
				num2=Double.parseDouble(textField.getText());
				if(op=="+") {
				result=num1 + num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="-") {
				result=num1 - num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="*") {
				result=num1 * num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="/") {
				result=num1 / num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				if(op=="%") {
				result=num1 % num2;
				ans=String.format("%.2f",result);
				textField.setText(ans);
				}
				}
		});
		button_14.setBounds(337, 182, 46, 23);
		frame.getContentPane().add(button_14);
		
		JButton button_15 = new JButton("+");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
				}
				});
		button_15.setBounds(386, 182, 48, 23);
		frame.getContentPane().add(button_15);
	}

}
