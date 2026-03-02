public class Test_Customer {
    public static void main(String[] args) {
        Customer[] obj = new Customer[5];

        obj[0] = new Customer(100, "Soumyojit");
        obj[1] = new Customer(101, "Rahul");
        obj[2] = new Customer(101, "Ananya");
        obj[3] = new Customer(103, "Priya");
        obj[4] = new Customer(104, "Arjun");

        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj.length - i - 1; j++) {
                if (comapringObj(obj[j], obj[j + 1]) == 1) {
                    Customer temp = obj[j + 1];
                    obj[j + 1] = obj[j];
                    obj[j] = temp;
                }
            }
        }

        for (Customer customer : obj) {
            System.out.println(customer);
        }
    }

    public static int comapringObj(Customer c1, Customer c2) {
        if (c1.networth < c2.networth) {
            return 1;
        } else if (c1.networth == c2.networth) {
            if (c1.name.compareTo(c2.name) > 0) {
                return 1;
            }
        }
        return 0;
    }
}