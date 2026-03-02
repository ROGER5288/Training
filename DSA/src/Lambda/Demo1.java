package Lambda;

import java.util.*;
//Normal Interface
public class Demo1 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"Amit",30));
        list.add(new Employee(2,"John",25));
        list.add(new Employee(3,"Ravi",35));

        Collections.sort(list, new AgeComparator());

        for(Employee e : list) {
            System.out.println(e);
        }
    }
}
