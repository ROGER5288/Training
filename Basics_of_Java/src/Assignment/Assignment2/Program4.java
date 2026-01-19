package Assignment.Assignment2;

public class Program4 {
	public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;
        int n = arr.length;

        k = k % n;
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
