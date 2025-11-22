package _26187_.q9;

public class Invoice extends Payment {
    private double totalFare;

    public Invoice(long id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType, String ticketNumber, double price, double baggageWeight, double baggageFee, String paymentDate, String paymentMode) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee, paymentDate, paymentMode);
        calculateTotalFare();
    }

    public double getTotalFare() { return totalFare; }

    public void calculateTotalFare() { this.totalFare = getPrice() + getBaggageFee(); }
}
