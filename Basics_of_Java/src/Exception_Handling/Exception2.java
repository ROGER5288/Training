package Exception_Handling;

public class Exception2 {
    public static void main(String[] args) {

        int[] a = {10, 20, 30};
        System.out.println("Program Starts");
        try {
            System.out.println(a[3]);  
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");
        }

        System.out.println("Program continues...");
    }
}

