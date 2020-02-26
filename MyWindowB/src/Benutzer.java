import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import backend.CostumerListener;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Benutzer implements ActionListener{

	private JFrame frame;
	private JTextField txtVorname;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtNickname;
	private String NewLunchPartner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		BenutzerDaten baseB = new BenutzerDaten();     //Database
//		String [] benutzer = baseB.readAllBenutzer();
				
	
		LunchPartner newLuncher;
		
		
		{
			
				
			
		};
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Benutzer window = new Benutzer();
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
//Konstruktor 
	public Benutzer() {
		initialize();
//Menü aufrufen		
	createMenu();	
		
		
	}

	
//Menuebar erstellen
	
	public void createMenu() {
//Menü -> JmenBar -> -> Jmenu -> JMenuItems
		
	JMenuBar jMenuBar = new JMenuBar();
	
	JMenu fileMenu = new JMenu("File");
	JMenu editMenu = new JMenu("Edit");
	JMenu sourceMenu = new JMenu("Source");
	
//Hinzufügen zur menübar		
	
	jMenuBar.add(fileMenu);	
	jMenuBar.add(editMenu);	
	jMenuBar.add(sourceMenu);	
	
//Erstellen eines Items Untermenü mit Text und Bild
	
	JMenuItem exitItem = new JMenuItem("Exit", new ImageIcon("src/images/exit.png"));
//Listener erstellen aus der Klasse CostumerL
	
	exitItem.addActionListener(new CostumerListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub Hier kommt die Interation mit dem Exit rein
			System.exit(0);
		}
	});
	

	
//Hinzufügen zur Menübar 	
	
	fileMenu.add(exitItem);
	
//Hinzufügen zum Frame Fenster
	
	frame.setJMenuBar(jMenuBar);
		
	}
	
	
//Dialogfenster	erstellen für Meldungen an den Benutzer
	
	private void createMessage(String message) {
		JOptionPane.showMessageDialog(frame, message);
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
// Layout setBounds = x-Position, y-Position, breite und höhe
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fenster wird richtig nach schließen geschlossen
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);							//Fenstergröße kann nicht mehr verändert werden.
		
		
		
//Radiobuttons
		
		JRadioButton rdbtnFrau = new JRadioButton("Frau");
		rdbtnFrau.setBounds(18, 41, 51, 23);
		frame.getContentPane().add(rdbtnFrau);
		
		JRadioButton rdbtnHerr = new JRadioButton("Herr");
		rdbtnHerr.setBounds(71, 41, 109, 23);
		frame.getContentPane().add(rdbtnHerr);
		
		
// Textfelder aus der Benutzereingabe 
		
		txtVorname = new JTextField();
		txtVorname.setBounds(80, 81, 171, 20);
		frame.getContentPane().add(txtVorname);
		txtVorname.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(80, 112, 171, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(80, 143, 171, 20);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
// Labels und Buttons		

		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(18, 84, 46, 14);
		frame.getContentPane().add(lblVorname);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(18, 115, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblemail = new JLabel("EMail");
		lblemail.setBounds(18, 146, 46, 14);
		frame.getContentPane().add(lblemail);

		
		txtNickname = new JTextField();
		txtNickname.setBounds(80, 174, 171, 20);
		frame.getContentPane().add(txtNickname);
		txtNickname.setColumns(10);
		

		
		JLabel lblNickName = new JLabel("Nickname");
		lblNickName.setBounds(18, 177, 46, 14);
		frame.getContentPane().add(lblNickName);
		
		JLabel lblStammdaten = new JLabel("Stammdaten");
		lblStammdaten.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblStammdaten.setBounds(18, 11, 115, 14);
		frame.getContentPane().add(lblStammdaten);
		
		JButton btnBestaetigen = new JButton("Bestaetigen");
		btnBestaetigen.addActionListener(new ActionListener() {
			
//Nach Eingabe der Benutzerdaten soll ein neuer Datensatz angelegt werden			
			public void actionPerformed(ActionEvent e) {
				
				String vorname = txtVorname.getText();
				String name = txtName.getSelectedText();
				String email = txtEmail.getSelectedText();
				String nickname = txtNickname.getSelectedText();
				LunchPartner einNeuerLunchPartner = new LunchPartner(txtVorname, txtName, txtEmail, txtNickname);
			}
		});
		btnBestaetigen.setBounds(71, 219, 83, 23);
		frame.getContentPane().add(btnBestaetigen);
		
		JButton btnAbbrechen = new JButton("Abbrechen");
		btnAbbrechen.addActionListener(this);             //Prüft auf ein Event
		btnAbbrechen.setBounds(170, 219, 85, 23);
		frame.getContentPane().add(btnAbbrechen);
	}

	
//Methoden von BenutzerDaten
	
	public String[] readAllBenutzer() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addBenutzer(String name) {
		// TODO Auto-generated method stub
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
//Event Handling von der implements der Klasse
	
//	@Override
//	public void actionPerformed(ActionEvent e) {             // Action Event durch Implements hinzugefügt
//		System.out.println("Abbrechen");
		
//	if (e.getSource() == btnBestaetigen){    // Was soll passieren, wenn die Eingabe von den einzelnen Benutzerfelder erfolgt ist
//		String vornameString = txtVorname.getText();
//		char [] chars = txtVorname.get;	
//		String txtVornameString = new String(chars); //Char wieder in String umwandeln
		
		
//		if (e.getSource() == btnAbbrechen){
	
	}



	
