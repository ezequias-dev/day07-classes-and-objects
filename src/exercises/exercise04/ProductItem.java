package exercises.exercise04;

public class ProductItem {
    String name;
    double price;
    int stock;

    public boolean isValidProduct() {
        boolean isValidName = name != null && name.trim().length() >= 3;
        boolean isValidPrice = price > 0;
        boolean isValidStock = stock >= 0;

        return isValidName && isValidPrice && isValidStock;
    }
}
