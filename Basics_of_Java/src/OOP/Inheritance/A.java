package OOP.Inheritance;

class A {
    int a = 100;

    public void a() {
        System.out.println("a()");
    }

    static {
        System.out.println("A static init");
    }

    public A() {
        super();
        System.out.println("A constructor");
    }
}


