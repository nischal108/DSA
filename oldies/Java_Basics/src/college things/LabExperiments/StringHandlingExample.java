package LabExperiments;

import java.util.Scanner;

public class StringHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user for two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // String comparison ignoring case sensitivity
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Strings str1 and str2 are equal (ignoring case)");
        } else {
            System.out.println("Strings str1 and str2 are not equal (ignoring case)");
        }

        // String concatenation using StringBuilder
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        scanner.close();

        StringBuilder fullNameBuilder = new StringBuilder();
        fullNameBuilder.append(firstName).append(" ").append(lastName);
        String fullName = fullNameBuilder.toString();

        System.out.println("Full Name: " + fullName);
    }
}
