package OOP.Polymorphism.Run_time;

public class Test {
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.sound();
		
		Dog dog = new Dog();
		dog.sound();
		
		//Upcasting
		
		Animal animal = new Lion();
		animal.sound();
		
		Animal animal2 = new Dog();
		animal2.sound();
	}
}
