package exercises.exercise01;

public class Main {
    public static void main(String[] args) {
        SystemUser user = new SystemUser();

        user.fullName = "Ezequias Souza";
        user.email = "ezequias@email.com";
        user.role = "Backend Developer";

        System.out.println("Name: " + user.fullName);
        System.out.println("Email: " + user.email);
        System.out.println("Role: " + user.role);
    }
}