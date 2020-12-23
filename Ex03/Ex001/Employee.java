package Ex03.Ex001;

public class Employee extends Person{
	
	int salary;

	public Employee(String name, String fname, String address, String city, String dateOfBirth, int salary) {
		super(name, fname, address, city, dateOfBirth);
		
		this.salary = salary;
	}
	
	public void display() {
	    System.out.println("name: " + name + ", first name: " + fname + ", address: " + address + ", city: " + city + ", date of birth: " + dateOfBirth + ", salary: " + salary);
	}

}
