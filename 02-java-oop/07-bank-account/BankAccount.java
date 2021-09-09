import java.util.Random;

public class BankAccount {
    private double checkingBalance = 0.00;
    private double savingsBalance = 0.00;
    private static int numberOfAccounts = 0;
    private static double totalMoneyStored = 0.00;
    private Long accountNumber = 0L;

    public BankAccount() {
        this.checkingBalance = 0.00;
        this.savingsBalance = 0.00;
        numberOfAccounts++;
        totalMoneyStored += this.checkingBalance + this.savingsBalance;
        this.accountNumber = generateAccount(10);
    }

    public String numberGenerator() {
        Random random = new Random();
        Integer number = random.nextInt(10);
        return number.toString();
    }

    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static double getTotalMoneyStored() {
        return totalMoneyStored;
    }

    public Long generateAccount(int length) {
        String account = "";
        for (int i = 0; i < length; i++) {
            account = account + numberGenerator();
        }

        return Long.parseLong(account);
    }

    public Long getAccount() {
        return this.accountNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void deposit(boolean checking, double amount) {
        if (checking == true) {
            this.checkingBalance += amount;
            totalMoneyStored += amount;
            System.out.println("$" + amount + " deposited into checking.  Balance now at $" + this.checkingBalance);
        } else {
            this.savingsBalance += amount;
            totalMoneyStored += amount;
            System.out.println("$" + amount + " deposited into savings.  Balance now at $" + this.savingsBalance);
        }
    }

    public void withdraw(boolean checking, double amount) {
        if (checking == true) {
            if (amount < this.checkingBalance) {
                this.checkingBalance -= amount;
                totalMoneyStored -= amount;
                System.out.printf("$ %.2f Withdrawn from checking.  Balance now at $ %.2f \n", amount,
                        this.checkingBalance);
            } else {
                System.out.printf("Not enough in account.  Balance is at %.2f \n", checkingBalance);

            }
        } else {
            if (amount < this.savingsBalance) {
                this.savingsBalance -= amount;
                totalMoneyStored -= amount;
                System.out.printf("$%.2f withdrawn from savings.  Balance now at $%.2f \n", amount,
                        this.savingsBalance);
            } else {
                System.out.printf("Not enough in account.  Balance is at $%.2f \n", savingsBalance);
            }
        }
    }

    public void viewTotalAccountBalance() {
        double totalBalance = this.checkingBalance + this.savingsBalance;
        System.out.printf("The combined total balance from your savings and checking accounts is $%.2f \n",
                totalBalance);
    }
}