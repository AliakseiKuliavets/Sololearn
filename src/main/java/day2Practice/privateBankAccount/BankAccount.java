package day2Practice.privateBankAccount;

public class BankAccount {
    private String accountNumber;
    private double balance;

    private double amount;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (getBalance() < this.amount) {
            System.out.println("error");
        } else {
        balance -= amount;
        }
    }

    public void withdraw(double amount) {
        balance += amount;
    }

}
