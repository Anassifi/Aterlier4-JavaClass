package Ex03.Ex002;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Work project = new Work("Atelier4", "12-16-2020", true);
		
		Library weLoveBooks = new Library("myLib", "12-16-2020", true);
		
		Book warNPeace = new Book("War and Peace", "1867", true, "Unknown");
//		warNPeace.setTitle("War and Peace");
//		warNPeace.setDate("1867");
//		warNPeace.setExistence(true);
//		trash.setWork(warNPeace);
//		
		Book tSotW = new Book("The Shadow of the Wind","1998", true, "Unknown");
		Subscriber Hakime = new Subscriber(1, "Hakime Nassifi", 001, true);
		
		weLoveBooks.setSub(Hakime);
		
		Subscriber tsting = weLoveBooks.getSub(1);
		
		weLoveBooks.setWork(tSotW);
		weLoveBooks.setWork(warNPeace);
		Work test = weLoveBooks.getWork("War and Peace");
		System.out.println(test.getTitle());
		System.out.println(tsting.getName());
	}

}
