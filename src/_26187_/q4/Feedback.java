package _26187_.q4;

public class Feedback extends Bill {
    private int rating;
    private String comments;

    public Feedback(long id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                    String roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber,
                    String bookingDate, String checkInDate, String checkOutDate,
                    String serviceName, double serviceCost,
                    String paymentMethod, String paymentDate,
                    double roomCharge, double serviceCharge,
                    int rating, String comments) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate, roomCharge, serviceCharge);
        setRating(rating);
        setComments(comments);
    }

    public int getRating() { return rating; }
    public void setRating(int rating) throws HotelDataException {
        if (rating < 1 || rating > 5) throw new HotelDataException("rating must be between 1 and 5");
        this.rating = rating;
    }

    public String getComments() { return comments; }
    public void setComments(String comments) throws HotelDataException {
        if (comments == null) throw new HotelDataException("comments must not be null");
        this.comments = comments.trim();
    }
}
