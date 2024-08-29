package org.example;

import org.example.Model.Product;
import org.example.Repos.OrderListRepo;
import org.example.Repos.OrderRepo;
import org.example.Services.ShopService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Elemente immer über die Main Klasse hinzuzufügen
        // Erstellung einer Liste von Produkten
        List<Product> productList = new ArrayList<>();

        // Hinzufügen von 5 Gemüseprodukten
        productList.add(new Product("G001", "Karotte", "Gemüse", 100, true));
        productList.add(new Product("G002", "Brokkoli", "Gemüse", 50, true));
        productList.add(new Product("G003", "Tomate", "Gemüse", 200, false));
        productList.add(new Product("G004", "Gurke", "Gemüse", 75, true));
        productList.add(new Product("G005", "Paprika", "Gemüse", 60, false));

        // Hinzufügen von 5 Obstprodukten
        productList.add(new Product("O001", "Apfel", "Obst", 150, true));
        productList.add(new Product("O002", "Banane", "Obst", 120, true));
        productList.add(new Product("O003", "Orange", "Obst", 180, false));
        productList.add(new Product("O004", "Traube", "Obst", 90, true));
        productList.add(new Product("O005", "Birne", "Obst", 110, false));


        //Add products

    }
}