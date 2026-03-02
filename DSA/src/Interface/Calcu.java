package Interface;

//Step 1: Interface
interface Calc {
 int add(int n, int m);   // abstract by default
}

//Step 2: Class implements interface
class Demo implements Calc {

 // Step 3: Override method
 @Override
 public int add(int n, int m) {
     return n + m;
 }

 // Step 4: main method
 public static void main(String[] args) {

     Demo d = new Demo();

     int sum = d.add(10, 20);

     System.out.println("Sum = " + sum);
 }
}

