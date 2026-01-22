package OOP.Inheritance;

public class Cow extends Animal1 {

	public Cow(String name) {
		super(name);
	}

	public void moo() {
		System.out.println(name + " says Moo");
	}
}
