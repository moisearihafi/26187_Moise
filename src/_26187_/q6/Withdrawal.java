package _26187_.q6;

public class Withdrawal extends Deposit {
    private double withdrawalAmount;
    private String withdrawalDate;

    public Withdrawal(long id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                      String accountNumber, String accountType, double balance,
                      String customerName, String email, String phoneNumber,
                      String transactionId, String transactionType, double amount,
                      double depositAmount, String depositDate,
                      double withdrawalAmount, String withdrawalDate) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate);
        setWithdrawalAmount(withdrawalAmount);
        setWithdrawalDate(withdrawalDate);
    }

    public double getWithdrawalAmount() { return withdrawalAmount; }
    public void setWithdrawalAmount(double withdrawalAmount) throws BankingDataException {
        if (withdrawalAmount <= 0) throw new BankingDataException("withdrawalAmount must be > 0");
        this.withdrawalAmount = withdrawalAmount;
    }

    public String getWithdrawalDate() { return withdrawalDate; }
    public void setWithdrawalDate(String withdrawalDate) throws BankingDataException {
        if (withdrawalDate == null || withdrawalDate.trim().isEmpty()) throw new BankingDataException("withdrawalDate must not be empty");
        this.withdrawalDate = withdrawalDate.trim();
    }
}
