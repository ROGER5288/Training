package OOP.Inheritance;

public class Employee1 {
	int id;
	String name;
	double salary;

	public Employee1() {
		System.out.println("Default constructor called");
	}

	public Employee1(int id) {
		this.id = id;
		System.out.println("Constructor with id called: id = " + id);
	}

	public Employee1(int id, String name) {
		this(id);
		this.name = name;
		System.out.println("Constructor with id & name called: name = " + name);
	}

	public Employee1(int id, String name, double salary) {
		this(id, name);
		this.salary = salary;
		System.out.println("Constructor with id, name & salary called: salary = " + salary);
	}

	public static void main(String[] args) {
		System.out.println("Creating e1");
		Employee1 e1 = new Employee1();

		System.out.println("\nCreating e2");
		Employee1 e2 = new Employee1(101);

		System.out.println("\nCreating e3");
		Employee1 e3 = new Employee1(102, "Ravi");

		System.out.println("\nCreating e4");
		Employee1 e4 = new Employee1(103, "Rohon", 50000);
	}
}
