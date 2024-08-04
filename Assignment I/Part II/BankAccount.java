// Account class
class Account {
    private String accountNumber;
    private double balance;
    private double annualInterestRate;

    public Account(String accountNumber, double balance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of NPR" + amount + " successful.");
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of NPR" + amount + " successful.");
            } else {
                System.out.println("Insufficient funds. Withdrawal not processed.");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\nBalance: NPR" + balance + "\nAnnual Interest Rate: " + annualInterestRate + "%";
    }
}

// CheckingAccount subclass
class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double annualInterestRate, double overdraftLimit) {
        super(accountNumber, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (getBalance() + overdraftLimit >= amount) {
                super.withdraw(amount);
            } else {
                System.out.println("Withdrawal amount exceeds overdraft limit. Transaction not processed.");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    @Override
    public String toString() {
        return "Checking Account Details\n" + super.toString() + "\nOverdraft Limit: NPR" + overdraftLimit;
    }
}

// SavingsAccount subclass
class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (getBalance() >= amount) {
                super.withdraw(amount);
            } else {
                System.out.println("Insufficient funds. Withdrawal not processed.");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    @Override
    public String toString() {
        return "Savings Account Details\n" + super.toString();
    }
}
// BankAccount class to test the program
public class BankAccount {
    public static void main(String[] args) {
        // Create a Checking Account
        CheckingAccount checking = new CheckingAccount("C12345", 1000.0, 1.5, 500.0);
        System.out.println(checking);
        checking.deposit(200.0);
        System.out.println("New balance: NPR" + checking.getBalance());
        checking.withdraw(1500.0); // This should exceed the overdraft limit
        System.out.println("Current balance: NPR" + checking.getBalance());

        System.out.println("----------------------");

        // Create a Savings Account
        SavingsAccount savings = new SavingsAccount("S54321", 2000.0, 2.0);
        System.out.println(savings);
        savings.withdraw(500.0);
        System.out.println("New balance: NPR" + savings.getBalance());
        savings.withdraw(2500.0); // This should attempt to withdraw more than the balance
        System.out.println("Current balance: NPR" + savings.getBalance());
    }
}
