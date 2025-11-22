package _26187_.q5;

public class Customer extends Vehicle {
    private String customerName;
    private String licenseNumber;
    private String contactNumber;

    public Customer(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber,
                    String branchName, String locationCode,
                    String vehicleType, String registrationNumber, double dailyRate,
                    String customerName, String licenseNumber, String contactNumber) throws RentalDataException {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode, vehicleType, registrationNumber, dailyRate);
        setCustomerName(customerName);
        setLicenseNumber(licenseNumber);
        setContactNumber(contactNumber);
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) throws RentalDataException {
        if (customerName == null || customerName.trim().isEmpty()) throw new RentalDataException("customerName must not be empty");
        this.customerName = customerName.trim();
    }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) throws RentalDataException {
        if (licenseNumber == null || licenseNumber.trim().isEmpty()) throw new RentalDataException("licenseNumber must not be empty");
        this.licenseNumber = licenseNumber.trim();
    }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) throws RentalDataException {
        if (contactNumber == null || !contactNumber.matches("\\d{10}")) throw new RentalDataException("contactNumber must be 10 digits");
        this.contactNumber = contactNumber;
    }
}
