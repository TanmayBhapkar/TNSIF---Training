package DAY8.Interface;

public interface bank {
    float MINBAL = 5000;
    float Deposit_Limit = 25000;

    void deposit(float amount);
    void withdraw(float amount);
}
