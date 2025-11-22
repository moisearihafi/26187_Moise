package _26187_.q4;

public class Payment extends Service {
    private String paymentMethod;
    private String paymentDate;

    public Payment(long id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost,
                   String paymentMethod, String paymentDate) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost);
        setPaymentMethod(paymentMethod);
        setPaymentDate(paymentDate);
    }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) throws HotelDataException {
        if (paymentMethod == null || paymentMethod.trim().isEmpty()) throw new HotelDataException("paymentMethod must not be empty");
        this.paymentMethod = paymentMethod.trim();
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) throws HotelDataException {
        if (paymentDate == null || paymentDate.trim().isEmpty()) throw new HotelDataException("paymentDate must not be empty");
        this.paymentDate = paymentDate.trim();
    }
}
