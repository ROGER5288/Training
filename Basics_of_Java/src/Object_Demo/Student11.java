package Object_Demo;

public class Student11 {
	int id;
	String name ;
	double percentage;

	public Student11(int id , String name, double percentage) {
	this.id = id;
	this. name = name;
	this.percentage = percentage;
	}
	
	public boolean equals(Object o) {
		
		Student11 s = (Student11)o;
		
		if(this.id == s.id) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Student11 s1 = new Student11(1,"Sourab", 80.0);
		Student11 s2 = new Student11(1,"Sourab", 80.0);
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}