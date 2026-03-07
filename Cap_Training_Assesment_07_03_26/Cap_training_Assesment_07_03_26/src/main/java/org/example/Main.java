package org.example;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CustomerDAOImpl customerDAO = new CustomerDAOImpl();
        OrderDAOImpl orderDAO = new OrderDAOImpl();

        Order order = new Order();
        order.setOrderNumber("ORD101");
        order.setProductName("Laptop");
        order.setQuantity(1);
        order.setPrice(75000);
        order.setOrderDate(LocalDate.now());

        Customer customer = new Customer();
        customer.setCustomerName("Arya");
        customer.setEmail("arya@gmail.com");
        customer.setGender("Male");
        customer.setPhone(9876543210L);
        customer.setRegistrationDate(LocalDate.now());

        customer.setOrder(order);

        customerDAO.insertCustomer(customer);
        orderDAO.insertOrder(order);

        System.out.println("Customer inserted successfully");

        Customer c = customerDAO.fetchCustomerById(1);

        System.out.println("\nCustomer Details");
        System.out.println(c.getCustomerName());
        System.out.println(c.getEmail());

        customerDAO.updateCustomer(1, "Arya Stark");

        System.out.println("\nCustomer Updated");

        List<Customer> customers = customerDAO.fetchAllCustomers();

        System.out.println("\nAll Customers");

        for(Customer cust : customers){
            System.out.println(cust.getId() + " " + cust.getCustomerName());
        }

        Customer emailCustomer = customerDAO.fetchCustomerByEmail("arya@gmail.com");

        System.out.println("\nCustomer Found by Email:");
        System.out.println(emailCustomer.getCustomerName());
        orderDAO.updateOrder(1, 80000);

        System.out.println("\nOrder Updated");

        Order o = orderDAO.fetchOrderById(1);

        System.out.println("\nOrder Details");
        System.out.println(o.getProductName());
        System.out.println(o.getPrice());

        customerDAO.deleteCustomer(1);

        System.out.println("\nCustomer Deleted");

    }
}
