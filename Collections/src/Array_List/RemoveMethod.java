package Array_List;

import java.util.ArrayList;

///Removes a specific element.
public class RemoveMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        list.remove("Apple");

        System.out.println(list);
    }
}
