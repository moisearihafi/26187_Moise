package _26187_.q4;

public class Room extends Hotel {
    private String roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(long id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                String roomNumber, String roomType, double pricePerNight) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);
        setRoomNumber(roomNumber);
        setRoomType(roomType);
        setPricePerNight(pricePerNight);
    }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) throws HotelDataException {
        if (roomNumber == null || roomNumber.trim().isEmpty()) throw new HotelDataException("roomNumber must not be empty");
        this.roomNumber = roomNumber.trim();
    }

    public String getRoomType() { return roomType; }
    public void setRoomType(String roomType) throws HotelDataException {
        if (roomType == null || roomType.trim().isEmpty()) throw new HotelDataException("roomType must not be empty");
        this.roomType = roomType.trim();
    }

    public double getPricePerNight() { return pricePerNight; }
    public void setPricePerNight(double pricePerNight) throws HotelDataException {
        if (pricePerNight <= 0) throw new HotelDataException("pricePerNight must be > 0");
        this.pricePerNight = pricePerNight;
    }
}
