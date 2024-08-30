package org.example;

import org.example.Model.Order;
import org.example.Model.Product;

import org.example.Services.ShopService;

import java.math.BigDecimal;


public class Main {
    public static void main(String[] args) {

        //Elemente immer über die Main Klasse hinzuzufügen
        ShopService shopService = new ShopService();

        // Hinzufügen von 5 Gemüseprodukten
        shopService.createProduct(new Product("G001", "Karotte", "Gemüse", 100, true, new BigDecimal("0.49")));
        shopService.createProduct(new Product("G002", "Brokkoli", "Gemüse", 50, true, new BigDecimal("1.49")));
        shopService.createProduct(new Product("G003", "Tomate", "Gemüse", 200, false, new BigDecimal("2.49")));
        shopService.createProduct(new Product("G004", "Gurke", "Gemüse", 75, true, new BigDecimal("0.59")));
        shopService.createProduct(new Product("G005", "Paprika", "Gemüse", 60, false, new BigDecimal("0.78")));

        //Produkt für Order erzeugen

        Product karotte = new Product("G001", "Karotte", "Gemüse", 100, true, new BigDecimal("0.49"));
        Product brokkoli = new Product("G002", "Brokkoli", "Gemüse", 50, true, new BigDecimal("1.49"));
        Product tomate = new Product("G003", "Tomate", "Gemüse", 200, false, new BigDecimal("2.49"));
        Product gurke = new Product("G004", "Gurke", "Gemüse", 75, true, new BigDecimal("0.59"));
        Product paprika = new Product("G005", "Paprika", "Gemüse", 60, false, new BigDecimal("0.78"));


        // Hinzufügen von 5 Obstprodukten
        shopService.createProduct(new Product("O001", "Apfel", "Obst", 150, true,new BigDecimal("3.49")));
        shopService.createProduct(new Product("O002", "Banane", "Obst", 120, true,new BigDecimal("2.59")));
        shopService.createProduct(new Product("O003", "Orange", "Obst", 180, false,new BigDecimal("3.78")));
        shopService.createProduct(new Product("O004", "Traube", "Obst", 90, true, new BigDecimal("4.30")));
        shopService.createProduct(new Product("O005", "Birne", "Obst", 110, false, new BigDecimal("2.49")));

        // Produkt für Order erzeugen
        Product apfel = new Product("O001", "Apfel", "Obst", 150, true,new BigDecimal("3.49"));
        Product banane = new Product("O002", "Banane", "Obst", 120, true,new BigDecimal("2.59"));
        Product orange = new Product("O003", "Orange", "Obst", 180, false,new BigDecimal("3.78"));
        Product traube = new Product("O004", "Traube", "Obst", 90, true, new BigDecimal("4.30"));
        Product birne = new Product("O005", "Birne", "Obst", 110, false, new BigDecimal("2.49"));

        Order order1 = new Order("O007", "23.02.2024", apfel, 6);


        shopService.printAllProducts();
        System.out.println("_________________");
        shopService.placeNewOrder(order1);

    }
}