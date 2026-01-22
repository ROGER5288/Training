package OOP.Inheritance;

class B extends A {
    int b = 200;

    public void b() {
        System.out.println("b()");
    }

    static {
        System.out.println("B static init");
    }

    public B() {
        super();
        System.out.println("B constructor");
    }
}
