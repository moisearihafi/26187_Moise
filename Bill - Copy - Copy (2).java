package _26187_.q4;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    public Bill(long id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                String roomNumber, String roomType, double pricePerNight,
                String customerName, String customerEmail, String contactNumber,
                String bookingDate, String checkInDate, String checkOutDate,
                String serviceName, double serviceCost,
                String paymentMethod, String paymentDate,
                double roomCharge, double serviceCharge) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight, customerName, customerEmail, contactNumber, bookingDate, checkInDate, checkOutDate, serviceName, serviceCost, paymentMethod, paymentDate);
        setRoomCharge(roomCharge);
        setServiceCharge(serviceCharge);
        generateBill();
    }

    public double getRoomCharge() { return roomCharge; }
    public void setRoomCharge(double roomCharge) throws HotelDataException {
        if (roomCharge < 0) throw new HotelDataException("roomCharge must be >= 0");
        this.roomCharge = roomCharge;
    }

    public double getServiceCharge() { return serviceCharge; }
    public void setServiceCharge(double serviceCharge) throws HotelDataException {
        if (serviceCharge < 0) throw new HotelDataException("serviceCharge must be >= 0");
        this.serviceCharge = serviceCharge;
    }

    public double getTotalBill() { return totalBill; }
    public void generateBill() {
        this.totalBill = this.roomCharge + this.serviceCharge;
    }
}
