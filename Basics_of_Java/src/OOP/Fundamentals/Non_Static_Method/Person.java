package OOP.Fundamentals.Non_Static_Method;

public class Person {
	String name;//null
	int age;//0
	String gender;//null
//	Person(){
//		System.out.println("Hello");
//	}
	Person(){
		System.out.println("No Arguments");
	}
	Person(int a){
		System.out.println("Person int a");
	}
	/*this keyword is referring to Current Class Instance Variables: The 
	 * most common use is to resolve ambiguity when an instance variable 
	 * has the same name as a local variable or method parameter.
	 * means when global and local variable has the same name then this 
	 * keyword is used to call the global variable  
	*/
	public void display(){	
		System.out.println("this "+this);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
	}
//	public void initialize(String name, int age, String gender) {
//		System.out.println("this : "+this);
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//	}
	Person(String name, int age, String gender) {
		System.out.println("this : "+this);
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
