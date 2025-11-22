package _26187_.q4;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel(long id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email) throws HotelDataException {
        super(id, createdDate, updatedDate);
        setHotelName(hotelName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String getHotelName() { return hotelName; }
    public void setHotelName(String hotelName) throws HotelDataException {
        if (hotelName == null || hotelName.trim().isEmpty()) throw new HotelDataException("hotelName must not be empty");
        this.hotelName = hotelName.trim();
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws HotelDataException {
        if (address == null || address.trim().isEmpty()) throw new HotelDataException("address must not be empty");
        this.address = address.trim();
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws HotelDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) throw new HotelDataException("phoneNumber must be 10 digits");
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws HotelDataException {
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) throw new HotelDataException("email invalid");
        this.email = email;
    }
}
