package Stream;

//for running make/rename student1 class to student which is at the buttom

import java.util.Comparator;
import java.util.List;
import java.util.Optional;


/*
 * Common Intermediate operations
 * filter() - remove elements
 * map() - transform elements
 * sorted() - sort elements
 * distinct() - remove duplicates
 * limit() - take 1st n
 * skip() - skip 1st n
 * peek() - debug/ log
 * 
 */


/*
 Common terminal operators:
 ======================
toList(), collect - gather results
for Each() - iterate
count() - count elements
findFirst() - get first
anyMatch(), allMatch(), nonMatch() - condition check
reduce() - aggregation
*/



public class Passed_Student {
	public static void main(String [] args) {
		List<Student> students = List.of(
				new Student("A", 61, 20),
				new Student("B", 20, 23),
				new Student("C", 79, 21),
				new Student("AK", 97, 18),
				new Student("D", 97, 18),
				new Student("AB", 61, 18),
				new Student("AJ", 85, 18),
				new Student("DB", 65, 18),
				new Student("E", 93, 22)
				);
		
//		List<Student> passed = students.stream().filter(s -> s.marks > 60 ).toList();
//		
//		List<Student> age = students.stream().filter( s -> s.age >20).toList();
//		
//		
//		List<Student> passed1 = students.stream()
//										.filter(s -> s.marks > 60 ) //Not mutated or transformed
//										.map(s -> new Student(s.name, s.marks*2, s.age)) //Transformed
//										.toList();
//		
//		
//		//peek can be used any where mainly used for debugging
//		List<Student> passed2 = students.stream()
//				.peek(System.out::println)
//				.filter(s -> s.marks > 60 ) //Not mutated or transformed
//				.map(s -> new Student(s.name, s.marks*2, s.age)) //Transformed
//				.peek(System.out::println)
//				.toList();
		
		
		
//		List<Student> passed3 = students.stream()
//				.peek(s -> System.out.println("Passed: " + s.name)) //Mutation
//				.filter(s -> s.marks > 60 ) //Not mutated or transformed
//				.peek(s -> s.setMarks(s.marks*2)) //Mutation    ---> peek (marks*2)
//				.map(s -> new Student(s.name, s.marks*2, s.age)) //Transformed  ---> map[(peek(marks*2)) * 2]
//				.peek(System.out::println) //System.out::println object of the class student
//				.toList();
		
		
		
		//Multiple filters 
//		List<Student> passed4 = students.stream()
//				.filter(s -> s.marks > 60 ) 
//				.filter(s -> s.name.startsWith("A"))
//				.toList();
		
		
		//Sort by name
//		List<Student> passed5 = students.stream()
//				.filter(s -> s.marks > 60 ) 
//				.sorted((s1, s2) -> s1.name.compareTo(s2.name))
//				.toList();
		//Sort by marks
		List<Student> passed6 = students.stream()
				.sorted(Comparator
						.comparingInt((Student s) ->s.marks)
						.thenComparing((Student s) -> s.name))
				.toList();
		
		//toList(), collect - gather results
		List<Student> passed7 = students.stream()
										.filter(s -> s.getAge() >18)
										.toList();
	
		//for Each() - iterate
		students.stream()
				.forEach(s -> System.out.println(s.getName()));
				
		
		
		//count() - count elements
		long count = students.stream()
				.filter(s -> s.getAge() > 18)
				.count();
		System.out.println(count);
		
		//findFirst() - get first
		Optional<Student> first = 
				students.stream()
				.filter(s -> s.getAge() > 18)
				.findFirst();
		System.out.println(first);
		
		//anyMatch(), allMatch(), nonMatch() - condition check
		//anyMatch()
		boolean anyMinor = 
				students.stream()
				.anyMatch(s -> s.getAge() <18);
		System.out.println(anyMinor);
		
		//allMatch()
		boolean allAdults = 
				students.stream()
				.allMatch(s -> s.getAge()>18);
		System.out.println(allAdults);
		
		//noneMatch() 
		boolean noneSenior = 
				students.stream()
				.noneMatch(s -> s.getAge() > 60);
		System.out.println(noneSenior);
				
		
		
		//reduce() - aggregation
		int totalAge = students.stream()
								.map(Student::getAge) // same as ----> map(s -> s.getAge())
								.reduce(0,Integer::sum); // same as -----> reduce(0,(a, b) -> a + b) here a value is 0(identity value) at first then that will be updated by time to sum 
		System.out.println(totalAge);
		
//		System.out.println(age);
//		
//		System.out.println(passed.size());
//		System.out.println(passed1);
//		System.out.println(passed2);
//		System.out.println(passed3);
//		System.out.println(passed4);
//		System.out.println(passed5);
//		System.out.println(passed6);
		System.out.println(passed7);
	}
}

class Student{ // for running make/rename student1 class to student
	public Student(String string, int i, int j) {
		this.marks = i;
		this.name = string;
		this.age = j;
	}
	String name;
	int marks;
	int age;
	
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	 @Override
	    public String toString() {
	        return "Student{name='" + name + 
	               "', marks=" + marks + 
	               ", age=" + age + "}";
	    }
}

