package exercises.exercise04;

public class Main {
    public static void main(String[] args) {
        ProductItem product = new ProductItem();

        product.name = "MacBook Air";
        product.price = 999.99;
        product.stock = 22;

        System.out.println("Is it a valid product? " + product.isValidProduct());
    }
}