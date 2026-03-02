package Lambda;

import java.util.*;
//Anonymous Class
public class Demo2 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"Amit",30));
        list.add(new Employee(2,"John",25));
        list.add(new Employee(3,"Ravi",35));

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.age - e2.age;
            }
        });

        for(Employee e : list) {
            System.out.println(e);
        }
    }
}
