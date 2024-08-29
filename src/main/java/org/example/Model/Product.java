package org.example.Model;

//Step 1: Create a record Product with the necessary attributes.
public record Product(String productID,
                      String name,
                      String type,
                      int amount,
                      boolean inStorage) {

}
