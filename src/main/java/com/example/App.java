package com.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user name: ");
        String name = scanner.nextLine();

        System.out.print("Enter user ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter number of books issued: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter number of days borrowed: ");
        int days = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // Allowed limit: 14 days
        int lateDays = Math.max(0, days - 14);
        double finePerBookPerDay = 1.0;
        double totalFine = lateDays * numBooks * finePerBookPerDay;

        // Simulate list of books (in real system, from DB/inventory)
        List<String> books = new ArrayList<>();
        for (int i = 0; i < numBooks; i++) {
            books.add("Book " + (i + 1));
        }

        // Display
        System.out.println("\n--- Borrowing Status ---");
        System.out.println("User Name: " + name);
        System.out.println("User ID: " + id);
        System.out.println("Books Issued (" + numBooks + "):");
        for (String book : books) {
            System.out.println("  - " + book);
        }
        if (totalFine > 0) {
            System.out.printf("Total Fine: $%.2f (late by %d days)%n", totalFine, lateDays);
        } else {
            System.out.println("No fine. Borrowing within limit.");
        }

        scanner.close();
    }
}
