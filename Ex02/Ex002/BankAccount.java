package Ex02.Ex002;

class BankAccount {
	protected long accountNumber;
	protected double balance;
		
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	//Adding to balance by accountNumber
	
	public double add(double amount) {
		return  balance += amount;
	}
	
	public double withDraw(int amount) {
		
		if(balance < amount) {
			System.out.println("Your balance is lower than the amount : " + amount);
		} else {
			System.out.println("Your new balance is: " + (balance - amount));
		}
		
		return	balance;
	}
	
	public void display() {
		System.out.println("Your balance is : " + balance);
	}
}
