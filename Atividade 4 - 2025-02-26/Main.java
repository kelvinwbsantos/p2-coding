import model.entities.Account;
import model.exceptions.InsufficientBalanceException;
import model.exceptions.WithdrawLimitExceededException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Holder: ");
        String holder = scanner.nextLine();

        System.out.print("Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();

        System.out.println();

        try {
            System.out.print("Enter amount for withdraw: ");
            double amount = scanner.nextDouble();
            Account account = new Account(number, holder, initialBalance, withdrawLimit);

            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());
        } catch (InsufficientBalanceException | WithdrawLimitExceededException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        scanner.close();
    }

}