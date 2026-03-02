package Array_List;

import java.util.ArrayList;

//Returns hash value for hashing structures.
public class HashCodeMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");

        System.out.println(list.hashCode());
    }
}
