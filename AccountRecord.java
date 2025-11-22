package _26187_.q6;

import java.util.Scanner;

public final class AccountRecord extends Payment {

    public AccountRecord(long id, String createdDate, String updatedDate, String bankName, String branchCode, String address,
                         String accountNumber, String accountType, double balance,
                         String customerName, String email, String phoneNumber,
                         String transactionId, String transactionType, double amount,
                         double depositAmount, String depositDate,
                         double withdrawalAmount, String withdrawalDate,
                         double loanAmount, double interestRate, int duration,
                         double paymentAmount, String paymentDate) throws BankingDataException {
        super(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration, paymentAmount, paymentDate);
    }

    public double calculateInterest() {
        return getLoanAmount() * getInterestRate() * getDuration() / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("25873 Enter Entity (id createdDate updatedDate):");
            long id = Long.parseLong(sc.next());
            String createdDate = sc.next();
            String updatedDate = sc.next();

            System.out.println("25873 Enter Bank (bankName branchCode address):");
            String bankName = sc.next();
            String branchCode = sc.next();
            String address = sc.next();

            System.out.println("25873 Enter Account (accountNumber accountType balance):");
            String accountNumber = sc.next();
            String accountType = sc.next();
            double balance = Double.parseDouble(sc.next());

            System.out.println("25873 Enter Customer (name email phone):");
            String customerName = sc.next();
            String email = sc.next();
            String phoneNumber = sc.next();

            System.out.println("25873 Enter Transaction (transactionId transactionType amount):");
            String transactionId = sc.next();
            String transactionType = sc.next();
            double amount = Double.parseDouble(sc.next());

            System.out.println("25873 Enter Deposit (depositAmount depositDate):");
            double depositAmount = Double.parseDouble(sc.next());
            String depositDate = sc.next();

            System.out.println("25873 Enter Withdrawal (withdrawalAmount withdrawalDate):");
            double withdrawalAmount = Double.parseDouble(sc.next());
            String withdrawalDate = sc.next();

            System.out.println("25873 Enter Loan (loanAmount interestRate duration):");
            double loanAmount = Double.parseDouble(sc.next());
            double interestRate = Double.parseDouble(sc.next());
            int duration = Integer.parseInt(sc.next());

            System.out.println("25873 Enter Payment (paymentAmount paymentDate):");
            double paymentAmount = Double.parseDouble(sc.next());
            String paymentDate = sc.next();

            AccountRecord rec = new AccountRecord(id, createdDate, updatedDate, bankName, branchCode, address, accountNumber, accountType, balance, customerName, email, phoneNumber, transactionId, transactionType, amount, depositAmount, depositDate, withdrawalAmount, withdrawalDate, loanAmount, interestRate, duration, paymentAmount, paymentDate);

            System.out.println("25873 Bank: " + rec.getBankName() + " (Branch: " + rec.getBranchCode() + ")");
            System.out.println("25873 Account: " + rec.getAccountNumber() + " Type: " + rec.getAccountType() + " Balance: " + String.format("%.2f", rec.getBalance()));
            System.out.println("25873 Customer: " + rec.getCustomerName() + " Email: " + rec.getEmail());
            System.out.println("25873 Transaction: " + rec.getTransactionId() + " Type: " + rec.getTransactionType() + " Amount: " + String.format("%.2f", rec.getAmount()));
            System.out.println("25873 Deposit: " + String.format("%.2f", rec.getDepositAmount()) + " on " + rec.getDepositDate());
            System.out.println("25873 Withdrawal: " + String.format("%.2f", rec.getWithdrawalAmount()) + " on " + rec.getWithdrawalDate());
            System.out.println("25873 Loan: " + String.format("%.2f", rec.getLoanAmount()) + " Interest%: " + String.format("%.2f", rec.getInterestRate()) + " Duration: " + rec.getDuration());
            System.out.println("25873 Calculated Interest: " + String.format("%.2f", rec.calculateInterest()));
            System.out.println("25873 Payment: " + String.format("%.2f", rec.getPaymentAmount()) + " on " + rec.getPaymentDate());

        } catch (BankingDataException bde) {
            System.out.println("25873 Error: " + bde.getMessage());
        } catch (Exception e) {
            System.out.println("25873 Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
