package ExoJava.GestionProduit;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void displayProducts() {
        System.out.println("List of Products:");
        productList.forEach(product -> System.out.println(product.getName() + ": $" + product.getPrice()));
    }

    public void displayTotalPrice() {
        double totalPrice = productList.stream().mapToDouble(Product::getPrice).sum();
        System.out.println("Total Price of Products: $" + totalPrice);
    }
}

