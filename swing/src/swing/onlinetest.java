package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class onlinetest {

	private JFrame frame;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					onlinetest window = new onlinetest();
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
	public onlinetest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("ONLINE TEST");
		frame.getContentPane().setBackground(Color.YELLOW);
		frame.setBounds(100, 100, 378, 195);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnLogin = new JButton("SIGN UP");
		btnLogin.setBackground(Color.BLUE);
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLogin.setBounds(218, 80, 89, 34);
		frame.getContentPane().add(btnLogin);
		
		JButton btnSignIn = new JButton("SIGN IN");
		btnSignIn.setBackground(Color.GREEN);
		btnSignIn.setForeground(Color.BLACK);
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSignIn.setBounds(42, 77, 89, 40);
		frame.getContentPane().add(btnSignIn);
		panel.setBounds(10, 11, 342, 58);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARE YOU READY FOR CHECKING YOUR IQ ?\r\nWELCOME TO THE ONLINE TEST\r\n");
		lblNewLabel.setBounds(10, 11, 322, 36);
		panel.add(lblNewLabel);
	}
}
