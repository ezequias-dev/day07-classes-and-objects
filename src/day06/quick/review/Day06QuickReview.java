package day06.quick.review;

import java.util.Scanner;

public class Day06QuickReview {

    private static boolean isValidName(String name) {
        String cleanName = name.trim();

        return cleanName.length() >= 3;
    }

    private static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    private static boolean isValidPassword(String password) {
        return password.length() >= 8;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        boolean isValidName = isValidName(fullName);
        boolean isValidEmail = isValidEmail(email);
        boolean isValidPassword = isValidPassword(password);

        boolean isValid = isValidName && isValidEmail && isValidPassword;

        String message = isValid
            ? "Registration valid"
            : "Registration invalid";

        System.out.println();
        System.out.println(message);

        scanner.close();
    }
}