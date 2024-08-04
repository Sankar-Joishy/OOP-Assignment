public class Account {
    private double balance;

    // Constructor
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to credit account
    public void credit(double amount) {
        this.balance += amount;
    }

    // Method to debit account
    public void debit(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
        }
    }

    // Method to transfer amount to another account
    public void transferTo(Account anotherAccount, double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds");
        } else {
            this.balance -= amount;
            anotherAccount.credit(amount);
        }
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Account[balance=" + balance + "]";
    }
}

