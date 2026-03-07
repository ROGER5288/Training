package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class OrderDAOImpl {
    private List<Order> orders = new ArrayList<>();
    private AtomicInteger idGenerator = new AtomicInteger(1);

    public void insertOrder(Order order) {
        order.setId(idGenerator.getAndIncrement());
        orders.add(order);
    }

    public void updateOrder(int id, double newPrice) {
        Order order = fetchOrderById(id);
        if (order != null) {
            order.setPrice(newPrice);
        }
    }

    public Order fetchOrderById(int id) {
        return orders.stream()
                .filter(o -> o.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
