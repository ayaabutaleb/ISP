package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.Font;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomePass extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private static String WelcomePass = "pass";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePass WPframe = new WelcomePass();
					WPframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WelcomePass() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 364, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(55, 81, 68, 16);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(119, 78, 118, 22);
		panel.add(passwordField);
		passwordField.addActionListener(new AL());
		
		
		
		
		JLabel lblWelcomeToBihl = new JLabel("Welcome to Bihl & Rulle");
		lblWelcomeToBihl.setFont(new Font("Hiragino Kaku Gothic Std", Font.PLAIN, 15));
		lblWelcomeToBihl.setBounds(72, 20, 222, 31);
		panel.add(lblWelcomeToBihl);
		
		
		
		
	}
	
	public class AL implements ActionListener{
		
		public void actionPerformed(ActionEvent e){
		JPasswordField input = (JPasswordField) e.getSource();
		char[] writtenpass = input.getPassword();
		String p = new String(writtenpass);
		
		if (p.equals(WelcomePass)) {
			
			dispose();							//close password screen when password is correct
			
			MainFrame frame = new MainFrame();		//if password is correct open JFrame IStest
			frame.setVisible(true);
			
			
			
			
		}
		else
			JOptionPane.showMessageDialog(null, "Incorrect password");
		
		}
			
			
		}
	
	}