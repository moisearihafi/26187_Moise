package _26187_.q6;

public class Transaction extends Customer {
    private String transactionId;
    private String transactionType;
    private double amount;

    public Transaction(long id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                       String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber);
        setTransactionId(transactionId);
        setTransactionType(transactionType);
        setAmount(amount);
    }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) throws BankingDataException {
        if (transactionId == null || transactionId.trim().isEmpty()) throw new BankingDataException("transactionId must not be empty");
        this.transactionId = transactionId.trim();
    }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) throws BankingDataException {
        if (transactionType == null || transactionType.trim().isEmpty()) throw new BankingDataException("transactionType must not be empty");
        this.transactionType = transactionType.trim();
    }

    public double getAmount() { return amount; }
    public void setAmount(double amount) throws BankingDataException {
        if (amount <= 0) throw new BankingDataException("amount must be > 0");
        this.amount = amount;
    }
}
