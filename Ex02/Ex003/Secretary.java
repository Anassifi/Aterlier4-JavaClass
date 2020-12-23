package Ex02.Ex003;

public class Secretary extends Person{
	
	
	String officeNumber;

	public Secretary(String pName, String pFName, String pAddress, String pCity, String pBirthday, String officeNumber) {
		super(pName, pFName, pAddress, pCity, pBirthday);
		
		this.officeNumber = officeNumber;
	}

	@Override
	public String toString() {
		return "Secretary [officeNumber=" + officeNumber + ", toString()=" + super.toString() + "]";
	}
	

}
