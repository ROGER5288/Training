package Object_Demo;

public class Employee1 {
	int id;
	String name;
	String email;

	public Employee1(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public boolean equals(Object obj) {
		Student1 st = (Student1) obj;
		if(st.id == this.id ) {
			return true;
		}else {
			return false;
		}
	}
}
