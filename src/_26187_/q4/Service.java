package _26187_.q4;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service(long id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                   String roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String contactNumber,
                   String bookingDate, String checkInDate, String checkOutDate,
                   String serviceName, double serviceCost) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate);
        setServiceName(serviceName);
        setServiceCost(serviceCost);
    }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) throws HotelDataException {
        if (serviceName == null || serviceName.trim().isEmpty()) throw new HotelDataException("serviceName must not be empty");
        this.serviceName = serviceName.trim();
    }

    public double getServiceCost() { return serviceCost; }
    public void setServiceCost(double serviceCost) throws HotelDataException {
        if (serviceCost <= 0) throw new HotelDataException("serviceCost must be > 0");
        this.serviceCost = serviceCost;
    }
}
