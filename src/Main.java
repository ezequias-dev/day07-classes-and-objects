public class Main {
    public static void main(String[] args) {
        Product product = new Product();

        product.name = "Keyboard";
        product.price = 199.90;
        product.stock = 10;

        product.showDetails();
    }
}