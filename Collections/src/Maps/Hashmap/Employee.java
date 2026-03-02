package Maps.Hashmap;

public class Employee {
	int id;
	String name;
	double salary;
	
	public Employee() {
		
	}
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int hashCode() {
		return this.id;

	}

	public boolean equals(Object obj) {
		Employee emp = (Employee)obj;
		if(this.id == emp.id) {
			return true;
		}
		return false;
	}
	public String toString() {
		return "id : " + id + ", name : " + name + "salary : " + salary;
	}
}
