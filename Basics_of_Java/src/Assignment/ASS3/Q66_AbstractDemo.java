package Assignment.ASS3;
abstract class AbstractA {
    void display() {
        System.out.print("Display ");
    }
    abstract void show();
}

class ConcreteA extends AbstractA {
    void show() {
        System.out.print("Show");
    }
}

public class Q66_AbstractDemo {
    public static void main(String[] args) {
        ConcreteA obj = new ConcreteA();
        obj.display();
        obj.show();
    }
}