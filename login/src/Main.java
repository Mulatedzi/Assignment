

import java.util.Scanner;
import login.Login;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    System.out.print("Enter cell phone number: ");
                    String cellNumber = scanner.nextLine();
                    System.out.print("Enter first name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter last name: ");
                    String lastName = scanner.nextLine();

                    String registrationMessage = login.registerUser(username, password, cellNumber, firstName, lastName);
                    System.out.println(registrationMessage);
                }

                case 2 -> {
                    System.out.print("Enter username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.nextLine();

                    boolean loginSuccess = login.loadUserFromFile(loginUsername, loginPassword);
                    String loginMessage = login.returnLoginStatus(loginSuccess);
                    System.out.println(loginMessage);
                }

                case 3 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }

                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
