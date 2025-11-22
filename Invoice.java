package _26187_.q5;

public class Invoice extends Payment {
    private double totalCharge;

    public Invoice(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   String rentalDate, String returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber, rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId);
        calculateTotalCharge();
    }

    public double getTotalCharge() { return totalCharge; }

    public void calculateTotalCharge() {
        this.totalCharge = getRentalCharge() + getPenaltyCharge();
    }
}
