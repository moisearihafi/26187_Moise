package _26187_.q5;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber) throws RentalDataException {
        super(id, createdDate, updatedDate);
        setCompanyName(companyName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
    }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) throws RentalDataException {
        if (companyName == null || companyName.trim().isEmpty()) throw new RentalDataException("companyName must not be empty");
        this.companyName = companyName.trim();
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws RentalDataException {
        if (address == null || address.trim().isEmpty()) throw new RentalDataException("address must not be empty");
        this.address = address.trim();
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws RentalDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) throw new RentalDataException("phoneNumber must be 10 digits");
        this.phoneNumber = phoneNumber;
    }
}
