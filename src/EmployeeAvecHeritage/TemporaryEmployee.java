package EmployeeAvecHeritage;

import java.time.LocalDate;

public class TemporaryEmployee extends Employee {
	
	private LocalDate finDeContrat;

	// Constructeur
	public TemporaryEmployee(int numero, String nom, String qualification, 
			double salaire, LocalDate debutDeContrat, LocalDate finDeContrat) {
		super(numero, nom, qualification, salaire, debutDeContrat);
		this.finDeContrat = finDeContrat;
	}

	// Getters et setters
	public LocalDate getFinDeContrat() {
		return finDeContrat;
	}

	public void setFinDeContrat(LocalDate finDeContrat) {
		this.finDeContrat = finDeContrat;
	}
	
}
