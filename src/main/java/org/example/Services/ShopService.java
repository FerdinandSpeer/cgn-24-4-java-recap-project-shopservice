package org.example.Services;

import org.example.Model.Order;
import org.example.Model.Product;
import org.example.Repos.OrderRepo;
import org.example.Repos.ProductRepo;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ShopService {

    //Variablen erstellen
    private OrderRepo orderRepo;
    private ProductRepo productRepo;

    //Constructor

    public ShopService(OrderRepo orderRepo, ProductRepo productRepo) {
        this.orderRepo = orderRepo;
        this.productRepo = productRepo;
    }

    //Step 1: Implement a method to place a new order.

    public void placeNewOrder(Order newOrder) {
        if (productRepo.isOnStock(newOrder.product())){ //Step 2: Check if the ordered products exist. If not, print a System.out.println message.
            orderRepo.addNewOrder(newOrder);
            System.out.println("Order Placed successfully!");
        } else System.out.println("Outsch! Product is out of stock!");
    }

}