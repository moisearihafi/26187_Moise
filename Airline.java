package _26187_.q9;

public class Airline extends Entity {
    private String airlineName;
    private String address;
    private String contactEmail;

    public Airline(long id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail) throws AirlineDataException {
        super(id, createdDate, updatedDate);
        setAirlineName(airlineName);
        setAddress(address);
        setContactEmail(contactEmail);
    }

    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) throws AirlineDataException { if (airlineName == null || airlineName.trim().isEmpty()) throw new AirlineDataException("airlineName must not be empty"); this.airlineName = airlineName.trim(); }

    public String getAddress() { return address; }
    public void setAddress(String address) throws AirlineDataException { if (address == null || address.trim().isEmpty()) throw new AirlineDataException("address must not be empty"); this.address = address.trim(); }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) throws AirlineDataException { if (contactEmail == null || !contactEmail.matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) throw new AirlineDataException("contactEmail invalid"); this.contactEmail = contactEmail; }
}
