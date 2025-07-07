package DAY8.Interface;

public class SavingAccount extends Customer implements bank {
    private int accNo;
    private float balance;

    public SavingAccount(String name, String city, int accNo, float balance) {
        super(name, city);
        this.accNo = accNo;
        this.balance = balance;
    }

    @Override
    public void deposit(float amount) {
        if (amount < 0 || amount > Deposit_Limit) {
            System.out.println("Please deposit a valid amount.");
        } else {
            balance += amount;
            System.out.println("Rs: " + amount + " is deposited successfully.");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (balance - amount >= MINBAL) {
            balance -= amount;
            System.out.println("Rs: " + amount + " is withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public String toString() {
        return "SavingAccount [accNo=" + accNo +
               ", balance=" + balance +
               ", name=" + getName() +
               ", city=" + getCity() + "]";
    }
}
