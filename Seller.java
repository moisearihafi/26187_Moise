package _26187_.q7;

public class Seller extends Property {
    private String sellerName;
    private String contactNumber;

    public Seller(long id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber,
                  String agentName, String email, String licenseNumber,
                  String propertyCode, String propertyType, double price,
                  String sellerName, String contactNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate, agencyName, location, phoneNumber, agentName, email, licenseNumber, propertyCode, propertyType, price);
        setSellerName(sellerName);
        setContactNumber(contactNumber);
    }

    public String getSellerName() { return sellerName; }
    public void setSellerName(String sellerName) throws RealEstateDataException {
        if (sellerName == null || sellerName.trim().isEmpty()) throw new RealEstateDataException("sellerName must not be empty");
        this.sellerName = sellerName.trim();
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws RealEstateDataException {
        if (contactNumber == null || contactNumber.trim().isEmpty()) throw new RealEstateDataException("contactNumber must not be empty");
        this.contactNumber = contactNumber.trim();
    }
}
