/*Create a BankAccount class representing a bank account with the following characteristics:

        Private field accountNumber (account number) of type String.
        Private field balance (balance) of double type.
        Constructor for initializing account number and initial balance.
        Methods getAccountNumber() and getBalance() to get the account number and balance, respectively.
        The deposit(double amount) method, which adds the specified amount to the account.
        The withdraw(double amount) method, which withdraws the specified amount from the account if the balance allows.
        Next, in the main method of the Main class, create an object of type BankAccount with the given account number
        and initial balance. Perform multiple deposits and withdrawals and display account information after each operation.*/


package day2Practice.privateBankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);
        System.out.println("Номер счета: " + account.getAccountNumber());
        System.out.println("Баланс: " + account.getBalance());

        account.deposit(500);
        System.out.println("Баланс после пополнения: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Баланс после снятия: " + account.getBalance());
    }
}
