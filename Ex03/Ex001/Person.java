package Ex03.Ex001;

public class Person {
		
	String name;
	String fname;
	String address;
	String city;
	String dateOfBirth;
	
	
	public Person(String name, String fname, String address, String city, String dateOfBirth) {
		this.name = name;
		this.fname = fname;
		this.address = address;
		this.city = city;
		this.dateOfBirth = dateOfBirth;
	}
	
	public void display() {
	    System.out.println("name: " + name + ", first name: " + fname + ", address: " + address + ", city: " + city + ", date of birth: " + dateOfBirth);
	}
	
	
}
