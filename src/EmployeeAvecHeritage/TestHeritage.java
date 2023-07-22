package EmployeeAvecHeritage;

import java.time.LocalDate;

public class TestHeritage {

	public static void main(String[] args) {
		
		PermanentEmployee permanentEmployee_1 = new PermanentEmployee(124, "Thomas", "Ingénieur", 700000, LocalDate.of(1999, 12, 31));
		permanentEmployee_1.augmenterSalaire(20);
		permanentEmployee_1.presenter();
		
		TemporaryEmployee temporaryEmployee_1 = new TemporaryEmployee(126, "François", "Technicien", 350000, LocalDate.of(2020, 10, 15), LocalDate.of(2025, 10, 15));
		temporaryEmployee_1.presenter();
		System.out.println(temporaryEmployee_1.getNom() + " achève son contrat le " + temporaryEmployee_1.getFinDeContrat());
	}

}
