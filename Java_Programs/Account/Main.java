// Job: Demonstrate depositing, withdrawing, and displaying an account balance.

class Account {
    double balance;

    Account() {
        balance = 0;
    }

    Account(double balance, double unused) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account(5000, 0);

        a2.displayBalance();
        a2.deposit(2000);
        a2.displayBalance();
        a2.withdraw(1500);
        a2.displayBalance();
    }
}
