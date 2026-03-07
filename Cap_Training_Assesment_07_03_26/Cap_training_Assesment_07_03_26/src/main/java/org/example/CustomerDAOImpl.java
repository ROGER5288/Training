package org.example;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl {
    private List<Customer> customers = new ArrayList<>();

    public void insertCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer fetchCustomerById(int id) {
        return customers.get(id - 1); // Assuming ID starts from 1
    }

    public void updateCustomer(int id, String newName) {
        Customer customer = fetchCustomerById(id);
        customer.setCustomerName(newName);
    }

    public List<Customer> fetchAllCustomers() {
        return customers;
    }

    public Customer fetchCustomerByEmail(String email) {
        return customers.stream()
                .filter(c -> c.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    public void deleteCustomer(int id) {
        customers.remove(id - 1);
    }
}
