package OOP.Inheritance;

public class Dog extends Animal1 {

	public Dog(String name) {
		super(name);
	}

	public void bark() {
		System.out.println(name + " says Bark");
	}

	public static void main(String[] args) {
		Dog d = new Dog("Bruno");
		d.eat();
		d.bark();
	}
}
