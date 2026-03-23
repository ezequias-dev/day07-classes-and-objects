package day07.challenge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        UserAccount user = new UserAccount();
        user.fullName = fullName;
        user.email = email;
        user.password = password;

        boolean isValid = user.isValidRegistration();
        user.active = isValid;

        user.showAccountSummary();

        if(isValid) {
            System.out.println("Valid registration");
        } else {
            System.out.println("Invalid registration");
        }

        scanner.close();
    }
}
