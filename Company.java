package _26187_.q3;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    public Company(long id, String createdDate, String updatedDate, String companyName, String address, String phoneNumber, String email) throws PayrollDataException {
        super(id, createdDate, updatedDate);
        setCompanyName(companyName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) throws PayrollDataException {
        if (companyName == null || companyName.trim().isEmpty()) throw new PayrollDataException("companyName must not be empty");
        this.companyName = companyName.trim();
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws PayrollDataException {
        if (address == null || address.trim().isEmpty()) throw new PayrollDataException("address must not be empty");
        this.address = address.trim();
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws PayrollDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) throw new PayrollDataException("phoneNumber must be 10 digits");
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws PayrollDataException {
        if (email == null || !email.matches("^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$")) throw new PayrollDataException("email invalid");
        this.email = email;
    }
}
