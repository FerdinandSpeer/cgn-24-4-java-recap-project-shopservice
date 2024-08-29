package org.example.Services;

import org.example.Model.Order;
import org.example.Model.Product;
import org.example.Repos.OrderListRepo;
import org.example.Repos.ProductListRepo;

import java.util.Objects;

public class ShopService {

    //Variablen
    private final OrderListRepo orderListRepo;
    private final ProductListRepo productListRepo;

    //Constructor

    public ShopService() {
        this.orderListRepo = new OrderListRepo();
        this.productListRepo = new ProductListRepo();
    }

    //Step 1: Implement a method to place a new order.

    public void placeNewOrder(Order newOrder) {
        if (productListRepo.isOnStock(newOrder.product())){ //Step 2: Check if the ordered products exist. If not, print a System.out.println message.
            orderListRepo.addNewOrder(newOrder);
            System.out.println("Order Placed successfully!");
        } else System.out.println("Outsch! Product is out of stock!");
    }

    public void createProduct(Product product) {
        productListRepo.addProduct(product);
    }

    public void printAllProducts() {
        System.out.println("Anzahl der Produkte im Repo: " + productListRepo.getAllProducts().size());
        for (Product product : productListRepo.getAllProducts()) {
            System.out.println(product);
        }
    }


    public OrderListRepo getOrderListRepo() {
        return orderListRepo;
    }

    public ProductListRepo getProductListRepo() {
        return productListRepo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopService that = (ShopService) o;
        return Objects.equals(orderListRepo, that.orderListRepo) && Objects.equals(productListRepo, that.productListRepo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderListRepo, productListRepo);
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "orderListRepo=" + orderListRepo +
                ", productListRepo=" + productListRepo +
                '}';
    }

}