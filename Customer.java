package _26187_.q4;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;

    public Customer(long id, String createdDate, String updatedDate, String hotelName, String address, String phoneNumber, String email,
                    String roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber) throws HotelDataException {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email, roomNumber, roomType, pricePerNight);
        setCustomerName(customerName);
        setCustomerEmail(customerEmail);
        setContactNumber(contactNumber);
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) throws HotelDataException {
        if (customerName == null || customerName.trim().isEmpty()) throw new HotelDataException("customerName must not be empty");
        this.customerName = customerName.trim();
    }

    public String getCustomerEmail() { return customerEmail; }
    public void setCustomerEmail(String customerEmail) throws HotelDataException {
        if (customerEmail == null || !customerEmail.matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) throw new HotelDataException("customerEmail invalid");
        this.customerEmail = customerEmail;
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws HotelDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) throw new HotelDataException("contactNumber must be 10 digits");
        this.contactNumber = contactNumber;
    }
}
