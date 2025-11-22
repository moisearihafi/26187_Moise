package _26187_.q9;

import java.util.Scanner;

public final class TicketRecord extends Invoice {

    public TicketRecord(long id, String createdDate, String updatedDate, String airlineName, String address, String contactEmail, String flightNumber, String destination, String departureTime, String passengerName, String passportNumber, String nationality, String seatNumber, String seatType, String ticketNumber, double price, double baggageWeight, double baggageFee, String paymentDate, String paymentMode) throws AirlineDataException {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, baggageWeight, baggageFee, paymentDate, paymentMode);
    }

    public double generateInvoice() { return getPrice() + getBaggageFee(); }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("25873 Enter Entity (id createdDate updatedDate):");
            long id = Long.parseLong(sc.next());
            String createdDate = sc.next();
            String updatedDate = sc.next();

            System.out.println("25873 Enter Airline (name address email):");
            String airlineName = sc.next();
            String address = sc.next();
            String email = sc.next();

            System.out.println("25873 Enter Flight (flightNumber destination departureTime):");
            String flightNumber = sc.next();
            String destination = sc.next();
            String departureTime = sc.next();

            System.out.println("25873 Enter Passenger (name passport nationality):");
            String passengerName = sc.next();
            String passportNumber = sc.next();
            String nationality = sc.next();

            System.out.println("25873 Enter Seat (seatNumber seatType):");
            String seatNumber = sc.next();
            String seatType = sc.next();

            System.out.println("25873 Enter Ticket (ticketNumber price):");
            String ticketNumber = sc.next();
            double price = Double.parseDouble(sc.next());

            System.out.println("25873 Enter Baggage (weight fee):");
            double weight = Double.parseDouble(sc.next());
            double fee = Double.parseDouble(sc.next());

            System.out.println("25873 Enter Payment (date mode):");
            String paymentDate = sc.next();
            String paymentMode = sc.next();

            TicketRecord rec = new TicketRecord(id, createdDate, updatedDate, airlineName, address, email, flightNumber, destination, departureTime, passengerName, passportNumber, nationality, seatNumber, seatType, ticketNumber, price, weight, fee, paymentDate, paymentMode);

            System.out.println("25873 Ticket Price: " + String.format("%.2f", rec.getPrice()));
            System.out.println("25873 Baggage Fee: " + String.format("%.2f", rec.getBaggageFee()));
            System.out.println("25873 Invoice Total: " + String.format("%.2f", rec.generateInvoice()));

        } catch (AirlineDataException ade) {
            System.out.println("25873 Error: " + ade.getMessage());
        } catch (Exception e) {
            System.out.println("25873 Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
