public class BankAccount {
    // TODO
    private String accountNumber;
    private String accountHolder;
    private double balance;


    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

    }
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public BankAccount() {
        this("unknown", "unknown", 20000);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Double getbalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }


}
