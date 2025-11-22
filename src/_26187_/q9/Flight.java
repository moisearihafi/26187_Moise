package _26187_.q9;

public class Flight extends Airline {
    private String flightNumber;
    private String destination;
    private String departureTime;

    public Flight(long id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail);
        setFlightNumber(flightNumber);
        setDestination(destination);
        setDepartureTime(departureTime);
    }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) throws AirlineDataException { if (flightNumber == null || flightNumber.trim().isEmpty()) throw new AirlineDataException("flightNumber must not be empty"); this.flightNumber = flightNumber.trim(); }

    public String getDestination() { return destination; }
    public void setDestination(String destination) throws AirlineDataException { if (destination == null || destination.trim().isEmpty()) throw new AirlineDataException("destination must not be empty"); this.destination = destination.trim(); }

    public String getDepartureTime() { return departureTime; }
    public void setDepartureTime(String departureTime) throws AirlineDataException { if (departureTime == null || departureTime.trim().isEmpty()) throw new AirlineDataException("departureTime must not be empty"); this.departureTime = departureTime.trim(); }
}
