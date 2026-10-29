package com.rest.service;

import com.rest.models.Order;
import com.rest.repository.OrderRepository;
import java.util.List;

public class OrderService {

    OrderRepository repository = new OrderRepository();

    public List<Order> getAll() {
        return repository.show();
    }
}
