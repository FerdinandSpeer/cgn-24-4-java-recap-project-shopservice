package org.example.Repos;

import org.example.Model.Order;

//Step 1: Create an OrderRepo interface with the methods from the OrderListRepo (add, remove, and getSingle, getAll).

public interface OrderRepo {

    void addNewOrder(Order order);
    void removeOrder(Order order);
    void getAllOrders();
    void getOrderById(int id);
}
