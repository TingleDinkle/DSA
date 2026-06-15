// =============================================================
// Figure 54: BankAccount class — Imperative ADT as OOP basis
// =============================================================

public class BankAccount {
    // Private state — hidden (encapsulation)
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // deposit(amount) — imperative ADT operation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // withdraw(amount) — imperative ADT operation
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // getBalance() — imperative ADT operation
    public double getBalance() {
        return balance;
    }

    // Main — demonstrate imperative ADT as OOP class
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: $" + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        account.withdraw(2000.0); // Should fail — insufficient balance

        System.out.println("Final Balance: $" + account.getBalance());

        // User CANNOT do: account.balance = 999999; -> compile error!
        // The state is controlled through methods only.
    }
}

// ---- Expected Output ----
/*
Initial Balance: $1000.0
Deposited: $500.0
Balance after deposit: $1500.0
Withdrawn: $200.0
Balance after withdrawal: $1300.0
Insufficient balance or invalid amount.
Final Balance: $1300.0
*/
