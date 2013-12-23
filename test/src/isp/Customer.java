package isp;

import java.util.*;

public class Customer {
	private String firstName;
	private String lastName;
	private String email;
	private String adress;
	private String license;
	private String personalSecurityNbr;
	private String customerNbr;
	private int discount;
	private ArrayList<Reservation> cReservations;

	public Customer(){
		this.setReservations(new ArrayList<Reservation>());
	}
	public Customer(String fName, String lName, String email, String adress, String license, String personalSecurityNbr, String customerNbr, int discount){
		this.setReservations(new ArrayList<Reservation>());
		this.setFirstName(fName);
		this.setLastName(lName);
		this.setEmail(email);
		this.setAdress(adress);
		this.setLicense(license);
		this.setPersonalSecurityNbr(personalSecurityNbr);
		this.setCustomerNbr(customerNbr);
		this.setDiscount(discount);
	}
	
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String name){
		this.firstName = name;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String name){
		this.lastName = name;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getAdress(){
		return adress;
	}
	public void setAdress(String adress){
		this.adress = adress;
	}
	public String getLicense(){
		return license;
	}
	public void setLicense(String license){
		this.license = license;
	}
	public String getPersonalSecurityNbr(){
		return personalSecurityNbr;
	}
	public void setPersonalSecurityNbr(String personalSecurityNbr){
		this.personalSecurityNbr = personalSecurityNbr;
	}
	public String getCustomerNbr(){
		return customerNbr;
	}
	public void setCustomerNbr(String customerNbr){
		this.customerNbr = customerNbr;
	}
	public int getDiscount(){
		return discount;
	}
	public void setDiscount(int discount){
		this.discount = discount;
	}
	public ArrayList<Reservation> getReservations() {
		return cReservations;
	}
	public void setReservations(ArrayList<Reservation> reservations) {
		this.cReservations = reservations; 
	}
	//lägg till reservation i reservationslistan för kund
	public void addReservation(Reservation aReservation) {
		this.getReservations().add(aReservation);
	}
}
