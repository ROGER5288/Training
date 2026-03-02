package Array_List;

import java.util.ArrayList;

//Checks content equality, not reference.
public class EqualsMethod {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");

        System.out.println(list1.equals(list2));
    }
}
