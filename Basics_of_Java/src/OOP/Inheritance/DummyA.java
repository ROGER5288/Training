package OOP.Inheritance;

class DummyA {

    static String a1 = "a1 variable";

    public static void a1() {
        System.out.println("static a1()");
    }

    static {
        System.out.println("DummyA static init");
    }

    String a2 = "a2 variable";

    public void a2() {
        System.out.println("Non static a2()");
    }

    {
        System.out.println("DummyA non static init");
    }

    public DummyA() {
        System.out.println("DummyA const");
    }

    public static void main(String[] args) {
        System.out.println("DummyA main");
    }
}