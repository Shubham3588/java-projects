package BankAccount;

public class bankAccounts {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositBalance){
        accountBalance=accountBalance+depositBalance;

        System.out.println("The account Balance is"+ accountBalance);

    }

    public void withdraw(double withdrawBalance){
        accountBalance = accountBalance-withdrawBalance;
        if(accountBalance<0){
            System.out.println("Insufficient Balance");
        }else{

            System.out.println("Transaction successfull!! Remaining balance is:"+accountBalance);
        }

    }
}
