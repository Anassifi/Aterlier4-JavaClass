package Ex02.Ex002;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount savingHakime = new SavingAccount(0012346000, 10000);
		savingHakime.add(2000);
		savingHakime.add(2000);
//		savingHakime.display();
		savingHakime.withDraw(2000);
//		newCar.calcAnnualInter(2000);
		
//		System.out.println(savingHakime.calcAnnualInter(savingHakime.balance));
	}

}
