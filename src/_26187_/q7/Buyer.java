package _26187_.q7;

public class Buyer extends Seller {
    private String buyerName;
    private String email;

    public Buyer(long id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                 String agentName, String emailAgent, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String contactNumber,
                 String buyerName, String email) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, emailAgent, licenseNumber, propertyCode, propertyType, price, sellerName, contactNumber);
        setBuyerName(buyerName);
        setEmail(email);
    }

    public String getBuyerName() { return buyerName; }
    public void setBuyerName(String buyerName) throws RealEstateDataException {
        if (buyerName == null || buyerName.trim().isEmpty()) throw new RealEstateDataException("buyerName must not be empty");
        this.buyerName = buyerName.trim();
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws RealEstateDataException {
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) throw new RealEstateDataException("email invalid");
        this.email = email;
    }
}
