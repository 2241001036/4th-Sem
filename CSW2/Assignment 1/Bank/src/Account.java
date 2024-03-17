public class Account
{
    private int acc_no;
    private String acc_holder_name;
    private double bal;
    public Account(int acc_no, String acc_holder_name, double bal)
    {
        this.acc_no = acc_no;
        this.acc_holder_name = acc_holder_name;
        this.bal = bal;
    }
    public int getAccountnumber()
    {
        return acc_no;
    }
    public void setAccountNumber(int acc_no)
    {
        this.acc_no = acc_no;
    }
    public String getAccountHolderName()
    {
        return acc_holder_name;
    }
    public void setAccountHolderName(int acc_no)
    {
        this.acc_holder_name = acc_holder_name;
    }
    public double getBalance()
    {
        return bal;
    }

}
