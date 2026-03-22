package exercises.exercise02;

public class CatalogProduct {
    String name;
    double price;
    boolean available;

    void showProductSummary() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "yes" : "no"));
    }
}