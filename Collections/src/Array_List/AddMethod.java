package Array_List;

import java.util.ArrayList;

//Adds one element to the collection and returns true.
public class AddMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        boolean result = list.add("Mango");

        System.out.println(list);
        System.out.println(result);
    }
}