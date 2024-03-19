import java.util.Scanner;
public class BankingApplication
{
    public static void main(String[] args)
    {
        SavingsAccount savingsAccount = new SavingsAccount(12345, 1000, 5);
        CurrentAccount currentAccount = new CurrentAccount(67890, 2000, 1000);

        Scanner scanner = new Scanner(System.in);
        int choice;
        double amount;
        do
        {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display account details\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    amount = scanner.nextDouble();
                    savingsAccount.deposit(amount);
                    currentAccount.deposit(amount);
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    amount = scanner.nextDouble();
                    savingsAccount.withdraw(amount);
                    currentAccount.withdraw(amount);
                    break;
                case 3:
                    System.out.println("\nSavings Account Details:");
                    System.out.println("Account Number: " + savingsAccount.getAccountNumber());
                    System.out.println("Balance: " + savingsAccount.getBalance());
                    System.out.println("Interest Rate: " + savingsAccount.getInterestRate() + "%");

                    System.out.println("\nCurrent Account Details:");
                    System.out.println("Account Number: " + currentAccount.getAccountNumber());
                    System.out.println("Balance: " + currentAccount.getBalance());
                    System.out.println("Overdraft Limit: " + currentAccount.getOverdraftLimit());
                    break;
                case 4:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice, Please try again.");
            }
        }while (choice != 4);
    }
}

