import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class LoginMask {

	private JFrame frame;
	private JTextField textBenutzername;
	private JPasswordField passwordField;
	private JLabel lblImagesLogin;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginMask window = new LoginMask();
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
	public LoginMask() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBenutzername = new JLabel("Benutzername");
		lblBenutzername.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBenutzername.setBounds(71, 103, 84, 14);
		frame.getContentPane().add(lblBenutzername);
		
		JLabel lblPasswort = new JLabel("Passwort");
		lblPasswort.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPasswort.setBounds(71, 145, 62, 14);
		frame.getContentPane().add(lblPasswort);
		
		textBenutzername = new JTextField();
		textBenutzername.setBounds(203, 100, 188, 20);
		frame.getContentPane().add(textBenutzername);
		textBenutzername.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(203, 142, 188, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(203, 191, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.setBounds(302, 191, 89, 23);
		frame.getContentPane().add(btnAbbrechen);
		
		JLabel lblImagesLogin = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("login.png")).getImage();
		lblImagesLogin.setIcon(new ImageIcon(image));
		lblImagesLogin.setBounds(401, 81, 123, 118);
		frame.getContentPane().add(lblImagesLogin);
	}

	public JLabel getLblImagesLogin() {
		return lblImagesLogin;
	}

	public void setLblImagesLogin(JLabel lblImagesLogin) {
		this.lblImagesLogin = lblImagesLogin;
	}
}
