import java.util.Arrays;

import java.util.*;

public class Second_smallest_Largest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 5, 20, 8, 20, 15);

        // Step 1: Remove duplicates
        Set<Integer> set = new HashSet<>(list);

        if (set.size() < 2) {
            System.out.println("No second largest element");
            return;
        }

        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;

        for (Integer num : set) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}