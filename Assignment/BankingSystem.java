abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    double calculateInterest() {
        return balance * 0.05;
    }

    public void applyForLoan() {
        System.out.println("Loan Applied");
    }
}