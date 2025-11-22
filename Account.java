package _26187_.q6;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(long id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address);
        setAccountNumber(accountNumber);
        setAccountType(accountType);
        setBalance(balance);
    }

    public String getAccountNumber() { return accountNumber; }
    public void setAccountNumber(String accountNumber) throws BankingDataException {
        if (accountNumber == null || accountNumber.trim().isEmpty()) throw new BankingDataException("accountNumber must not be empty");
        this.accountNumber = accountNumber.trim();
    }

    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) throws BankingDataException {
        if (accountType == null || accountType.trim().isEmpty()) throw new BankingDataException("accountType must not be empty");
        this.accountType = accountType.trim();
    }

    public double getBalance() { return balance; }
    public void setBalance(double balance) throws BankingDataException {
        if (balance < 0) throw new BankingDataException("balance must be >= 0");
        this.balance = balance;
    }
}
