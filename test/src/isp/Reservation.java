package isp;

public class Reservation {
	private Vehicle reservVehicle;
	private Customer reservCustomer;
	private String dateReserved;
	
	public Vehicle getReservVehicle() {
		return reservVehicle;
	}
	public void setReservVehicle(Vehicle vehicle) {
		reservVehicle = vehicle;
	}
	public Customer getReservCustomer() {
		return reservCustomer;
	}
	public void setReservCustomer(Customer customer) {
		reservCustomer = customer;
	}
	public String getDateReserved() {
		return dateReserved;
	}
	public void setDateReserved() {
	}

}