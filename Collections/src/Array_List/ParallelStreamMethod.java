package Array_List;

import java.util.ArrayList;

//Processes elements in parallel.
public class ParallelStreamMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        list.parallelStream().forEach(System.out::println);
    }
}
