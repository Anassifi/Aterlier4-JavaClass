package Ex03.Ex002;

public class Subscriber{
	
	int identityNumber;
	String name;
	int subscriptionNumber;
	boolean bookTaken; //Can be string

	public Subscriber(int identityNumber, String name, int subscriptionNumber, boolean bookTaken) {

		// TODO Auto-generated constructor stub
		
		this.identityNumber = identityNumber;
		this.name = name;
		this.subscriptionNumber = subscriptionNumber;
		this.bookTaken = bookTaken;
	}

	public int getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(int identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSubscriptionNumber() {
		return subscriptionNumber;
	}

	public void setSubscriptionNumber(int subscriptionNumber) {
		this.subscriptionNumber = subscriptionNumber;
	}

	public boolean isBookTaken() {
		return bookTaken;
	}

	public void setBookTaken(boolean bookTaken) {
		this.bookTaken = bookTaken;
	}
	
	
	
	public void display() {
		System.out.println("identityNumber: " + identityNumber + ", name: " + name + ", subscriptionNumber: " + subscriptionNumber + ", bookTaken: " + bookTaken);
	}

}
