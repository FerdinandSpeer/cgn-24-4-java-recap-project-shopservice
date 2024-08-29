package org.example.Services;

import org.example.Model.Order;
import org.example.Repos.OrderListRepo;
import org.example.Repos.ProductListRepo;

public class ShopService {

    //Variablen erstellen
    private final OrderListRepo orderListRepo;
    private final ProductListRepo productListRepo;

    //Constructor

    public ShopService(OrderListRepo orderListRepo, ProductListRepo productListRepo) {
        this.orderListRepo = orderListRepo;
        this.productListRepo = productListRepo;
    }

    //Step 1: Implement a method to place a new order.

    public void placeNewOrder(Order newOrder) {
        if (productListRepo.isOnStock(newOrder.product())){ //Step 2: Check if the ordered products exist. If not, print a System.out.println message.
            orderListRepo.addNewOrder(newOrder);
            System.out.println("Order Placed successfully!");
        } else System.out.println("Outsch! Product is out of stock!");
    }

}