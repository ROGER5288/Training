package Assignment.Assignment1;

public class Program4 {
	public static void main(String[] args) {
        int num = 5;
        int a = 0, b = 1;
        for(int i = 0; i<=num; i++){
            int c = a+b;
            a=b;
            b=c;
            System.out.println(c+" ");
        }
    }
}
