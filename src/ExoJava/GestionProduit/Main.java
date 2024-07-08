package ExoJava.GestionProduit;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        // Ajout de quelques produits pour tester
        manager.addProduct(new Product("Laptop", 1200.0));
        manager.addProduct(new Product("Mouse", 20.0));
        manager.addProduct(new Product("Keyboard", 50.0));

        // Affichage de tous les produits
        manager.displayProducts();

        // Affichage du prix total
        manager.displayTotalPrice();
    }
}
