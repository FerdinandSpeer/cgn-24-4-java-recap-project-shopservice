package org.example.Repos;

import org.example.Model.Order;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a class OrderMapRepo through which we can place new orders.
 * This class should also implement the OrderRepo interface.
 * In the main method, create either the OrderMapRepo or the OrderListRepo and pass it to the constructor of ShopService (as a constructor parameter that uses the interface).
 */
public class OrderMapRepo implements OrderRepo {

    Map<String, Order> orderMap = new HashMap<>();


    @Override
    public void addNewOrder(Order order) {

    }

    @Override
    public void removeOrder(Order order) {

    }

    @Override
    public void getAllOrders() {

    }

    @Override
    public void getOrderById(int id) {

    }
}
