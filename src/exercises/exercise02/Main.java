package exercises.exercise02;

public class Main {
    public static void main(String[] args) {
        CatalogProduct product = new CatalogProduct();

        product.name = "MacBook Neo";
        product.price = 599.99;
        product.available = true;

        product.showProductSummary();
    }
}