package _26187_.q7;

public class Agency extends Entity {
    private String agencyName;
    private String location;
    private String phoneNumber;

    public Agency(long id, String createdDate, String updatedDate, String agencyName, String location, String phoneNumber) throws RealEstateDataException {
        super(id, createdDate, updatedDate);
        setAgencyName(agencyName);
        setLocation(location);
        setPhoneNumber(phoneNumber);
    }

    public String getAgencyName() { return agencyName; }
    public void setAgencyName(String agencyName) throws RealEstateDataException {
        if (agencyName == null || agencyName.trim().isEmpty()) throw new RealEstateDataException("agencyName must not be empty");
        this.agencyName = agencyName.trim();
    }

    public String getLocation() { return location; }
    public void setLocation(String location) throws RealEstateDataException {
        if (location == null || location.trim().isEmpty()) throw new RealEstateDataException("location must not be empty");
        this.location = location.trim();
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws RealEstateDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) throw new RealEstateDataException("phoneNumber must be 10 digits");
        this.phoneNumber = phoneNumber;
    }
}
