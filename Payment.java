package _26187_.q7;

public class Payment extends Agreement {
    private double paymentAmount;
    private String paymentDate;

    public Payment(long id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                   String agentName, String emailAgent, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String contactNumber,
                   String buyerName, String email,
                   String agreementDate, String terms,
                   double paymentAmount, String paymentDate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, emailAgent, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, email, agreementDate, terms);
        setPaymentAmount(paymentAmount);
        setPaymentDate(paymentDate);
    }

    public double getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(double paymentAmount) throws RealEstateDataException {
        if (paymentAmount <= 0) throw new RealEstateDataException("paymentAmount must be > 0");
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) throws RealEstateDataException {
        if (paymentDate == null || paymentDate.trim().isEmpty()) throw new RealEstateDataException("paymentDate must not be empty");
        this.paymentDate = paymentDate.trim();
    }
}
