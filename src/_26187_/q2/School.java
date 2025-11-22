package _26187_.q2;

public class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(long id, String createdDate, String updatedDate, String schoolName, String address, String phoneNumber, String email) throws SchoolDataException {
        super(id, createdDate, updatedDate);
        setSchoolName(schoolName);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
    }

    public String getSchoolName() { return schoolName; }
    public void setSchoolName(String schoolName) throws SchoolDataException {
        if (schoolName == null || schoolName.trim().isEmpty()) throw new SchoolDataException("schoolName must not be empty");
        this.schoolName = schoolName.trim();
    }

    public String getAddress() { return address; }
    public void setAddress(String address) throws SchoolDataException {
        if (address == null || address.trim().isEmpty()) throw new SchoolDataException("address must not be empty");
        this.address = address.trim();
    }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) throws SchoolDataException {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) throw new SchoolDataException("phoneNumber must be 10 digits");
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) throws SchoolDataException {
        if (email == null || !email.matches("^\\S+@\\S+\\.\\S+$")) throw new SchoolDataException("invalid email format");
        this.email = email;
    }
}
