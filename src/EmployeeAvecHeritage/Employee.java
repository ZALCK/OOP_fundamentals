package EmployeeAvecHeritage;

import java.time.LocalDate;

public class Employee {

	// champs d'instance définis en privée
	private int numero;
	private String nom;
	private String qualification;
	protected double salaire;
	private LocalDate debutDeContrat;
	   
	// Un constructeur
	public Employee(int numero, String nom, String qualification, double salaire, 
			LocalDate debutDeContrat) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.qualification = qualification;
		this.salaire = salaire;
		this.debutDeContrat = debutDeContrat;
	}

	// GETTERS ET SETTERS DANS ATTRIBUTS PRIVEE DE LA CLASSE Employee
	public int getNumero() {
		return numero;
	}

	public String getNom() {
		return nom;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		if(salaire >= 200000) { 
			this.salaire = salaire;
		} else {
			System.out.println("Le salaire ne peut être inférieur au SMIC");
		}
	}

	public LocalDate getDebutDeContrat() {
		return debutDeContrat;
	}

	public void setDebutDeContrat(LocalDate debutDeContrat) {
		this.debutDeContrat = debutDeContrat;
	}
	
	public void presenter() {
		System.out.println("L'employé " + numero + " se nomme " + nom);
	}

}
