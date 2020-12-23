package Ex02.Ex001;

public class Articles {
    private String nom;
    private double prix;
    
    

    public Articles() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Articles(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public double getPrix() {
		return prix;
	}



	public void setPrix(double prix) {
		this.prix = prix;
	}



	public void afficher() {
    	System.out.println(nom + " prix d'article est: " + prix);
    }
}


