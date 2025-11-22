package _26187_.q6;

public class Loan extends Withdrawal {
    private double loanAmount;
    private double interestRate; // percent per period
    private int duration; // periods

    public Loan(long id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                String accountNumber, String accountType, double balance,
                String customerName, String email, String phoneNumber,
                String transactionId, String transactionType, double amount,
                double depositAmount, String depositDate,
                double withdrawalAmount, String withdrawalDate,
                double loanAmount, double interestRate, int duration) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate);
        setLoanAmount(loanAmount);
        setInterestRate(interestRate);
        setDuration(duration);
    }

    public double getLoanAmount() { return loanAmount; }
    public void setLoanAmount(double loanAmount) throws BankingDataException {
        if (loanAmount <= 0) throw new BankingDataException("loanAmount must be > 0");
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() { return interestRate; }
    public void setInterestRate(double interestRate) throws BankingDataException {
        if (interestRate <= 0) throw new BankingDataException("interestRate must be > 0");
        this.interestRate = interestRate;
    }

    public int getDuration() { return duration; }
    public void setDuration(int duration) throws BankingDataException {
        if (duration <= 0) throw new BankingDataException("duration must be > 0");
        this.duration = duration;
    }

    public double calculateInterest() {
        return (loanAmount * interestRate * duration) / 100.0;
    }
}
