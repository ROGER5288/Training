package Generics;

public class Customer {
	static void main() {
//		Box<String> box = new Box();
//		box.set("10");
		
		Box<Integer> box = new Box();
		box.set(10);
		
//		String s = box.get();
		Integer s = box.get();
	}
}

class Box<T>{
	T value;
	
	void set(T value) {
		this.value = value;
	}
	
	T get() {
		return value;
	}
}
