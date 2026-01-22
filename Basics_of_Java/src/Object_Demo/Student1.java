package Object_Demo;

public class Student1 {
	int id;
	String name;
	String email;

	public Student1(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	
	public boolean equals(Object obj) {
		Employee1 em = (Employee1) obj;
		
		if(em.id == this.id ) {
			return true;
		}else {
			return false;
		}
	}
}