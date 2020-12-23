package Ex03.Ex001;

import java.util.ArrayList; // import the ArrayList class

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Person> people = new ArrayList<Person>(8); // Create an ArrayList object
		
		//5 Employees, 2 managers, 1 director
		Person Kamal = new Employee("Kamal Habrich", "Kamal", "Elkasba 22", "Marrakech", "01-01-1996", 7000);
		Person Youssef = new Employee("Youssef Salim", "Youssef", "Hay Hassani 11", "Casablanca", "01-01-1994", 7000);
		Person Rochdi = new Employee("Abdelghafour Rochdi", "Abdelghafour", "Bab Marrakech 33", "Casablanca", "01-03-1994", 7000);
		Person Oumaima = new Employee("Oumaima Hajjami", "Oumaima", "Hay riad 33", "Rabat", "01-05-1996", 7000);
		Person Adnane = new Employee("Adnane Bouthir", "Adnane", "Lbadiie 89", "Marrakech", "01-01-1996", 7000);
		
		Person Bouchra = new Chef("Bouchra Marzak", "Bouchra", "Ramal 22", "Youssoufia", "01-01-1992", "IT");
		Person Abdelatif = new Chef("Abdelatif Tijani", "Abdelatif", "Agendiz 76", "Youssoufia", "01-01-1988", "IT");
		
		Person Adil = new Director("Adil Staff", "Adil", "Unknown", "Casablanca", "Unknown", "OCP");
		
		//Employees
		people.add(Kamal);
		people.add(Youssef);
		people.add(Rochdi);
		people.add(Oumaima);
		people.add(Adnane);
		
		//Chefs
		people.add(Bouchra);
		people.add(Abdelatif);
		
		//Director
		people.add(Adil);
		
		for (Person i : people) {
		      i.display();
		}
		
		
	}

}
