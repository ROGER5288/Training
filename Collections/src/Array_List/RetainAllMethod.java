package Array_List;

import java.util.ArrayList;

//Keeps only common elements, removes others.
public class RetainAllMethod {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("B");

        list1.retainAll(list2);

        System.out.println(list1);
    }
}
