package Array_List;

import java.util.ArrayList;
import java.util.Spliterator;

//Used for parallel processing.
public class SpliteratorMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        Spliterator<String> sp = list.spliterator();
        sp.forEachRemaining(System.out::println);
    }
}
