import java.util.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long S = sc.nextLong();         
        int N = sc.nextInt();            
        BigInteger B = sc.nextBigInteger(); 

        sc.close();

        BigInteger a1 = BigInteger.valueOf(S);
        BigInteger a2 = BigInteger.valueOf(S + 1);
        BigInteger current;

        if (N == 1) {
            current = a1;
        } 
        else if (N == 2) {
            current = a2;
        } 
        else {
            for (int i = 3; i <= N; i++) {
                BigInteger next = a1.add(a2).add(BigInteger.ONE);
                a1 = a2;
                a2 = next;
            }
            current = a2;
        }

        BigInteger result = B.subtract(current);

        System.out.println(result);
    }
}