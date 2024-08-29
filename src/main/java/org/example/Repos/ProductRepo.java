package org.example.Repos;

import org.example.Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {

    //Step 2: Implement the ProductRepo class with a list to store products.

    List<Product> listOfProducts = new ArrayList<>();

        // Add Methode:

        public void addProduct(Product newProduct){
            listOfProducts.add(newProduct);
        }

        //Remove Methode:

        public void removeProduct(Product productToRemove){
            listOfProducts.remove(productToRemove);
        }

        // Get Methode for single Product by ID:

        public Product getProductByID(String productID){
            for (Product product : listOfProducts) {
                if (product.productID().equals(productID)) {
                    return product;
                }
                }
            return null;
        }

        // Get Methode for all Products:

        public List<Product> getAllProducts(){
            return listOfProducts;
        }

        //Boilerplate der Klasse "ProductRepo":

    //Constructor
    public ProductRepo(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }
    //Getter & Setter
    public List<Product> getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(List<Product> listOfProducts) {
        this.listOfProducts = listOfProducts;
    }
    //HashCode & Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(listOfProducts, that.listOfProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(listOfProducts);
    }
    //ToString
    @Override
    public String toString() {
        return "ProductRepo{" +
                "listOfProducts=" + listOfProducts +
                '}';
    }
}
