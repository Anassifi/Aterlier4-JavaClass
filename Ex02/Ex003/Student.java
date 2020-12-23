package Ex02.Ex003;

public class Student extends Person{
	
	String diploma;
	
	public Student(String pName, String pFName, String pAddress, String pCity, String pBirthday, String diploma) {
		super(pName, pFName, pAddress, pCity, pBirthday);
		
		this.diploma = diploma;
	}

	@Override
	public String toString() {
		return "Student [diploma=" + diploma + ", toString()=" + super.toString() + "]";
	}

	

}
