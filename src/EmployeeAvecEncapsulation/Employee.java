package EmployeeAvecEncapsulation;

public class Employee {
	
	// champs d'instance définis en privée
	private int numero;
	private String nom;
	private String qualification;
	private double salaire;
	   
	// Un constructeur
	public Employee(int numero, String nom, String qualification, 
			double salaire) {
		this.numero = numero;
		this.nom = nom;
		this.qualification = qualification;
		this.salaire = salaire;
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
	
}
