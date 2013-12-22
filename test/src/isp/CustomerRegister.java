package isp;

import java.util.*;

public class CustomerRegister {
	private LinkedList customers;
	
	//konstruktorn initierar instansvariabeln customers till en lista(hashmap)
	public CustomerRegister() {
		customers = new LinkedList<Customer>(); 
	}
	
	public LinkedList getCustomers() {
		return customers;
	}
	public void setCustomers(LinkedList customerList) {
		customers = customerList;
	}
	//l�gg till kund
	public void addCustomer(Customer aCustomer) {
		customers.add(aCustomer);
	}
	//ta bort kund
	public void removeCustomer(Customer aCustomer) {
		customers.remove(aCustomer);
	} }
	//hitta kund, linkedlist eller hashmap?
