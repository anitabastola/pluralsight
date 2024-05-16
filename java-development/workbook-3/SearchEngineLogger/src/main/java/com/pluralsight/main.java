package com.pluralsight;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UserActionLogger {

    public static void logAction(String action) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("logs.txt", true))) {
            writer.println(action);
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Example usage:
        logAction("Launching the application");
        logAction("Searching for a term: 'real estate'");
        logAction("Exiting the application");


        import java.util.Scanner;

        public class UserActionLogger {

            public static void logAction(String action) {
                // Method implementation remains the same
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter a search term
                System.out.print("Enter a search term: ");
                String searchTerm = scanner.nextLine();

                // Log the user action of searching for a term
                logAction("Searching for a term: '" + searchTerm + "'");

                // Close the scanner
                scanner.close();

                // Rest of the code remains the same
                logAction("Launching the application");
                logAction("Exiting the application");
    }
}

        }
}
