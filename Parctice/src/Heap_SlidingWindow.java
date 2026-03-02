import java.util.*;

public class Heap_SlidingWindow {

    public static int[] maxSlidingWindow(int[] arr, int k) {

        int n = arr.length;
        int[] result = new int[n - k + 1];

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        // First window
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }

        result[0] = pq.peek();

        for (int i = k; i < n; i++) {
            pq.remove(arr[i - k]);   // remove outgoing element
            pq.add(arr[i]);          // add new element
            result[i - k + 1] = pq.peek();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,-1,3,4,5,6,2,5,9,7,2};
        int k = 3;

        System.out.println(Arrays.toString(maxSlidingWindow(arr, k)));
    }
}
