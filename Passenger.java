package _26187_.q9;

public class Passenger extends Flight {
    private String passengerName;
    private String passportNumber;
    private String nationality;

    public Passenger(long id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime, String passengerName, String passportNumber, String nationality) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime);
        setPassengerName(passengerName);
        setPassportNumber(passportNumber);
        setNationality(nationality);
    }

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) throws AirlineDataException { if (passengerName == null || passengerName.trim().isEmpty()) throw new AirlineDataException("passengerName must not be empty"); this.passengerName = passengerName.trim(); }

    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) throws AirlineDataException { if (passportNumber == null || passportNumber.trim().isEmpty()) throw new AirlineDataException("passportNumber must not be empty"); this.passportNumber = passportNumber.trim(); }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) throws AirlineDataException { if (nationality == null || nationality.trim().isEmpty()) throw new AirlineDataException("nationality must not be empty"); this.nationality = nationality.trim(); }
}
