package OOP.Inheritance;


public class Developer extends Employee {

	String technology;

	public Developer(int id, String name, int age, double salary, String technology) {
		super(id, name, age, salary); 
		this.technology = technology;
	}

	public void displayDeveloper() {
		displayEmp();     
		System.out.println(technology);
	}

	public static void main(String[] args) {
		Developer d = new Developer(
				101,
				"NIL NITIN MUKESH",
				25,
				50000,
				"SpringBoot"
		);
		d.displayDeveloper();
	}
}