package Lambda;

import java.util.*;
//Lambda Example
public class Demo3 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"Amit",30));
        list.add(new Employee(2,"John",25));
        list.add(new Employee(3,"Ravi",35));

        list.sort((e1, e2) -> e1.age - e2.age);

        list.forEach(System.out::println);
    }
}

