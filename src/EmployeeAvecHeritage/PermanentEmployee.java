package EmployeeAvecHeritage;

import java.time.LocalDate;

public class PermanentEmployee extends Employee {
	
	public PermanentEmployee(int numero, String nom, String qualification, 
			double salaire, LocalDate debutDeContrat) {
		super(numero, nom, qualification, salaire, debutDeContrat);
	}

	// Méthode augmenterSalaire
	public void augmenterSalaire(int pourcentage) {
		// Augmentation du salaire seulement si le pourcentage eest compris entre 1 et 100
		if (pourcentage >= 1 && pourcentage <=100) {
			this.salaire = salaire + (salaire * pourcentage)/100;
		}
	}

}
