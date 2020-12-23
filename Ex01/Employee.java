package Ex01;

public class Employee {
	private String nom;
	private String prenom;
	private String address;
	private int anneeNaissance;
	private int anneeEncours;

	public Employee(String employeeName, String employeePrenom, String employeeAddress, int employeeAnneeNaissance,
			int employeeAnneeEncours) {
		nom = employeeName;
		prenom = employeePrenom;
		address = employeeAddress;
		anneeNaissance = employeeAnneeNaissance;
		anneeEncours = employeeAnneeEncours;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAnneeNaissance() {
		return anneeNaissance;
	}

	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

	public int getAnneeEncours() {
		return anneeEncours;
	}

	public void setAnneeEncours(int anneeEncours) {
		this.anneeEncours = anneeEncours;
	}

	public int calculerAge(int anneeEncours, int anneeNaissance) {
		return anneeEncours - anneeNaissance;
	}

	public void afficherInfoClient() {
		// code
		System.out.println(prenom + " " + nom + ", né le " + anneeNaissance + " habitant à " + address);
	}

}
