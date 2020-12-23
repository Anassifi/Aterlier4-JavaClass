package Ex02.Ex001;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Articles shoe = new Articles();
		
		ArticleEnSolde shoes = new ArticleEnSolde();
		shoes.setNom("Nike Air");
		shoes.setPrix(700);
		
		shoe.setNom("Addias");
		shoe.setPrix(700);
		
		shoe.afficher();
		shoes.afficher();
	}

}
