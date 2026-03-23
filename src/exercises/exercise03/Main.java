package exercises.exercise03;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.name = "Ezequias";
        customer.email = "ezequias@email.com";
        customer.city = "Curitiba";

        customer.showCustomerSummary();
    }
}
