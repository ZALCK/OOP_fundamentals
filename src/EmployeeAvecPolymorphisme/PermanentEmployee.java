package EmployeeAvecPolymorphisme;

import java.time.LocalDate;

public class PermanentEmployee extends Employee {
	
	public PermanentEmployee(int numero, String nom, String qualification, 
			double salaire, LocalDate debutDeContrat) {
		super(numero, nom, qualification, salaire, debutDeContrat);
	}

	public void augmenterSalaire(double pourcentage) {
		// Augmentation du salaire seulement si le pourcentage eest compris entre 1 et 100
		if (pourcentage >= 1 && pourcentage <=100) {
			this.salaire = salaire + (salaire * pourcentage)/100;
		}
	}
	
	// Réécriture de la méthode presenter
	public void presenter() {
		System.out.println("L'employé " + numero + " se nomme " + nom 
				+ " et son contrat est à durée indéterminé.");
	}
	
	// Surcharge de la méthode presenter
	public void presenter(int nombreAnnees) {
		System.out.println(nom + " travaille pour nous depuis " + nombreAnnees + " ans.");
	}

}
