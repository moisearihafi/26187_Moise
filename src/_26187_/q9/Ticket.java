package _26187_.q9;

public class Ticket extends Seat {
    private String ticketNumber;
    private double price;

    public Ticket(long id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType, String ticketNumber, double price) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType);
        setTicketNumber(ticketNumber);
        setPrice(price);
    }

    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) throws AirlineDataException { if (ticketNumber == null || ticketNumber.trim().isEmpty()) throw new AirlineDataException("ticketNumber must not be empty"); this.ticketNumber = ticketNumber.trim(); }

    public double getPrice() { return price; }
    public void setPrice(double price) throws AirlineDataException { if (price <= 0) throw new AirlineDataException("price must be > 0"); this.price = price; }
}
