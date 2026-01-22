package OOP.Inheritance;

class DummyB extends DummyA {

    static String b1 = "b1 var";

    public static void b1() {
        System.out.println("static b1()");
    }

    static {
        System.out.println("DummyB static init");
    }

    String b2 = "b2 var";

    public void b2() {
        System.out.println("Non static b2()");
    }

    {
        System.out.println("DummyB non static init");
    }

    public DummyB() {
        System.out.println("DummyB const");
    }

    public static void main(String[] args) {
        DummyB obj = new DummyB();
        System.out.println("main() Demo B");
        System.out.println(a1);
        a1();
        System.out.println(obj.a2);
        System.out.println(obj.b2);
        obj.a2();
    }
}