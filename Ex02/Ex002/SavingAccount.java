package Ex02.Ex002;

public class SavingAccount extends BankAccount{
	
	public SavingAccount(long accountNumber, double balance) {
		super(accountNumber, balance);
	}

	public double calcAnnualInter(double yourBalance) {
		//A = P(1 + rt)
		/* A = Amount
		 * P = Principal
		 * r = Rate (per year)
		 * t = Time */
		if (yourBalance > 200) {
			double yourRate = 0.875;
			double amount = yourBalance * (1 + (yourRate * 10));
			
			return amount;
		} else {
			System.out.println("Your balance is not enough!");
			return yourBalance;
		}
		
	}

}
