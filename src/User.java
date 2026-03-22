public class User {
    String fullName;
    String email;
    boolean active;

    void showSummary() {
        System.out.println("Name: " + fullName);
        System.out.println("Email: " + email);
        System.out.println("Active: " + active);
    }
}