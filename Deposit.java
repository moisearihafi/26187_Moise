package _26187_.q6;

public class Deposit extends Transaction {
    private double depositAmount;
    private String depositDate;

    public Deposit(long id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, String depositDate) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount);
        setDepositAmount(depositAmount);
        setDepositDate(depositDate);
    }

    public double getDepositAmount() { return depositAmount; }
    public void setDepositAmount(double depositAmount) throws BankingDataException {
        if (depositAmount <= 0) throw new BankingDataException("depositAmount must be > 0");
        this.depositAmount = depositAmount;
    }

    public String getDepositDate() { return depositDate; }
    public void setDepositDate(String depositDate) throws BankingDataException {
        if (depositDate == null || depositDate.trim().isEmpty()) throw new BankingDataException("depositDate must not be empty");
        this.depositDate = depositDate.trim();
    }
}
