package Array_List;

import java.util.ArrayList;

//Checks whether the collection is empty.
public class IsEmptyMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        System.out.println(list.isEmpty());

        list.add("X");

        System.out.println(list.isEmpty());
    }
}
