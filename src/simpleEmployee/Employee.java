package simpleEmployee;

public class Employee {
	
	// Champs d'instance
	public int numero;
	public String nom;
	public String qualification;
	public double salaire;
	   
	// Un constructeur
	public Employee(int numero, String nom, String qualification, 
			double salaire) {
		this.numero = numero;
		this.nom = nom;
		this.qualification = qualification;
		this.salaire = salaire;
	}
	   
	// Méthode présenter
	public void presenter() {
		System.out.println("L'employé " + numero + " se nomme " + nom + " et occupe le poste de " + qualification);
	}

	// Méthode augmenterSalaire
	public void augmenterSalaire(int pourcentage) {
		// Augmentation du salaire seulement si le pourcentage eest compris entre 1 et 100
		if (pourcentage >= 1 && pourcentage <=100) {
			this.salaire = salaire + (salaire * pourcentage)/100;
		}
	}
	
	// Méthode changerQualification
	public void changerQualification(String qualification) {
		this.qualification = qualification;
	}
	
}
