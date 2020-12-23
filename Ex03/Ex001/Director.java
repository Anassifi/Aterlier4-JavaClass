package Ex03.Ex001;

public class Director extends Person{
	
	String company;

	public Director(String name, String fname, String address, String city, String dateOfBirth, String company) {
		super(name, fname, address, city, dateOfBirth);
		// TODO Auto-generated constructor stub
		
		this.company = company;
	}
	
	public void display() {
	    System.out.println("name: " + name + ", first name: " + fname + ", address: " + address + ", city: " + city + ", date of birth: " + dateOfBirth + ", company: " + company);
	}

}
