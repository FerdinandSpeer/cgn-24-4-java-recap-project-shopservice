package org.example.Repos;

import org.example.Model.Order;
import org.example.Model.Product;

import java.util.*;

public class OrderListRepo {

    //Step 2: Implement the OrderListRepo class with a list to store orders.
    List<Order> listOfOrders = new ArrayList<>();

    //Step 3: Implement methods to add, remove, and (single order and all orders).

    //Add new Order to mapOfOrders Methode:
    public void addNewOrder(Order newOrder) {
        listOfOrders.add(newOrder);
    }

    //Remove an Order from mapOfOrders Methode:
    public void removeOrderOfMap (String orderIdToRemove) {
        listOfOrders.remove(orderIdToRemove);
    }

    //Get Methode for single Order by ID:
    public Order getOrderByID (String orderIdToGet) {
        for (Order order : listOfOrders) {
            if (order.orderID().equals(orderIdToGet)){
                return order;
            }
        }
        return null;
    }

    //Get Methode for all present orders in the map:

    public List<Order> getListOfOrders() {
        return listOfOrders;
    }

    // BOILERPLATE der Klasse OrderRepo:

    public OrderListRepo() {
        this.listOfOrders = new ArrayList<Order>();
    }

    public void setListOfOrders(List<Order> listOfOrders) {
        this.listOfOrders = listOfOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderListRepo orderListRepo = (OrderListRepo) o;
        return Objects.equals(listOfOrders, orderListRepo.listOfOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(listOfOrders);
    }

    @Override
    public String toString() {
        return "OrderRepo{" +
                "mapOfOrders=" + listOfOrders +
                '}';
    }
}
