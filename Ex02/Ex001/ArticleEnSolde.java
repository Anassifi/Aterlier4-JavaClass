package Ex02.Ex001;

public class ArticleEnSolde extends Articles {

	public ArticleEnSolde() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArticleEnSolde(String nom, double prix) {
		super(nom, prix);
		// TODO Auto-generated constructor stub
	}

	public void afficher() {
		System.out.println(getNom() + " prix d'article en solde est: " + (getPrix() * 0.8));
	}

}