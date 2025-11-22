package _26187_.q6;

public class Payment extends Loan {
    private double paymentAmount;
    private String paymentDate;

    public Payment(long id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, String depositDate,
                   double withdrawalAmount, String withdrawalDate,
                   double loanAmount, double interestRate, int duration,
                   double paymentAmount, String paymentDate) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration);
        setPaymentAmount(paymentAmount);
        setPaymentDate(paymentDate);
    }

    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) throws BankingDataException {
        if (paymentAmount <= 0) throw new BankingDataException("paymentAmount must be > 0");
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) throws BankingDataException {
        if (paymentDate == null || paymentDate.trim().isEmpty()) throw new BankingDataException("paymentDate must not be empty");
        this.paymentDate = paymentDate.trim();
    }
}
