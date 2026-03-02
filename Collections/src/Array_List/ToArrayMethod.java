package Array_List;

import java.util.ArrayList;


//Converts collection to Object array.
public class ToArrayMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        Object[] arr = list.toArray();

        for (Object o : arr) {
            System.out.println(o);
        }
    }
}
