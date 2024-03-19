abstract class Account
{
    int accountNumber;
    double balance;
    public Account(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public double getBalance()
    {
        return balance;
    }
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}