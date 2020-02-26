import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class BenutzerDaten {

	private JFrame frame;
	private JTextField vorname;
	private JTextField name;
	private JTextField nickname;
	private JTextField email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BenutzerDaten window = new BenutzerDaten();
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
	public BenutzerDaten() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 102, 263, 111);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Vorname ");
		panel.add(lblNewLabel);
		
		vorname = new JTextField();
		vorname.setToolTipText("");
		panel.add(vorname);
		vorname.setColumns(25);
		
		JLabel lblNewLabel_1 = new JLabel("Name      ");
		lblNewLabel_1.setToolTipText("");
		panel.add(lblNewLabel_1);
		
		name = new JTextField();
		panel.add(name);
		name.setColumns(25);
		
		JLabel lblNewLabel_2 = new JLabel("E-Mail      ");
		panel.add(lblNewLabel_2);
		
		email = new JTextField();
		panel.add(email);
		email.setColumns(25);
		
		JLabel lblNewLabel_3 = new JLabel("Nickname");
		panel.add(lblNewLabel_3);
		
		nickname = new JTextField();
		panel.add(nickname);
		nickname.setColumns(25);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(28, 234, 193, 33);
		frame.getContentPane().add(panel_1);
		
		JButton btnNewButton = new JButton("Best\u00E4tigen");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Abbrechen");
		panel_1.add(btnNewButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(28, 52, 124, 39);
		frame.getContentPane().add(panel_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Frau");
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Herr");
		panel_2.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setBounds(28, 27, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
