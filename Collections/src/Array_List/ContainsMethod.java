package Array_List;

import java.util.ArrayList;

//Checks if the element exists.
public class ContainsMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");

        System.out.println(list.contains("Apple"));
        System.out.println(list.contains("Mango"));
    }
}
