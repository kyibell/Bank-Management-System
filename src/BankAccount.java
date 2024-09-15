import java.util.Scanner; // So we can get input, import java.util.Scanner

// Class For BankAccount
public class BankAccount {

    double balance;
    double previousTransactions;
    String customerName;
    String customerId;

    // Constructor
    BankAccount(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    // Deposit Method
    void Deposit(double amount) {
        Scanner myObj = new Scanner(System.in); // Create a new scanner for input
        System.out.println("What amount would you like to deposit? (Cannot exceed $10,000.): ");

        amount = Double.parseDouble(myObj.nextLine()); // Convert String inp to double
        if (amount > 10000) {
            System.out.println("Amount cannot exceed $10,000. Please try again.");
        } else if (amount <= 0) {
            System.out.println("Amount cannot be 0 or negative. Please try again.");
        } else {
            balance += amount;
            previousTransactions = amount;
        }
    }

    // Withdraw Method

    void Withdraw(double amount) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What amount would you like to withdraw? (Cannot exceed $10,000.): ");
        amount = Double.parseDouble(myObj.nextLine());
        // Check if amount > 10000
        if (amount > 10000) {
            System.out.println("Amount exceeds $10,000. Please try again.");
        } else if (amount <= 0) {
            System.out.println("Amount cannot be 0 or negative. Please enter a valid amount.($1 - $10,000)");
        }
        // Check if balance < amount
        if (balance < amount) {
            System.out.println("Insufficient Funds. Amount too high. Please try again.");
        } else {
            balance -= amount;
            previousTransactions = -amount;
        }
    }


}
