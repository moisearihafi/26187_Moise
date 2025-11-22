package _26187_.q4;

import java.util.Scanner;

public final class ReservationRecord extends Feedback {

    public ReservationRecord(long id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                             String roomNumber, String roomType, double pricePerNight,
                             String customerName, String customerEmail, String contactNumber,
                             String bookingDate, String checkInDate, String checkOutDate,
                             String serviceName, double serviceCost,
                             String paymentMethod, String paymentDate,
                             double roomCharge, double serviceCharge,
                             int rating, String comments) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate, roomCharge, serviceCharge, rating, comments);
    }

    public double generateBill() {
        return getTotalBill();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println(" Enter Entity (id createdDate updatedDate):");
            long id = Long.parseLong(sc.next());
            String createdDate = sc.next();
            String updatedDate = sc.next();

            System.out.println(" Enter Hotel (name address phone email):");
            String hotelName = sc.next();
            String address = sc.next();
            String phoneNumber = sc.next();
            String email = sc.next();

            System.out.println(" Enter Room (roomNumber roomType pricePerNight):");
            String roomNumber = sc.next();
            String roomType = sc.next();
            double pricePerNight = Double.parseDouble(sc.next());

            System.out.println(" Enter Customer (name email contact):");
            String customerName = sc.next();
            String customerEmail = sc.next();
            String contactNumber = sc.next();

            System.out.println(" Enter Booking (bookingDate checkInDate checkOutDate):");
            String bookingDate = sc.next();
            String checkInDate = sc.next();
            String checkOutDate = sc.next();

            System.out.println(" Enter Service (serviceName serviceCost):");
            String serviceName = sc.next();
            double serviceCost = Double.parseDouble(sc.next());

            System.out.println(" Enter Payment (method date):");
            String paymentMethod = sc.next();
            String paymentDate = sc.next();

            System.out.println(" Enter Charges (roomCharge serviceCharge):");
            double roomCharge = Double.parseDouble(sc.next());
            double serviceCharge = Double.parseDouble(sc.next());

            System.out.println(" Enter Feedback (rating comments):");
            int rating = Integer.parseInt(sc.next());
            String comments = sc.next();

            ReservationRecord rec = new ReservationRecord(id, createdDate, updatedDate, hotelName, address, phoneNumber, email,
                    roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, contactNumber,
                    bookingDate, checkInDate, checkOutDate,
                    serviceName, serviceCost,
                    paymentMethod, paymentDate,
                    roomCharge, serviceCharge,
                    rating, comments);

            System.out.println(" Hotel: " + rec.getHotelName());
            System.out.println(" Room: " + rec.getRoomNumber() + " (" + rec.getRoomType() + ") Price/night: " + String.format("%.2f", rec.getPricePerNight()));
            System.out.println(" Customer: " + rec.getCustomerName() + " (" + rec.getCustomerEmail() + ")");
            System.out.println(" Booking: " + rec.getBookingDate() + " Check-in: " + rec.getCheckInDate() + " Check-out: " + rec.getCheckOutDate());
            System.out.println(" Service: " + rec.getServiceName() + " Cost: " + String.format("%.2f", rec.getServiceCost()));
            System.out.println(" Payment: " + rec.getPaymentMethod() + " on " + rec.getPaymentDate());
            System.out.println(" Room Charge: " + String.format("%.2f", rec.getRoomCharge()));
            System.out.println(" Service Charge: " + String.format("%.2f", rec.getServiceCharge()));
            System.out.println("Total Bill: " + String.format("%.2f", rec.generateBill()));
            System.out.println(" Feedback: Rating " + rec.getRating() + " Comments: " + rec.getComments());

        } catch (HotelDataException hde) {
            System.out.println(" Error: " + hde.getMessage());
        } catch (Exception e) {
            System.out.println(" Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
