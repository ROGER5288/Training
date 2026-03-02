package Array_List;

import java.util.ArrayList;


//Removes all elements from the collection.
public class ClearMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        list.clear();

        System.out.println(list);
    }
}
