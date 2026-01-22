package OOP.Inheritance;

class C extends B {
    int c = 300;

    public void c() {
        System.out.println("c()");
    }

    static {
        System.out.println("C static init");
    }

    public C() {
        super();
        System.out.println("C constructor");
    }

    public static void main(String[] args) {
        C obj = new C();

        System.out.println(obj.c);
        System.out.println(obj.b);
        System.out.println(obj.a);

        obj.c();
        obj.b();
        obj.a();
    }
}

