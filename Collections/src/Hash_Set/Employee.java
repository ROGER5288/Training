package Hash_Set;

public class Employee {
	int id ;

	String name;

	double age;
	
	String email;

	public Employee(int id , String name, double age, String email) {
	this.id = id ;
	this.name = name;
	this. age = age ;
	this.email = email;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age +  ", email=" + email + "]";
	}
	public int hashCode() {
	return ((Integer)id).hashCode() + email.hashCode();
	}
	public boolean equals(Object obj) {
	Employee e = (Employee)obj;
	
	if(this.id == e.id) {
		return true;
	}
	return false;
	}
	
	
	
//	int id ;
//
//	String name;
//
//	double salary;
//
//	public Employee(int id , String name, double salary) {
//	this.id = id ;
//	this.name = name;
//	this. salary = salary ;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//	}
//	public int hashCode() {
//	return ((Integer)id).hashCode();
//	}
//	public boolean equals(Object obj) {
//	Employee e = (Employee)obj;
//	
//	if(this.id == e.id) {
//		return true;
//	}
//	return false;
//	}
}
