import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.Font;

public class AuswahlKantinen {

	private JFrame frame;
	private JTextField textUhrzeit;
	private JTextField text_Datum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuswahlKantinen window = new AuswahlKantinen();
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
	public AuswahlKantinen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Meet & Eat Planer");
		lblNewLabel.setBounds(20, 11, 120, 14);
		
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnFacetoFace = new JRadioButton("Face to Face");
		rdbtnFacetoFace.setBounds(20, 70, 109, 23);
		frame.getContentPane().add(rdbtnFacetoFace);
		
		JRadioButton rdbtnviererTisch = new JRadioButton("4er-Tisch");
		rdbtnviererTisch.setBounds(20, 90, 109, 23);
		frame.getContentPane().add(rdbtnviererTisch);
		
		JRadioButton rdbtnLastMinute = new JRadioButton("Lastminute");
		rdbtnLastMinute.setBounds(20, 110, 109, 23);
		frame.getContentPane().add(rdbtnLastMinute);
		
		JComboBox auswahlDerKantine = new JComboBox();
		auswahlDerKantine.setBounds(20, 181, 109, 30);
		frame.getContentPane().add(auswahlDerKantine);
		
		
		JLabel lblVarianten = new JLabel("Varianten");
		lblVarianten.setBounds(20, 53, 60, 14);
		frame.getContentPane().add(lblVarianten);
		
		JPanel panel = new JPanel();
		panel.setBounds(165, 181, 157, 30);
		frame.getContentPane().add(panel);
		
		text_Datum = new JTextField();
		panel.add(text_Datum);
		text_Datum.setColumns(6);
		
		textUhrzeit = new JTextField();
		panel.add(textUhrzeit);
		textUhrzeit.setColumns(5);
	
		
		JLabel lbl_Kantine = new JLabel("Auswahl der Kantine");
		lbl_Kantine.setBounds(20, 156, 109, 14);
		frame.getContentPane().add(lbl_Kantine);
		
		JLabel lbl_Datum = new JLabel("Datum");
		lbl_Datum.setBounds(174, 156, 46, 14);
		frame.getContentPane().add(lbl_Datum);
		
		JLabel lbl_Uhrzeit = new JLabel("Uhrzeit");
		lbl_Uhrzeit.setBounds(262, 156, 46, 14);
		frame.getContentPane().add(lbl_Uhrzeit);
		
		JButton btn_Bestaetigen = new JButton("Best\u00E4tigen");
		btn_Bestaetigen.setBounds(20, 254, 95, 23);
		frame.getContentPane().add(btn_Bestaetigen);
		
		JButton btn_Zurueck = new JButton("Zur\u00FCck");
		btn_Zurueck.setBounds(119, 254, 89, 23);
		frame.getContentPane().add(btn_Zurueck);
		
		JButton btn_abbrechen = new JButton("Abbrechen");
		btn_abbrechen.setBounds(219, 254, 97, 23);
		frame.getContentPane().add(btn_abbrechen);
		
		JRadioButton rdbtnRichtlinien = new JRadioButton("Ich habe die Bedingungen gelesen und erkl\u00E4re mich einverstanden.");
		rdbtnRichtlinien.setFont(new Font("Tahoma", Font.PLAIN, 9));
		rdbtnRichtlinien.setBounds(20, 224, 332, 23);
		frame.getContentPane().add(rdbtnRichtlinien);
		
		
		
		
	}
}
