import java.util.Scanner;


public class BankAccountApp {
    public static void main(String[] args) {
        String customerName;
        String customerID;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome to the Bank Account App.");
        System.out.println("Please Enter Customer Name and Customer ID to continue.");
        customerName = myObj.nextLine();
        customerID = myObj.next();

        BankAccount newAccount = new BankAccount(customerName, customerID);
        newAccount.PrintMenu();
        }
}