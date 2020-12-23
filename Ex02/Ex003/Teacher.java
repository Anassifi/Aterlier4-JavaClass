package Ex02.Ex003;

public class Teacher extends Person{
	
	String specialty;

	public Teacher(String pName, String pFName, String pAddress, String pCity, String pBirthday, String specialty) {
		super(pName, pFName, pAddress, pCity, pBirthday);
		// TODO Auto-generated constructor stub
		
		this.specialty = specialty;
	}

	@Override
	public String toString() {
		return "Teacher [specialty=" + specialty + ", toString()=" + super.toString() + "]";
	}

}
