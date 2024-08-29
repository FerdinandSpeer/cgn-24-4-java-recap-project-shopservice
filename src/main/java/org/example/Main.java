package org.example;

import org.example.Model.Order;
import org.example.Model.Product;
import org.example.Repos.OrderListRepo;
import org.example.Repos.OrderRepo;
import org.example.Services.ShopService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Elemente immer über die Main Klasse hinzuzufügen
        ShopService shopService = new ShopService();

        // Hinzufügen von 5 Gemüseprodukten
        shopService.createProduct(new Product("G001", "Karotte", "Gemüse", 100, true));
        shopService.createProduct(new Product("G002", "Brokkoli", "Gemüse", 50, true));
        shopService.createProduct(new Product("G003", "Tomate", "Gemüse", 200, false));
        shopService.createProduct(new Product("G004", "Gurke", "Gemüse", 75, true));
        shopService.createProduct(new Product("G005", "Paprika", "Gemüse", 60, false));

        // Hinzufügen von 5 Obstprodukten
        shopService.createProduct(new Product("O001", "Apfel", "Obst", 150, true));
        shopService.createProduct(new Product("O002", "Banane", "Obst", 120, true));
        shopService.createProduct(new Product("O003", "Orange", "Obst", 180, false));
        shopService.createProduct(new Product("O004", "Traube", "Obst", 90, true));
        shopService.createProduct(new Product("O005", "Birne", "Obst", 110, false));


        shopService.printAllProducts();
        System.out.println("_________________");
        shopService.placeNewOrder();

    }
}