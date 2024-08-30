package org.example.Model;

import java.math.BigDecimal;
import java.util.Objects;

//Step 1: Create a record Product with the necessary attributes.
public record Product(String productID,
                      String name,
                      String type,
                      int quantity,
                      boolean inStorage,
                      BigDecimal price) {

    public Product(String productID, String name, String type, int quantity, boolean inStorage, BigDecimal price) {
        this.productID = productID;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.inStorage = inStorage;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity && inStorage == product.inStorage && Objects.equals(name, product.name) && Objects.equals(type, product.type) && Objects.equals(productID, product.productID) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, name, type, quantity, inStorage, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", quantity=" + quantity +
                ", inStorage=" + inStorage +
                ", price=" + price +
                '}';
    }
}
