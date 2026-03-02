package Array_List;

import java.util.ArrayList;
import java.util.Iterator;


//Used to iterate elements one by one.
public class IteratorMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        Iterator<String> itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
