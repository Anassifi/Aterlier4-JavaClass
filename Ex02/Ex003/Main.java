package Ex02.Ex003;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Hakime = new Student("Abdelhakim Nassifi", "Abdelhakim", "SYBA N32", "Marrakech", "14/12/1996", "CS Degree");
		Person Bouchra = new Teacher("Bouchra Marzak", "Bouchra", "Unknown", "Casablanca", "Unknown", "Computer Science");

		Hakime.modifyPerson("Agendiz", "Youssoufia");
		
		System.out.println(Hakime.toString());
		Bouchra.writePerson();
		
//		Bouchra.counter();
	}

}
