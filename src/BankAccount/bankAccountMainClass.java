package BankAccount;

public class bankAccountMainClass {
    public static void main(String[] args) {
        bankAccounts shubhamAccount  = new bankAccounts();
        bankAccounts testAccount  = new bankAccounts();

        shubhamAccount.deposit(50000);
        shubhamAccount.deposit(10000);
        shubhamAccount.deposit(10000);
        shubhamAccount.withdraw(20000);

        testAccount.withdraw(100.89);
        testAccount.deposit(234.89);
        testAccount.withdraw(23.67);
    }
}
