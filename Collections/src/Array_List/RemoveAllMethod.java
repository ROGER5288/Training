package Array_List;

import java.util.ArrayList;


//Removes common elements.
public class RemoveAllMethod {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("B");
        list2.add("C");

        list1.removeAll(list2);

        System.out.println(list1);
    }
}
