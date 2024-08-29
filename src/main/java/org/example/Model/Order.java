package org.example.Model;

import java.util.List;
import java.util.Map;

// Step 1: Create a record Order with the necessary attributes.
public record Order(String orderID,
                    String orderDate,
                    Product product,
                    boolean inProgress) {


}
