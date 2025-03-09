package model.entities;

import model.exceptions.InsufficientBalanceException;
import model.exceptions.WithdrawLimitExceededException;

public class Account {
    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException, WithdrawLimitExceededException {
        if (amount > withdrawLimit) {
            throw new WithdrawLimitExceededException("The amount exceeds withdraw limit.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance.");
        }

        this.balance -= amount;
    }
}
