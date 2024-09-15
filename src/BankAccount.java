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
    void Deposit() {
        double amount;
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
            System.out.println("Deposit Successful!");
        }
    }

    // Withdraw Method

    void Withdraw() {
        double amount;
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
            System.out.println("Withdraw Successful!");
        }
    }

    void GetPreviousTransactions() {
        if (previousTransactions > 0) {
            System.out.println("Previous Transaction was: +" + previousTransactions);
        } else if (previousTransactions < 0) {
            System.out.println("Previous Transaction was: " + previousTransactions);
        } else {
            System.out.println("No previous transaction was made.");
        }
    }

    void DisplayAccount() {
        System.out.println("Customer name: " + customerName + "\n");
        System.out.println("Customer ID: " + customerId + "\n");
        System.out.println("Balance: " + balance + "\n");
        System.out.println("Previous transaction: " + previousTransactions + "\n");
    }

    void PrintMenu() {
        String option;
        do {
            System.out.println("----------------Bank Account App------------\n");
            System.out.println("Welcome " + customerName + ". What would you like to do?\n");
            System.out.println("1. Deposit\n");
            System.out.println("2. Withdraw\n");
            System.out.println("3. View Previous Transaction\n");
            System.out.println("4. Display Account\n");
            System.out.println("5. Exit Application");
            System.out.println("---------------------------------------------\n");


            Scanner myObj = new Scanner(System.in);
            option = myObj.nextLine();

            switch (option) {
                case "1":
                    Deposit();
                    System.out.println("\n");
                    break;
                case "2":
                    Withdraw();
                    System.out.println("\n");
                    break;
                case "3":
                    System.out.println("Previous Transactions");
                    GetPreviousTransactions();
                    break;
                case "4":
                    System.out.println("Account Information: \n");
                    DisplayAccount();
                    break;
                case "5":
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Please enter a valid option.");
            }
        } while (!option.equals("5"));

        System.out.println("Thank you for using The bank application.");
    }
}

