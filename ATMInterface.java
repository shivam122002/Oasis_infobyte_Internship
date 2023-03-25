import java.util.Scanner;

public class ATMInterface {
    private static int balance = 10000;
    private static String userId = "123456";
    private static String userPin = "1234";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM");

        // Login prompt
        System.out.print("Please enter your User ID: ");
        String enteredUserId = scanner.nextLine();
        System.out.print("Please enter your User PIN: ");
        String enteredUserPin = scanner.nextLine();

        if (!enteredUserId.equals(userId) || !enteredUserPin.equals(userPin)) {
            System.out.println("Invalid User ID or User PIN. Exiting...");
            System.exit(0);
        }

        // Display main menu
        System.out.println("Login successful.");
        while (true) {
            System.out.println("\nEnter 1 for Deposit, 2 for Withdrawal, 3 to Check Balance, 4 for Transaction History, 5 for Transfer or 6 to Exit:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    transactionHistory();
                    break;
                case 5:
                    transfer();
                    break;
                case 6:
                    System.out.println("Thank you for using the ATM!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the amount to deposit:");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("Deposit successful");
        checkBalance();
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the amount to withdraw:");
        int amount = scanner.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful");
        checkBalance();
    }

    private static void checkBalance() {
        System.out.println("\nYour balance is " + balance);
    }

    private static void transactionHistory() {
        System.out.println("\nTransaction History:");
        // TODO: Implement transaction history
    }

    private static void transfer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter the amount to transfer:");
        int amount = scanner.nextInt();
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        System.out.println("Enter the recipient's User ID:");
        String recipientUserId = scanner.next();
        balance -= amount;
        System.out.println("Transfer successful");
        checkBalance();
    }
}
