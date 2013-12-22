package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About frame = new About();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public About() {
		setTitle("about");
		setAlwaysOnTop(true);
		setEnabled(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 272, 216);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 260, 182);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextPane txtpnVersionCreated = new JTextPane();
		txtpnVersionCreated.setEditable(false);
		txtpnVersionCreated.setBounds(54, 40, 154, 64);
		txtpnVersionCreated.setBackground(SystemColor.window);
		txtpnVersionCreated.setText("Version 1.0\nCreated by:\nSimon, Joel, Aya & Oscar\nfor Bihl & Rulle AB");
		panel.add(txtpnVersionCreated);
	}
}
