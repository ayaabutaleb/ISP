package test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

import net.miginfocom.swing.MigLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField NewCustTFforename;
	private JTextField NewCustTFsurname;
	private JTextField NewCustTFemail;
	private JTextField NewCustTFid;
	private JTextField NewCustTFadress;
	private JTextField NewCustTFzip;
	private JTextField NewCustTFcounty;
	private JTextField NewCustTFdiscount;
	public ArrayList<String> CustList = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 630, 390);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		menuBar.setForeground(Color.DARK_GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnMenu = new JMenu("Menu");
		mnMenu.setBackground(Color.LIGHT_GRAY);
		menuBar.add(mnMenu);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.setBackground(Color.LIGHT_GRAY);
		mnMenu.add(mntmAbout);
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About aboutFrame = new About();
			    aboutFrame.setVisible(true);
			}
		});
		
		JMenuItem mntmClose = new JMenuItem("Close");
		mntmClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mntmClose.setBackground(Color.LIGHT_GRAY);
		mnMenu.add(mntmClose);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel NewCustomer = new JPanel();
		tabbedPane.addTab("New Customer", null, NewCustomer, null);
		NewCustomer.setLayout(new MigLayout("", "[][164.00,grow][182.00][152.00,left]", "[][][][50.00][][50.00][][]"));
		
		JLabel NewCustlabelforename = new JLabel("Forename*");
		NewCustomer.add(NewCustlabelforename, "cell 0 0,alignx trailing");
		
		NewCustTFforename = new JTextField();
		NewCustomer.add(NewCustTFforename, "cell 1 0,alignx left");
		NewCustTFforename.setColumns(10);
		
		JLabel NewCustlabelsurname = new JLabel("Surname*");
		NewCustomer.add(NewCustlabelsurname, "cell 2 0,alignx trailing");
		
		NewCustTFsurname = new JTextField();
		NewCustomer.add(NewCustTFsurname, "cell 3 0,growx");
		NewCustTFsurname.setColumns(10);
		
		JLabel NewCustlabelID = new JLabel("ID number*");
		NewCustomer.add(NewCustlabelID, "cell 0 1,alignx trailing");
		
		NewCustTFid = new JTextField();
		NewCustomer.add(NewCustTFid, "cell 1 1,growx");
		NewCustTFid.setColumns(10);
		
		JLabel NewCustlabelEmail = new JLabel("Email");
		NewCustomer.add(NewCustlabelEmail, "cell 2 1,alignx trailing");
		
		NewCustTFemail = new JTextField();
		NewCustomer.add(NewCustTFemail, "cell 3 1,growx");
		NewCustTFemail.setColumns(10);
		
		JLabel NewCustlabelAdress = new JLabel("Adress*");
		NewCustomer.add(NewCustlabelAdress, "cell 0 2,alignx trailing");
		
		NewCustTFadress = new JTextField();
		NewCustomer.add(NewCustTFadress, "cell 1 2,growx");
		NewCustTFadress.setColumns(10);
		
		JLabel NewCustlabelZip = new JLabel("Zip code*");
		NewCustomer.add(NewCustlabelZip, "cell 2 2,alignx trailing");
		
		NewCustTFzip = new JTextField();
		NewCustomer.add(NewCustTFzip, "cell 3 2,growx");
		NewCustTFzip.setColumns(10);
		
		JLabel NewCustlabelCounty = new JLabel("County*");
		NewCustomer.add(NewCustlabelCounty, "cell 0 3,alignx trailing,aligny top");
		
		NewCustTFcounty = new JTextField();
		NewCustomer.add(NewCustTFcounty, "cell 1 3,growx,aligny top");
		NewCustTFcounty.setColumns(10);
		
		JLabel NewCustlabelLicence = new JLabel("Drivers licence");
		NewCustomer.add(NewCustlabelLicence, "cell 2 3,alignx right,aligny top");
		
		JScrollPane scrollPane = new JScrollPane();
		NewCustomer.add(scrollPane, "cell 3 3,grow");
		
		ArrayList<String> licencelist = new ArrayList<String>();	
		licencelist.add("B");
		licencelist.add("BE");
		licencelist.add("C");
		licencelist.add("D");
		licencelist.add("DE");
		
		JList<Object> licenceList = new JList<Object>(licencelist.toArray());
		licenceList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		scrollPane.setViewportView(licenceList);
		
		JLabel NewCustlabelDiscount = new JLabel("Discount");
		NewCustomer.add(NewCustlabelDiscount, "cell 0 4,alignx trailing");
		
		NewCustTFdiscount = new JTextField();
		NewCustTFdiscount.setText("0.0");
		NewCustomer.add(NewCustTFdiscount, "cell 1 4,growx");
		NewCustTFdiscount.setColumns(10);
		
		
		
		
		JButton NCbtnClear = new JButton("Clear");			
		NewCustomer.add(NCbtnClear, "flowx,cell 3 7,alignx right");
		NCbtnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewCustTFforename.setText(null);	
				NewCustTFsurname.setText(null);
				NewCustTFid.setText(null);
				NewCustTFemail.setText(null);
				NewCustTFcounty.setText(null);
				NewCustTFadress.setText(null);
				NewCustTFzip.setText(null);
				NewCustTFdiscount.setText("0.0");
			}
		});
		
		
		JButton btnCreateCustomer = new JButton("Create");
		NewCustomer.add(btnCreateCustomer, "cell 3 7,alignx right");
		btnCreateCustomer.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				
				
				CustList.add(NewCustTFforename.getText());
				CustList.add(NewCustTFsurname.getText());
				CustList.add(NewCustTFid.getText());
				CustList.add(NewCustTFemail.getText());
				CustList.add(NewCustTFcounty.getText());
				CustList.add(NewCustTFadress.getText());
				CustList.add(NewCustTFzip.getText());
				
			}
		});
		
		
		
		JPanel NewVehicle = new JPanel();
		tabbedPane.addTab("New Vehicle", null, NewVehicle, null);
		NewVehicle.setLayout(new MigLayout("", "[]", "[]"));
	}

}
