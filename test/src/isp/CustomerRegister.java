package isp;

import java.util.*;

public class CustomerRegister {
	private ArrayList<Customer> customers;
	
	//konstruktorn initierar instansvariabeln customers till en lista
	public CustomerRegister() {
		customers = new ArrayList<Customer>(); 
	}
	
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customerList) {
		customers = customerList;
	}
	//lägg till kund
	public void addCustomer(Customer aCustomer) {
		customers.add(aCustomer);
	}
	//hitta kund, linkedlist eller hashmap?
	public Customer findCustomer(String customerNbr) {
		for(Customer tmpCustomer : customers) {
			if(tmpCustomer.getCustomerNbr().equals(customerNbr)) {
				return tmpCustomer;
			}
		}
		return null;
	}
	//ta bort kund
	public void removeCustomer(String customerNbr) {
		Customer tmpCustomer = null;
		int i = 0;
		boolean found = false;
		
		while(i < customers.size() && !found) {
			tmpCustomer = customers.get(i);
			if(tmpCustomer.getCustomerNbr().equals(customerNbr)){
				customers.remove(i);
				found = true;				
			}
			i++;
		}
	}
	//uppdatera förnamnnamn
	public void updateFirstName(String customerNbr, String newName){
	Customer customer = findCustomer(customerNbr);
	if(customer != null){
	customer.setFirstName(newName);
		}
	}
	//uppdatera efternamn
	public void updateLastName(String customerNbr, String newName){
		Customer customer = findCustomer(customerNbr);
		if(customer != null){
		customer.setFirstName(newName);
		}
	}
	//uppdatera email
	public void updateEmail(String customerNbr, String newEmail){
		Customer customer = findCustomer(customerNbr);
		if(customer != null){
		customer.setEmail(newEmail);
		}
	}
	//uppdatera adress
	public void updateAdress(String customerNbr, String newAdress){
		Customer customer = findCustomer(customerNbr);
		if(customer != null){
		customer.setAdress(newAdress);
		}
	}
	//uppdatera körkort
	public void updateLicense(String customerNbr, String newLicense){
		Customer customer = findCustomer(customerNbr);
		if(customer != null){
		customer.setLicense(newLicense);
		}
	}
	//uppdatera personnummer(ska vi ha med denna trots att det är något man vanligtvis inte ändrar?)
	public void updatePersonalSecurityNbr(String customerNbr, String newPersonalSecurity){
		Customer customer = findCustomer(customerNbr);
		if(customer != null){
		customer.setPersonalSecurityNbr(newPersonalSecurity);
		}
	}
	//uppdatera kundnr(samma som ovan, ta bort?)
	public void updateCustomerNbr(String customerNbr, String newCustomerNbr){
		Customer customer = findCustomer(customerNbr);
		if(customer != null){
		customer.setCustomerNbr(newCustomerNbr);
		}
	}
	//uppdatera rabatt
	public void updateDiscount(String customerNbr, int newDiscount){
		Customer customer = findCustomer(customerNbr);
		if(customer != null){
		customer.setDiscount(newDiscount);
		}
	}
	
}
