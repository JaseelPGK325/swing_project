package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class Sample {

	private JFrame frame;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 255));
		frame.getContentPane().setFont(new Font("Tunga", Font.BOLD, 38));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSports = new JButton (new ImageIcon("C:/Users/USER/Desktop/velosipedist-sportsmen-gory-priroda-doroga-road-bike.jpg"));
		btnSports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSports.setBackground(Color.BLUE);
		btnSports.setFont(new Font("Monotype Corsiva", Font.BOLD, 27));
		btnSports.setBounds(-326, -127, 526, 389);
		frame.getContentPane().add(btnSports);
		
		txtUserName = new JTextField();
		txtUserName.setText("user name");
		txtUserName.setBounds(315, 27, 86, 20);
		frame.getContentPane().add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setText("password");
		txtPassword.setBounds(315, 58, 86, 20);
		frame.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblUserName = new JLabel("user name");
		lblUserName.setBounds(232, 30, 85, 14);
		frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("password");
		lblPassword.setBounds(230, 61, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnSignUp = new JButton("sign up");
		btnSignUp.setBounds(315, 144, 89, 23);
		frame.getContentPane().add(btnSignUp);
		
		JButton btnSignIn = new JButton("sign in");
		btnSignIn.setBounds(210, 144, 89, 23);
		frame.getContentPane().add(btnSignIn);
		
		JCheckBox chckbxRemember = new JCheckBox("remember");
		chckbxRemember.setBounds(315, 86, 97, 23);
		frame.getContentPane().add(chckbxRemember);
	}
}
