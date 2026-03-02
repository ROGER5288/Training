package Array_List.ArrayList;

public class Student {
	private static final double Student = (Double) null;
	int id;
	String name;
	double perc;

	public Student(int id, String name, double perc) {
		this.id = id;
		this.name = name;
		this.perc = perc;
	}
	public double Check(double perc) {
		if(this.perc < 40) {
			return this.Student;
		}
		return perc;
	}
	public void display() {
		System.out.println("ID: " + id + "\nName: " + name + "\nPercentage: " + perc);
	}
}