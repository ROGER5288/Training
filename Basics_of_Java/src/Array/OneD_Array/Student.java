package Array.OneD_Array;

public class Student {
	//name, id, Percentage
	String name;
	int id;
	double percentage;
	
	Student(int id,double percentage){
		this.id = id;
		this.percentage = percentage;
	}
	Student(String name, int id,double percentage){
		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}
	Student(String name, int id){
		this.name = name;
		this.id = id;
	}
	Student( int id, String name,double percentage){
		this.name = name;
		this.id = id;
		this.percentage = percentage;
	}
	
	public void display() {
		System.out.println("Name : "+ name);
		System.out.println("Id : "+id);
		System.out.println("Percentage : "+percentage);
	}
}
