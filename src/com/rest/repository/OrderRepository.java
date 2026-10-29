package com.rest.repository;

import com.rest.models.Order;
import java.util.ArrayList;
import java.util.List;

public class OrderRepository {

    private List<Order> orders = new ArrayList<>();

    public OrderRepository() {
        orders.add(new Order(1, 1, 400, Order.Status.served));
        orders.add(new Order(2, 1, 500, Order.Status.pending));
        orders.add(new Order(3, 1, 200, Order.Status.preparing));
        orders.add(new Order(5, 1, 50, Order.Status.cancelled));
    }

    public List<Order> show() {
        return orders;
    }

    public Order findById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public void add(Order order) {
        orders.add(order);
    }
}