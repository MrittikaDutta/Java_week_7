//q16

class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message);
    }
}

class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialDeposit) {
        this.accountName = accountName;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " Rs. Balance: " + balance);
    }

    public void withdraw(double amount) throws LessBalanceException {
        if (balance - amount < 500) {
            throw new LessBalanceException("Withdraw Amount " + amount + " Rs is Not Valid. Minimum balance should be 500 Rs.");
        }
        balance -= amount;
        System.out.println("Withdrawn " + amount + " Rs. Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        try {
            Account account1 = new Account("Account1", 1000);
            Account account2 = new Account("Account2", 2000);

            account1.deposit(500);
            account2.deposit(1000);

            account1.withdraw(1200); // This will throw LessBalanceException
        } catch (LessBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
