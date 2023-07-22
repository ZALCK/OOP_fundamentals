package simpleEmployee;

public class TestEmployee {

	public static void main(String[] args) {

		Employee employee_1 = new Employee(124, "Thomas", "Ingénieur", 700000);
		
		Employee employee_2 = new Employee(126, "François", "Technicien", 350000);
		
		employee_1.presenter();
		
		employee_2.presenter();

	}
}
