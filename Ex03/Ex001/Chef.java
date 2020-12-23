package Ex03.Ex001;

public class Chef extends Person{
	
	String service;

	public Chef(String name, String fname, String address, String city, String dateOfBirth, String service) {
		super(name, fname, address, city, dateOfBirth);
		// TODO Auto-generated constructor stub
		
		this.service = service;
	}

	
	public void display() {
	    System.out.println("name: " + name + ", first name: " + fname + ", address: " + address + ", city: " + city + ", date of birth: " + dateOfBirth + ", service: " + service);
	}
}
