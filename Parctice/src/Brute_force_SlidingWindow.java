import java.util.*;

public class Brute_force_SlidingWindow {

    public static int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        int[] result = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];

            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            result[i] = max;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,3,4,5,6,2,5,9,7,2};
        int k = 3;

        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }
}
