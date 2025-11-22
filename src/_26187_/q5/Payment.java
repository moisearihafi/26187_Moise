package _26187_.q5;

public class Payment extends Charge {
    private String paymentMode;
    private String transactionId;

    public Payment(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   String rentalDate, String returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge);
        setPaymentMode(paymentMode);
        setTransactionId(transactionId);
    }

    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) throws RentalDataException {
        if (paymentMode == null || paymentMode.trim().isEmpty()) throw new RentalDataException("paymentMode must not be empty");
        this.paymentMode = paymentMode.trim();
    }

    public String getTransactionId() { return transactionId; }
    public void setTransactionId(String transactionId) throws RentalDataException {
        if (transactionId == null || transactionId.trim().isEmpty()) throw new RentalDataException("transactionId must not be empty");
        this.transactionId = transactionId.trim();
    }
}
