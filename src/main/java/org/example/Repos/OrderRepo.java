package org.example.Repos;

import org.example.Model.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Create a class OrderListRepo that contains a list of Order objects.
 */
public class OrderRepo {

    //Step 2: Implement the OrderListRepo class with a list to store orders.
    Map<String, Order> mapOfOrders = new HashMap<>();

    //Step 3: Implement methods to add, remove, and (single order and all orders).

    //Add new Order to mapOfOrders Methode:
    public void addNewOrder(Order newOrder) {
        mapOfOrders.put(newOrder.orderID(), newOrder);
    }

    //Remove an Order from mapOfOrders Methode:
    public void removeOrderOfMap (String orderIdToRemove) {
        mapOfOrders.remove(orderIdToRemove);
    }

    //Get Methode for single Order by ID:
    public Order getOrderByID (String orderIdToGet) {
        return mapOfOrders.get(orderIdToGet);
    }

    //Get Methode for all present orders in the map:

    public Map<String, Order> getMapOfOrders() {
        return mapOfOrders;
    }

    // BOILERPLATE der Klasse OrderRepo:

    public OrderRepo(Map<String, Order> mapOfOrders) {
        this.mapOfOrders = mapOfOrders;
    }

    public void setMapOfOrders(Map<String, Order> mapOfOrders) {
        this.mapOfOrders = mapOfOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRepo orderRepo = (OrderRepo) o;
        return Objects.equals(mapOfOrders, orderRepo.mapOfOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mapOfOrders);
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "mapOfOrders=" + mapOfOrders +
                '}';
    }
}
