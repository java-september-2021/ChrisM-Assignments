public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();

        myAccount.deposit(true, 200.99);
        myAccount.withdraw(true, 400);
        myAccount.withdraw(true, 20.55);
        myAccount.deposit(false, 600.34);
        myAccount.withdraw(false, 1000);
        myAccount.withdraw(false, 44.44);
        myAccount.viewTotalAccountBalance();

        System.out.println(myAccount.getAccount());
        System.out.println(myAccount.getAccount());
        System.out.println(yourAccount.getAccount());
        System.out.println(BankAccount.getNumberOfAccounts());
        System.out.println(BankAccount.getTotalMoneyStored());
    }
}
