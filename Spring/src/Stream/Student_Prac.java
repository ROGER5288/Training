package Stream;

import java.util.List;
import java.util.Optional;

public class Student_Prac {
	public static void main(String[] args) {
		List<Student1> students = List.of(
				new Student1("Ram", 20),
				new Student1("Hari", 17),
				new Student1("Sita", 25)
				);
		
		students.stream()
				.forEach(s -> System.out.println("Name of all students :" +s.getName()));
				
		long count = students.stream()
				.filter(s -> s.getAge() > 18)
				.count();
				
		System.out.println("Count of adults : " + count);
		
		List<Student1> collect = students.stream()
				.filter(s-> s.getAge() >18)
				.map( s -> new Student1(s.name, s.age*2))
				.toList();
		System.out.println("After doubling the age of adults : " + collect);
		
		Optional<Student1> firstMinor = students.stream()
				.filter(s -> s.getAge() <18)
				.findFirst();
		System.out.println("The first minor "+firstMinor);
		
		int totalAdultAge = students.stream()
				.filter(s -> s.getAge() >18)
				.map(Student1::getAge)
				.reduce(0, Integer::sum);
		System.out.println("The sum of the adult's age"+ totalAdultAge);
		
		boolean Adults = students.stream()
				.allMatch(s -> s.getAge() >18);
		System.out.println("if all students are adult : "+ Adults);		
	}
}


 class Student1{
	String name;
	int age;
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}