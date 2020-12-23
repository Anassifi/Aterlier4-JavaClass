package Ex02.Ex003;

public class Person extends PersonAbstract{
	String name;
	String fname;
	String address;
	String city;
	String birthday;
	static int i;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Person(String pName, String pFName, String pAddress, String pCity, String pBirthday) {
		name = pName;
		fname = pFName;
		address = pAddress;
		city = pCity;
		birthday = pBirthday;
		
		i++;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", fname=" + fname + ", address=" + address + ", city=" + city + ", birthday="
				+ birthday + "]";
	}
	
	public String modifyPerson(String address, String city) {
		//modify the address and the city
		
		this.address = address;
		this.city = city;
		System.out.println("Your new informations are : " + "city :" + city + ", address :" + address);
		return null;
	}
	
	public void writePerson() {
		System.out.println("Person characteristics : " + " name : " + name + ", fname : " + fname + ", address : " + address + ", city : " + city + ", birthday : " + birthday);
	}
	
	public void counter() {
		System.out.println(i);
	}
	
	
}
