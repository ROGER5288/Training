package Array_List;

import java.util.ArrayList;

//Used for functional operations.
public class StreamMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        list.stream().forEach(System.out::println);
    }
}
