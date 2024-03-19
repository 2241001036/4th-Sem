class CurrentAccount extends Account {
    private double overdraftLimit;
    public CurrentAccount(int accountNumber, double balance, double overdraftLimit)
    {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void deposit(double amount)
    {
        balance += amount;
    }
    @Override
    public void withdraw(double amount)
    {
        if (balance + overdraftLimit >= amount)
        {
            balance = balance - amount;
        }
        else
        {
            System.out.println("Overdraft limit exceeded");
        }
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}