package SortedSet.TreeSet;


public class Employee implements Comparable<Employee>{
	
	int id;
	String name;
	double salary;

	public Employee(int id , String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	// Descending Order
	public int compareTo(Employee p) {
		if(this.salary < p.salary) {
			return 1;
		}else if(this.salary > p.salary) {
			return -1;
		}
		else {
			int result = this.name.compareToIgnoreCase(p.name);
			if(result < 0) {
				return 1;
			}else if(result >0) {
				return -1;
			}else {
				if(this.id < p.id) {
					return 1;
				}else if(this.id > p.id) {
					return -1;
				}else {
					return 0;
				}
			}	
		}
	}
	
	@Override
	public String toString() {
		return "\nId: " + id + "\nName: " + name + "\nSalary: " + salary;
	}
}

