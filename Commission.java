package _26187_.q7;

public class Commission extends Payment {
    private double commissionRate;
    private double commissionAmount;

    public Commission(long id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                      String agentName, String emailAgent, String licenseNumber,
                      String propertyCode, String propertyType, double price,
                      String sellerName, String contactNumber,
                      String buyerName, String email,
                      String agreementDate, String terms,
                      double paymentAmount, String paymentDate,
                      double commissionRate) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, emailAgent, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber, buyerName, email, agreementDate, terms, paymentAmount, paymentDate);
        setCommissionRate(commissionRate);
        calculateCommission(price);
    }

    public double getCommissionRate() { return commissionRate; }
    public void setCommissionRate(double commissionRate) throws RealEstateDataException {
        if (commissionRate < 0) throw new RealEstateDataException("commissionRate must be >= 0");
        this.commissionRate = commissionRate;
    }

    public double getCommissionAmount() { return commissionAmount; }
    public void calculateCommission(double price) {
        this.commissionAmount = (price * this.commissionRate) / 100.0;
    }
}
