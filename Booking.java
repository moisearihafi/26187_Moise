package _26187_.q4;

public class Booking extends Customer {
    private String bookingDate;
    private String checkInDate;
    private String checkOutDate;

    public Booking(long id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber);
        setBookingDate(bookingDate);
        setCheckInDate(checkInDate);
        setCheckOutDate(checkOutDate);
    }

    public String getBookingDate() { return bookingDate; }
    public void setBookingDate(String bookingDate) throws HotelDataException {
        if (bookingDate == null || bookingDate.trim().isEmpty()) throw new HotelDataException("bookingDate must not be empty");
        this.bookingDate = bookingDate.trim();
    }

    public String getCheckInDate() { return checkInDate; }
    public void setCheckInDate(String checkInDate) throws HotelDataException {
        if (checkInDate == null || checkInDate.trim().isEmpty()) throw new HotelDataException("checkInDate must not be empty");
        this.checkInDate = checkInDate.trim();
    }

    public String getCheckOutDate() { return checkOutDate; }
    public void setCheckOutDate(String checkOutDate) throws HotelDataException {
        if (checkOutDate == null || checkOutDate.trim().isEmpty()) throw new HotelDataException("checkOutDate must not be empty");
        this.checkOutDate = checkOutDate.trim();
    }
}
