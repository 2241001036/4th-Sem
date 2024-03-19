class SavingsAccount extends Account
{
    private double interestRate;
    public SavingsAccount(int accountNumber, double balance, double interestRate)
    {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override
    public void deposit(double amount)
    {
        double interest = amount * interestRate / 100;
        balance = balance + amount + interest;
    }
    @Override
    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance = balance - amount;
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    public double getInterestRate()
    {
        return interestRate;
    }
}
