package Object_Demo;

public class CompareObject {
	public static void main(String[] args) {
		Employee1 e = new Employee1(1, "Hari", "hari@gmail.com");
		Student1 s = new Student1(1, "Hari", "hari@gmail.com");

		System.out.println(e.equals(s));
	}
}
