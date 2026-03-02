package Interface;


//Functional Interface (ONLY ONE abstract method)
interface Cal {
int add(int n, int m);
}

public class Main {
public static void main(String[] args) {

   // Lambda expression
   Cal c = (n, m) -> n + m;

   int result = c.add(10, 20);

   System.out.println("Result = " + result);
}
}
