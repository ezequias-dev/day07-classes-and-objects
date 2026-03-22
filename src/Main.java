public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        User user = new User();

        product.name = "Keyboard";
        product.price = 199.90;
        product.stock = 10;

        user.fullName = "Ezequias Souza";
        user.email = "ezequias@email.com";
        user.active = true;

        product.showDetails();
        user.showSummary();
    }
}