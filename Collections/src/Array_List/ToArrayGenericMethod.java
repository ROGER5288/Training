package Array_List;

import java.util.ArrayList;


//Converts collection to typed array.
public class ToArrayGenericMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        String[] arr = list.toArray(new String[0]);

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
