package Array_List;

import java.util.ArrayList;

//Checks if all elements of another collection exist.
public class ContainsAllMethod {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");

        System.out.println(list1.containsAll(list2));
    }
}
