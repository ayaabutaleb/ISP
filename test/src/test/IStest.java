package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.SystemColor;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JMenuItem;
import net.miginfocom.swing.MigLayout;

public class IStest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NCtextFieldForename;
	private JTextField NCtextFieldSurname;
	private JTextField NCtextFieldAdress;
	private JTextField NCtextFieldZip;
	private JTextField NCtextFieldIDnbr;
	private JTextField NCtextFieldEmail;
	private JTextField NCtextFieldCounty;
	private JTextField NCtextFieldDiscount;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IStest frame = new IStest();
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
	public IStest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 373);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.inactiveCaptionText);
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setBackground(SystemColor.inactiveCaptionText);
		menuBar.add(mnMenu);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About aboutFrame = new About();
			    aboutFrame.setVisible(true);
			}
		});
		mntmAbout.setBackground(SystemColor.window);
		mnMenu.add(mntmAbout);
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmClose.setBackground(SystemColor.window);
		mnMenu.add(mntmClose);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel NewCustTab = new JPanel();
		tabbedPane.addTab("New Customer", null, NewCustTab, null);
		NewCustTab.setLayout(null);
		
		JLabel lblForenameNC = new JLabel("Forename");
		lblForenameNC.setBounds(25, 23, 61, 16);
		NewCustTab.add(lblForenameNC);
		
		NCtextFieldForename = new JTextField();
		NCtextFieldForename.setBounds(98, 17, 134, 28);
		NewCustTab.add(NCtextFieldForename);
		NCtextFieldForename.setColumns(10);
		
		JLabel lblSurnameNC = new JLabel("Surname");
		lblSurnameNC.setBounds(25, 62, 61, 16);
		NewCustTab.add(lblSurnameNC);
		
		NCtextFieldSurname = new JTextField();
		NCtextFieldSurname.setBounds(98, 56, 134, 28);
		NewCustTab.add(NCtextFieldSurname);
		NCtextFieldSurname.setColumns(10);
		
		NCtextFieldAdress = new JTextField();
		NCtextFieldAdress.setBounds(98, 96, 134, 28);
		NewCustTab.add(NCtextFieldAdress);
		NCtextFieldAdress.setColumns(10);
		
		NCtextFieldZip = new JTextField();
		NCtextFieldZip.setColumns(10);
		NCtextFieldZip.setBounds(98, 136, 134, 28);
		NewCustTab.add(NCtextFieldZip);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(25, 102, 61, 16);
		NewCustTab.add(lblAdress);
		
		JLabel lblZipCode = new JLabel("Zip code");
		lblZipCode.setBounds(25, 142, 61, 16);
		NewCustTab.add(lblZipCode);
		
		NCtextFieldIDnbr = new JTextField();
		NCtextFieldIDnbr.setBounds(384, 17, 134, 28);
		NewCustTab.add(NCtextFieldIDnbr);
		NCtextFieldIDnbr.setColumns(10);
		
		NCtextFieldEmail = new JTextField();
		NCtextFieldEmail.setColumns(10);
		NCtextFieldEmail.setBounds(384, 56, 134, 28);
		NewCustTab.add(NCtextFieldEmail);
		
		NCtextFieldCounty = new JTextField();
		NCtextFieldCounty.setColumns(10);
		NCtextFieldCounty.setBounds(384, 96, 134, 28);
		NewCustTab.add(NCtextFieldCounty);
		
		JLabel lblIdNumber = new JLabel("ID number");
		lblIdNumber.setBounds(294, 23, 66, 16);
		NewCustTab.add(lblIdNumber);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(294, 62, 83, 16);
		NewCustTab.add(lblNewLabel);
		
		JLabel lblRegion = new JLabel("County");
		lblRegion.setBounds(294, 102, 61, 16);
		NewCustTab.add(lblRegion);
		
		JLabel lblDriverLicence = new JLabel("Driver licence");
		lblDriverLicence.setBounds(294, 142, 95, 16);
		NewCustTab.add(lblDriverLicence);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(384, 136, 131, 50);
		NewCustTab.add(scrollPane);
		
		
	
	
		ArrayList<String> list = new ArrayList<String>();	
		list.add("B");
		list.add("BE");
		list.add("C");
		list.add("D");
		list.add("DE");
		
		JList<Object> licenceList = new JList<Object>(list.toArray());
		scrollPane.setViewportView(licenceList);
		
		
		
		
	
		JButton NCbtnCreate = new JButton("Create");
		NCbtnCreate.setForeground(SystemColor.activeCaptionText);
		NCbtnCreate.setBackground(SystemColor.window);
		NCbtnCreate.setBounds(401, 210, 117, 29);
		NewCustTab.add(NCbtnCreate);
		
		
		JButton NCbtnClear = new JButton("Clear");
		NCbtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NCtextFieldForename.setText(null);	
				NCtextFieldSurname.setText(null);
				NCtextFieldIDnbr.setText(null);
				NCtextFieldEmail.setText(null);
				NCtextFieldCounty.setText(null);
				NCtextFieldAdress.setText(null);
				NCtextFieldZip.setText(null);
				NCtextFieldDiscount.setText(null);
				
			}
		});
		NCbtnClear.setForeground(SystemColor.activeCaptionText);
		NCbtnClear.setBounds(306, 210, 83, 29);
		NewCustTab.add(NCbtnClear);
		
		JLabel lblDiscount = new JLabel("Discount");
		lblDiscount.setBounds(25, 184, 61, 16);
		NewCustTab.add(lblDiscount);
		
		NCtextFieldDiscount = new JTextField();
		NCtextFieldDiscount.setText("0.0");
		NCtextFieldDiscount.setColumns(10);
		NCtextFieldDiscount.setBounds(98, 178, 134, 28);
		NewCustTab.add(NCtextFieldDiscount);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(new MigLayout("", "[88px][181.00px,grow][85.00px][134px]", "[28px][][][][][][]"));
		
		JLabel lblVehicleModel = new JLabel("Vehicle model");
		panel_1.add(lblVehicleModel, "cell 0 0,alignx left,aligny center");
		
		textField = new JTextField();
		panel_1.add(textField, "cell 1 0,alignx left,aligny top");
		textField.setColumns(10);
		
		JLabel lblRegNumber = new JLabel("Reg. number");
		panel_1.add(lblRegNumber, "cell 2 0,alignx left,aligny center");
		
		textField_1 = new JTextField();
		panel_1.add(textField_1, "cell 3 0,alignx left,aligny top");
		textField_1.setColumns(10);
		
		JLabel lblLicenceReq = new JLabel("Licence req.");
		panel_1.add(lblLicenceReq, "cell 0 1,alignx trailing");
		
		textField_2 = new JTextField();
		panel_1.add(textField_2, "cell 1 1,alignx left");
		textField_2.setColumns(10);
		
		JButton btnBajs = new JButton("bajs");
		panel_1.add(btnBajs, "cell 3 6");
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
	
	}
}
